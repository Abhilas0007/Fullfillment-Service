package com.fullfillmentService.FulfillmentService.service;

import com.fullfillmentService.FulfillmentService.dto.ResponseDto;
import org.springframework.http.ResponseEntity;

public interface IFullfillment {
    ResponseEntity<ResponseDto> addInventory(int productId, int amount);

    ResponseEntity<ResponseDto> removeInventory(int productId);

    ResponseEntity<ResponseDto> viewInventory();
}
