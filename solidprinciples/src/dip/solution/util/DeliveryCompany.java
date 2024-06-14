package dip.solution.util;

import dip.old.entity.Product;

public class DeliveryCompany {

    DeliveryService deliveryService;

    public DeliveryCompany(DeliveryService deliveryService){
        this.deliveryService = deliveryService;
    }

    public void dispatchDelivery(Product product) {
        this.deliveryService.sendDelivery(product);
    }
}
