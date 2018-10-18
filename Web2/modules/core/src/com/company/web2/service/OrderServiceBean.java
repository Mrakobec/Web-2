package com.company.web2.service;

import com.company.web2.entity.Order;
import com.company.web2.entity.Sparepart;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service(OrderService.NAME)
public class OrderServiceBean implements OrderService {

    @Override
    public BigDecimal calculateAmount(Order order) {
        BigDecimal amount = new BigDecimal(0);
        if (order.getHoursspent() != null) {
            amount = amount.add(new BigDecimal(order.getHoursspent())
                    .multiply(order.getMechanic().getHourlyRate()));
        }
        if (order.getSpareparts() != null) {
            for (Sparepart part : order.getSpareparts()) {
                amount = amount.add(part.getPrice());
            }
        }
        return amount;
    }
}