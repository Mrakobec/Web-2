package com.company.web2.web.order;

import com.company.web2.entity.Order;
import com.company.web2.entity.OrderStatus;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.data.GroupDatasource;

import javax.inject.Inject;
import java.util.UUID;

public class OrderBrowse extends AbstractLookup {
    @Inject
    private GroupDatasource<Order, UUID> ordersDs;

    public void onExcelBtnClick() {
    }
    public void onBtnNewStatusClick(Component source) {
        Order selectedItem = ordersDs.getItem();
        if (selectedItem != null) {
            selectedItem.setStatus(OrderStatus.NEW);
            ordersDs.commit();
        }
    }
    public void onSetAsNewBtnClick() {
    }
}