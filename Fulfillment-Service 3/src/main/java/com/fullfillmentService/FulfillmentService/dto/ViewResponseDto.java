package com.fullfillmentService.FulfillmentService.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Getter
@Setter
@Component
public class ViewResponseDto extends ResponseDto {
    public ViewResponseDto(String message,Object data) {
        super.setMessage(message);
        super.setData(data);
    }
}
