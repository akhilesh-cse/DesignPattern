import dip.old.entity.Product;
import dip.old.util.DeliveryCompany;

public class DeliveryOldApp {
    public static void main(String[] args) {

        DeliveryCompany deliveryCompany = new DeliveryCompany();
        Product product = new Product("Book");

        deliveryCompany.dispatchDelivery(product);

        System.out.println("Dependency Inversion principle violation");
    }
}