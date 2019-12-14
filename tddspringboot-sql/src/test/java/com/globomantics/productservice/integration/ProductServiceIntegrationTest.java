package com.globomantics.productservice.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.database.rider.core.api.connection.ConnectionHolder;
import com.github.database.rider.junit5.DBUnitExtension;
import com.globomantics.productservice.model.Product;
import com.globomantics.productservice.repository.ProductRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import javax.sql.DataSource;

import java.sql.SQLException;

import static com.globomantics.productservice.TestingSqlQueries.CREATE_TABLE;
import static com.globomantics.productservice.TestingSqlQueries.DROP_TABLE;
import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith({DBUnitExtension.class, SpringExtension.class})
@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
class ProductServiceIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private DataSource dataSource;

    @Autowired
    ObjectMapper mapper;

    @Autowired
    private ProductRepository repository;

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

    static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ConnectionHolder getConnectionHolder() {
        // Return a function that retrieves a connection from our data source
        return () -> dataSource.getConnection();
    }

    @Test
    @DisplayName("GET /product/1 - Found")
    
    void testGetProductByIdFound() throws Exception {
        // Execute the GET request
        mockMvc.perform(get("/product/{id}", 1))

            // Validate the response code and content type
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))

            // Validate the headers
            .andExpect(header().string(HttpHeaders.ETAG, "\"1\""))
            .andExpect(header().string(HttpHeaders.LOCATION, "/product/1"))

            // Validate the returned fields
            .andExpect(content().json(mapper.writeValueAsString(repository.findById(1))));
    }

    @Test
    @DisplayName("GET /product/99 - Not Found")
    void testGetProductByIdNotFound() throws Exception {
        // Execute the GET request
        mockMvc.perform(get("/product/{id}", 99))

            // Validate that we get a 404 Not Found response
            .andExpect(status().isNotFound());
    }

    @Test
    @DisplayName("POST /product - Success")
    void testCreateProduct() throws Exception {
        // Setup product to create
        Product postProduct = new Product("Product Name", 10);

        mockMvc.perform(post("/product")
            .contentType(MediaType.APPLICATION_JSON)
            .content(asJsonString(postProduct)))

            // Validate the response code and content type
            .andExpect(status().isCreated())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))

            // Validate the headers
            .andExpect(header().string(HttpHeaders.ETAG, "\"1\""))
            .andExpect(header().exists(HttpHeaders.LOCATION))

            // Validate the returned fields
            .andExpect(jsonPath("$.id", any(Integer.class)))
            .andExpect(jsonPath("$.name", is("Product Name")))
            .andExpect(jsonPath("$.quantity", is(10)))
            .andExpect(jsonPath("$.version", is(1)));
    }

    @Test
    @DisplayName("PUT /product/2 - Success")
    void testProductPutSuccess() throws Exception {
        // Setup product to update
        Product putProduct = new Product("Product 2 Updated", 10);

        mockMvc.perform(put("/product/{id}", 2)
            .contentType(MediaType.APPLICATION_JSON)
            .header(HttpHeaders.IF_MATCH, 2)
            .content(asJsonString(putProduct)))

            // Validate the response code and content type
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))

            // Validate the headers
            .andExpect(header().string(HttpHeaders.ETAG, "\"3\""))
            .andExpect(header().string(HttpHeaders.LOCATION, "/product/2"))

            // Validate the returned fields
            .andExpect(jsonPath("$.id", is(2)))
            .andExpect(jsonPath("$.name", is("Product 2 Updated")))
            .andExpect(jsonPath("$.quantity", is(10)))
            .andExpect(jsonPath("$.version", is(3)));
    }

    @Test
    @DisplayName("PUT /product/1 - Version Mismatch")
    void testProductPutVersionMismatch() throws Exception {
        // Setup product to update
        Product putProduct = new Product("Product Name", 10);

        mockMvc.perform(put("/product/{id}", 1)
            .contentType(MediaType.APPLICATION_JSON)
            .header(HttpHeaders.IF_MATCH, 7)
            .content(asJsonString(putProduct)))

            // Validate the response code and content type
            .andExpect(status().isConflict());
    }

    @Test
    @DisplayName("PUT /product/99 - Not Found")
    void testProductPutNotFound() throws Exception {
        // Setup product to update
        Product putProduct = new Product("Product Name", 10);

        mockMvc.perform(put("/product/{id}", 99)
            .contentType(MediaType.APPLICATION_JSON)
            .header(HttpHeaders.IF_MATCH, 1)
            .content(asJsonString(putProduct)))

            // Validate the response code and content type
            .andExpect(status().isNotFound());
    }
    @Test
    @DisplayName("DELETE /product/1 - Success")
    
    void testProductDeleteSuccess() throws Exception {
        // Execute our DELETE request
        mockMvc.perform(delete("/product/{id}", 1))
            .andExpect(status().isOk());
    }

    @Test
    @DisplayName("DELETE /product/99 - Not Found")
    void testProductDeleteNotFound() throws Exception {
        // Execute our DELETE request
        mockMvc.perform(delete("/product/{id}", 99))
            .andExpect(status().isNotFound());
    }
}
