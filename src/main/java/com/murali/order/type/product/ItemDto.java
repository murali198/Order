package com.murali.order.type.product;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Builder
@Getter
@ToString
public class ItemDto {
    private ProductDto product;
    private BigDecimal quantity;

}
