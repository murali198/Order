package com.murali.order.type.product;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ItemRequest {

    private Long productId;
    private BigDecimal quantity;
}
