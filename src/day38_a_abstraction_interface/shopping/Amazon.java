package day38_a_abstraction_interface.shopping;

public class Amazon extends OnlineShopping implements Shipping {

    @Override
    public void deliveryEstimate() {

    }

    @Override
    public void buyItem() {

    }

    @Override
    public void returnItem() {

    }

    @Override
    public void shippingCost(boolean hasMembership) {
        System.out.println(hasMembership ? "has membership, no shipping cost" : "no membership, fee for shipping will be added");
    }
}
