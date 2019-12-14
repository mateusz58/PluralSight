package com.globomantics.productservice.repository;

import com.github.database.rider.core.api.connection.ConnectionHolder;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.junit5.DBUnitExtension;
import com.globomantics.productservice.model.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import static com.globomantics.productservice.TestingSqlQueries.CREATE_TABLE;
import static com.globomantics.productservice.TestingSqlQueries.DROP_TABLE;

@ExtendWith({DBUnitExtension.class, SpringExtension.class})
@SpringBootTest
@ActiveProfiles("test")
public class ProductRepositoryTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private ProductRepository repository;

    public ConnectionHolder getConnectionHolder() {
        return () -> dataSource.getConnection();
    }

    @BeforeEach
    void init() throws SQLException {
        dataSource.getConnection().prepareStatement(CREATE_TABLE).executeUpdate();
        dataSource.getConnection().prepareStatement("INSERT INTO products(name,quantity,version) VALUES ('Product 1', 10,1)").executeUpdate();
        dataSource.getConnection().prepareStatement("INSERT INTO products(name,quantity,version) VALUES ('Product 2', 5,2);").executeUpdate();
    }

    @AfterEach
    void finish() throws SQLException {
        dataSource.getConnection().prepareStatement("TRUNCATE products").execute();
        dataSource.getConnection().prepareStatement(DROP_TABLE).execute();
    }

    @Test
    void testFindAll() {
        List<Product> products = repository.findAll();
        Assertions.assertEquals(2, products.size(), "We should have 2 products in our database");
    }

    @Test
    void testFindByIdSuccess() {
        // Find the product with ID 2
        Optional<Product> product = repository.findById(2);

        // Validate that we found it
        Assertions.assertTrue(product.isPresent(), "Product with ID 2 should be found");

        // Validate the product values
        Product p = product.get();
        Assertions.assertEquals(2, p.getId().intValue(), "Product ID should be 2");
        Assertions.assertEquals("Product 2", p.getName(), "Product name should be \"Product 2\"");
        Assertions.assertEquals(5, p.getQuantity().intValue(), "Product quantity should be 5");
        Assertions.assertEquals(2, p.getVersion().intValue(), "Product version should be 2");
    }

    @Test
    void testFindByIdNotFound() {
        // Find the product with ID 2
        Optional<Product> product = repository.findById(3);

        // Validate that we found it
        Assertions.assertFalse(product.isPresent(), "Product with ID 3 should be not be found");
    }

    @Test
    void testSave() {
        // Create a new product and save it to the database
        Product product = new Product("Product 5", 5);
        product.setVersion(1);
        Product savedProduct = repository.save(product);

        // Validate the saved product
        Assertions.assertEquals("Product 5", savedProduct.getName());
        Assertions.assertEquals(5, savedProduct.getQuantity().intValue());

        // Validate that we can get it back out of the database
        Optional<Product> loadedProduct = repository.findById(savedProduct.getId());
        Assertions.assertTrue(loadedProduct.isPresent(), "Could not reload product from the database");
        Assertions.assertEquals("Product 5", loadedProduct.get().getName(), "Product name does not match");
        Assertions.assertEquals(5, loadedProduct.get().getQuantity().intValue(), "Product quantity does not match");
        Assertions.assertEquals(1, loadedProduct.get().getVersion().intValue(), "Product version is incorrect");
    }

    @Test
    void testUpdateSuccess() {
        // Update product 1's name, quantity, and version
        Product product = new Product(1, "This is product 1", 100, 5);
        boolean result  = repository.update(product);

        // Validate that our product is returned by update()
        Assertions.assertTrue(result, "The product should have been updated");

        // Retrieve product 1 from the database and validate its fields
        Optional<Product> loadedProduct = repository.findById(1);
        Assertions.assertTrue(loadedProduct.isPresent(), "Updated product should exist in the database");
        Assertions.assertEquals("This is product 1", loadedProduct.get().getName(), "The product name does not match");
        Assertions.assertEquals(100, loadedProduct.get().getQuantity().intValue(), "The quantity should now be 100");
        Assertions.assertEquals(5, loadedProduct.get().getVersion().intValue(), "The version should now be 5");
    }

    @Test
    void testUpdateFailure() {
        // Update product 1's name, quantity, and version
        Product product = new Product(3, "This is product 3", 100, 5);
        boolean result = repository.update(product);

        // Validate that our product is returned by update()
        Assertions.assertFalse(result, "The product should not have been updated");
    }

    @Test
    void testDeleteSuccess() {
        boolean result = repository.delete(1);
        Assertions.assertTrue(result, "Delete should return true on success");

        // Validate that the product has been deleted
        Optional<Product> product = repository.findById(1);
        Assertions.assertFalse(product.isPresent(), "Product with ID 1 should have been deleted");
    }

    @Test
    void testDeleteFailure() {
        boolean result = repository.delete(3);
        Assertions.assertFalse(result, "Delete should return false because the deletion failed");
    }
}
