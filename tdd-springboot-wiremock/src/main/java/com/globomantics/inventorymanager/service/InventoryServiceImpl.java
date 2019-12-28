package com.globomantics.inventorymanager.service;

import com.globomantics.inventorymanager.model.InventoryRecord;
import com.globomantics.inventorymanager.model.PurchaseRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Value("${inventorymanager.baseUrl}")
    private String baseUrl;

    
    RestTemplate restTemplate = new RestTemplate();

    @Override
    public Optional<InventoryRecord> getInventoryRecord(Integer productId) {
        try {
            
            return Optional.of(restTemplate.getForObject(baseUrl + "/" + productId, InventoryRecord.class));
        } catch (HttpClientErrorException e) {
            
            return Optional.empty();
        }
    }

    @Override
    public Optional<InventoryRecord> purchaseProduct(Integer productId, Integer quantity) {
        try {
            return Optional.of(restTemplate.postForObject(baseUrl + "/" + productId + "/purchaseRecord",
                    new PurchaseRecord(productId, quantity),
                    InventoryRecord.class));
        } catch (HttpClientErrorException e) {
            return Optional.empty();
        }
    }
}
