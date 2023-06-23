package com.fullfillmentService.FulfillmentService.config;

import com.fullfillmentService.FulfillmentService.dto.RemoveResponseDto;
import com.fullfillmentService.FulfillmentService.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class RemoveInventory {

    @Autowired
    Inventory inventory;
    public ResponseEntity<ResponseDto> remove(int productId) {
        if(inventory.productDetailMap.containsKey(productId)) {
            if(inventory.productDetailMap.get(productId)>1) {
                inventory.productDetailMap.put(productId,inventory.productDetailMap.get(productId)-1);
            }
            else
                inventory.productDetailMap.remove(productId);
            if(inventory.productDetailMap.containsKey(productId)) {
                if (inventory.productDetailMap.get(productId) == 0)
                    inventory.productDetailMap.remove(productId);
            }
            return new ResponseEntity<>(new RemoveResponseDto("Item Removed",productId), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(new RemoveResponseDto("Item Not Present",productId), HttpStatus.BAD_REQUEST);
        }
    }
}
