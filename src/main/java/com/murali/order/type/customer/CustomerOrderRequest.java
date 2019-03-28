package com.murali.order.type.customer;

import com.murali.order.type.product.ItemRequest;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class CustomerOrderRequest {

    private String customerId;
    private String externalReference;
    private LocalDateTime createdDate;
    private List<ItemRequest> items;
}
