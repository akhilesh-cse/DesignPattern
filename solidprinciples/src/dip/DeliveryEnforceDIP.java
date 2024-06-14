package dip;

import dip.old.entity.Product;
import dip.solution.util.DeliveryCompany;
import dip.solution.util.DeliveryDriver;
import dip.solution.util.DeliveryService;

public class DeliveryEnforceDIP {

    public static void main(String args[]){
        Product product = new Product("Bike");

        DeliveryService deliveryService = new DeliveryDriver();
        DeliveryCompany deliveryCompany = new DeliveryCompany(deliveryService);

        deliveryCompany.dispatchDelivery(product);
    }
}
