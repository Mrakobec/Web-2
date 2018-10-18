package com.company.web2.web.order;

import com.company.web2.entity.OrderStatus;
import com.company.web2.service.OrderService;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.web2.entity.Order;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;

public class OrderEdit extends AbstractEditor<Order> {
    @Inject
    private OrderService orderService;

    @Override
    protected boolean preCommit() {
        Order order = getItem();
        order.setAmount(orderService.calculateAmount(order));
        return super.preCommit();
    }

    @Override
    protected void initNewItem(Order item) {
        super.initNewItem(item);
        item.setStatus(OrderStatus.NEW);
    }
}