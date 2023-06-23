package com.fullfillmentService.FulfillmentService.config;

import com.fullfillmentService.FulfillmentService.dto.AddResponseDto;
import com.fullfillmentService.FulfillmentService.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class AddInventory {
    @Autowired
    Inventory inventory;
    public ResponseEntity<ResponseDto> add(int productId, int amount) {
        if(inventory.productDetailMap.containsKey(productId))
            inventory.productDetailMap.put(productId,inventory.productDetailMap.get(productId)+amount);
        else
            inventory.productDetailMap.put(productId,amount);
        return new ResponseEntity<>(new AddResponseDto("Item Added Successfully",productId), HttpStatus.OK);
    }
}
