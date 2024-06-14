package dip.solution.util;

import dip.old.entity.Product;

public class DeliveryDriver implements DeliveryService{

    @Override
    public void sendDelivery(Product product){
        System.out.println("Deliverying product : "+product.getName());
    }
}
