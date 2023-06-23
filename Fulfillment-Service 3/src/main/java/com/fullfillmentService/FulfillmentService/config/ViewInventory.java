package com.fullfillmentService.FulfillmentService.config;

import com.fullfillmentService.FulfillmentService.dto.ResponseDto;
import com.fullfillmentService.FulfillmentService.dto.ViewResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ViewInventory {
    @Autowired
    Inventory inventory;
    public ResponseEntity<ResponseDto> view() {
        if(!inventory.productDetailMap.isEmpty()) {
            return new ResponseEntity<>(new ViewResponseDto("Please see the inventory details",inventory.productDetailMap), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(new ViewResponseDto("Inventory Empty",null), HttpStatus.BAD_REQUEST);
        }
    }
}
