package com.company.web2.service;


import com.company.web2.entity.Order;

import java.math.BigDecimal;

public interface OrderService {
    String NAME = "web2_OrderService";
    BigDecimal calculateAmount (Order order);   
}