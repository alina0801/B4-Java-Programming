package day38_a_abstraction_interface.shopping;

public class Runner {

    public static void main(String[] args) {

        // Abstract class canNOT be instantiated/ cant create  object of abstract class

        // Shopping s = new Shopping();

        //OnlineShopping os = new OnlineShopping();

        // Interface canNOT be instantiated/no object can be created from interface

        //Shipping shipping = new Shipping();


        // Can I create object of Target Class?

        Target target = new Target();
        target.buyItem();
        target.returnItem();
        System.out.println(target.price);

        System.out.println("---------------------");

        // Can I create object of Amazon Class?

        Amazon amazon = new Amazon();
        System.out.println(amazon.COUNTRY); // Not a good practice to call this way

        amazon.deliveryEstimate();
        amazon.buyItem();
        amazon.returnItem();
        amazon.shippingCost(true);
        System.out.println(amazon.price);

        System.out.println("---------------------");

        System.out.println(Shipping.COUNTRY);
        System.out.println(Amazon.COUNTRY);
        System.out.println(OnlineShopping.COUNTRY);


    }
}
