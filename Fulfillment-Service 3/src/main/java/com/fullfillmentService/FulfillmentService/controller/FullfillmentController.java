package com.fullfillmentService.FulfillmentService.controller;

import com.fullfillmentService.FulfillmentService.dto.ResponseDto;
import com.fullfillmentService.FulfillmentService.service.IFullfillment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class FullfillmentController {

    private final IFullfillment iFullfillment;

    public FullfillmentController(IFullfillment iFullfillment) {
        this.iFullfillment = iFullfillment;
    }


    @PutMapping("/add/{productId}/{amount}")
    public ResponseEntity<ResponseDto> addInventory(@PathVariable int productId, @PathVariable int amount) {
        return iFullfillment.addInventory(productId,amount);
    }

    @GetMapping("/remove/{productId}")
    public ResponseEntity<ResponseDto> removeInventory(@PathVariable int productId) {
        return iFullfillment.removeInventory(productId);
    }

    @GetMapping("/view")
    public ResponseEntity<ResponseDto> viewInventory() {
        return iFullfillment.viewInventory();
    }
}
