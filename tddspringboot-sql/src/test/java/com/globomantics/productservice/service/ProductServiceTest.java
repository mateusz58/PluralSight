package com.globomantics.productservice.service;

import com.globomantics.productservice.model.Product;
import com.globomantics.productservice.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class ProductServiceTest {

    
    @Autowired
    private ProductService service;

    Product mockProduct = new Product(1, "Product Name", 10, 1);

    
    @MockBean
    private ProductRepository repository;

    @Test
    @DisplayName("Test findById Success")
    void testFindByIdSuccess() {
       doReturn(Optional.of(mockProduct)).when(repository).findById(mockProduct.getId());

       Optional<Product>actual = service.findById(mockProduct.getId());

       Assertions.assertEquals(mockProduct.getId(),actual.get().getId());
    }

    @Test
    @DisplayName("Test findById Not Found")
    void testFindByIdNotFound() {
        
        Product mockProduct = new Product(1, "Product Name", 10, 1);
        doReturn(Optional.empty()).when(repository).findById(1);

        
        Optional<Product> returnedProduct = service.findById(1);

        
        Assertions.assertFalse(returnedProduct.isPresent(), "Product was found, when it shouldn't be");
    }

    @Test
    @DisplayName("Test findAll")
    void testFindAll() {
        
        Product mockProduct = new Product(1, "Product Name", 10, 1);
        Product mockProduct2 = new Product(2, "Product Name 2", 15, 3);
        doReturn(Arrays.asList(mockProduct, mockProduct2)).when(repository).findAll();

        
        List<Product> products = service.findAll();

        Assertions.assertEquals(2, products.size(), "findAll should return 2 products");
    }

    @Test
    @DisplayName("Test save product")
    void testSave() {
        Product mockProduct = new Product(1, "Product Name", 10);
        doReturn(mockProduct).when(repository).save(any());

        Product returnedProduct = service.save(mockProduct);

        Assertions.assertNotNull(returnedProduct, "The saved product should not be null");
        Assertions.assertEquals(1, returnedProduct.getVersion().intValue(),
            "The version for a new product should be 1");
    }
}
