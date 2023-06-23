package com.fullfillmentService.FulfillmentService.service;

import com.fullfillmentService.FulfillmentService.config.AddInventory;
import com.fullfillmentService.FulfillmentService.config.Inventory;
import com.fullfillmentService.FulfillmentService.config.RemoveInventory;
import com.fullfillmentService.FulfillmentService.config.ViewInventory;
import com.fullfillmentService.FulfillmentService.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FullfillmentService implements IFullfillment {
    @Autowired
    Inventory inventory;
    @Autowired
    private AddInventory addInventory;

    @Autowired
    private RemoveInventory removeInventory;

    @Autowired
    private ViewInventory viewInventory;
    @Override
    public ResponseEntity<ResponseDto> addInventory(int productId, int amount) {
        return addInventory.add(productId, amount);
    }

    @Override
    public ResponseEntity<ResponseDto> removeInventory(int productId) {
        return removeInventory.remove(productId);
    }

    @Override
    public ResponseEntity<ResponseDto> viewInventory() {
        return viewInventory.view();
    }
}
