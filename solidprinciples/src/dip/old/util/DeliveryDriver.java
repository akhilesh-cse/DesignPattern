package dip.old.util;

import dip.old.entity.Product;

public class DeliveryDriver {

    public void sendDelivery(Product product){
        System.out.println("Deliverying the product : "+product.getName());
    }
}
