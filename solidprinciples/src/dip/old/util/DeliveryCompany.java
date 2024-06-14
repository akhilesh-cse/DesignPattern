package dip.old.util;

import dip.old.entity.Product;

public class DeliveryCompany {

    public void dispatchDelivery(Product product){
        DeliveryDriver deliveryDriver = new DeliveryDriver();  //tight coupling,DeliveryCompany is directly dependent on DeliveryDriver class
        deliveryDriver.sendDelivery(product);
    }
}
