package day39_a_polymorphysm.cloth;

// Concrete Class
public class Jacket extends Clothes implements HasHood {

    @Override
    public void putOnHood() {
        System.out.println("Putting on Jacket's Hoody...");
    }

    @Override
    public void wearClothes() {
        System.out.println("Wearing Jacket...");
    }
}
