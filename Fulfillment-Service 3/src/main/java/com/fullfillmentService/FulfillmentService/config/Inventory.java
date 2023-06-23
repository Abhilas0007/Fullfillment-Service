package com.fullfillmentService.FulfillmentService.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Getter
@Setter
@Component
public class Inventory {
    HashMap<Integer,Integer> productDetailMap = new HashMap<>();
}
