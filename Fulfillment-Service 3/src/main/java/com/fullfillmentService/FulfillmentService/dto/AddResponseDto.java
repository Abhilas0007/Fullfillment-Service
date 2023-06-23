package com.fullfillmentService.FulfillmentService.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Getter
@Setter
@Component
public class AddResponseDto extends ResponseDto{
    public AddResponseDto(String message,Object data) {
        super.setMessage(message);
        super.setData(data);
    }
}
