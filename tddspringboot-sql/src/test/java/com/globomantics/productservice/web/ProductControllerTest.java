package com.globomantics.productservice.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.globomantics.productservice.model.Product;
import com.globomantics.productservice.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class ProductControllerTest {
    @MockBean
    private ProductService service;

    private Product mockProduct = new Product(1,"Product",10,1);
    private final String url = "/product/";

    @Autowired
    private MockMvc mockMvc;


    @Autowired
    private ObjectMapper objectMapper;

    static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("GET /product/1 - Found")
    void testGetProductByIdFound() throws Exception {

        
       doReturn(Optional.of(mockProduct)).when(service).findById(mockProduct.getId());

       
        mockMvc.perform(get(String.format("%s%d", url,mockProduct.getId())))
            
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))

            
            .andExpect(header().string(HttpHeaders.ETAG, "\"1\""))
            .andExpect(header().string(HttpHeaders.LOCATION, String.format("%s%d", url,mockProduct.getId())))

            
            .andExpect(content().json(objectMapper.writeValueAsString(mockProduct)));
    }
    @Test
    @DisplayName("GET /product/1 - Not Found")
    void testGetProductByIdNotFound() throws Exception {
        
        doReturn(Optional.empty()).when(service).findById(1);

        
        mockMvc.perform(get("/product/{id}", 1))

            
            .andExpect(status().isNotFound());
    }

    @Test
    @DisplayName("POST /product - Success")
    void testCreateProduct() throws Exception {
        
        Product postProduct = new Product("Product Name", 10);
        Product mockProduct = new Product(1, "Product Name", 10, 1);
        doReturn(mockProduct).when(service).save(any());

        mockMvc.perform(post("/product")
            .contentType(MediaType.APPLICATION_JSON)
            .content(asJsonString(postProduct)))

            
            .andExpect(status().isCreated())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))

            
            .andExpect(header().string(HttpHeaders.ETAG, "\"1\""))
            .andExpect(header().string(HttpHeaders.LOCATION, "/product/1"))

            
            .andExpect(jsonPath("$.id", is(1)))
            .andExpect(jsonPath("$.name", is("Product Name")))
            .andExpect(jsonPath("$.quantity", is(10)))
            .andExpect(jsonPath("$.version", is(1)));
    }

    @Test
    @DisplayName("PUT /product/1 - Success")
    void testProductPutSuccess() throws Exception {
        
        Product putProduct = new Product("Product Name", 10);
        Product mockProduct = new Product(1, "Product Name", 10, 1);
        doReturn(Optional.of(mockProduct)).when(service).findById(1);
        doReturn(true).when(service).update(any());

        mockMvc.perform(put("/product/{id}", 1)
            .contentType(MediaType.APPLICATION_JSON)
            .header(HttpHeaders.IF_MATCH, 1)
            .content(asJsonString(putProduct)))

            
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))

            
            .andExpect(header().string(HttpHeaders.ETAG, "\"2\""))
            .andExpect(header().string(HttpHeaders.LOCATION, "/product/1"))

            
            .andExpect(jsonPath("$.id", is(1)))
            .andExpect(jsonPath("$.name", is("Product Name")))
            .andExpect(jsonPath("$.quantity", is(10)))
            .andExpect(jsonPath("$.version", is(2)));
    }

    @Test
    @DisplayName("PUT /product/1 - Version Mismatch")
    void testProductPutVersionMismatch() throws Exception {
        
        Product putProduct = new Product("Product Name", 10);
        Product mockProduct = new Product(1, "Product Name", 10, 2);
        doReturn(Optional.of(mockProduct)).when(service).findById(1);
        doReturn(true).when(service).update(any());

        mockMvc.perform(put("/product/{id}", 1)
            .contentType(MediaType.APPLICATION_JSON)
            .header(HttpHeaders.IF_MATCH, 1)
            .content(asJsonString(putProduct)))

            
            .andExpect(status().isConflict());
    }

    @Test
    @DisplayName("PUT /product/1 - Not Found")
    void testProductPutNotFound() throws Exception {
        
        Product putProduct = new Product("Product Name", 10);
        doReturn(Optional.empty()).when(service).findById(1);

        mockMvc.perform(put("/product/{id}", 1)
            .contentType(MediaType.APPLICATION_JSON)
            .header(HttpHeaders.IF_MATCH, 1)
            .content(asJsonString(putProduct)))

            
            .andExpect(status().isNotFound());
    }

    @Test
    @DisplayName("DELETE /product/1 - Success")
    void testProductDeleteSuccess() throws Exception {
        
        Product mockProduct = new Product(1, "Product Name", 10, 1);

        
        doReturn(Optional.of(mockProduct)).when(service).findById(1);
        doReturn(true).when(service).delete(1);

        
        mockMvc.perform(delete("/product/{id}", 1))
            .andExpect(status().isOk());
    }

    @Test
    @DisplayName("DELETE /product/1 - Not Found")
    void testProductDeleteNotFound() throws Exception {
        
        doReturn(Optional.empty()).when(service).findById(1);

        
        mockMvc.perform(delete("/product/{id}", 1))
            .andExpect(status().isNotFound());
    }

    @Test
    @DisplayName("DELETE /product/1 - Failure")
    void testProductDeleteFailure() throws Exception {
        
        Product mockProduct = new Product(1, "Product Name", 10, 1);

        
        doReturn(Optional.of(mockProduct)).when(service).findById(1);
        doReturn(false).when(service).delete(1);

        
        mockMvc.perform(delete("/product/{id}", 1))
            .andExpect(status().isInternalServerError());
    }

}
