package day38_a_abstraction_interface.shopping;
// Concrete Class
public class Target extends Shopping {
// this methods have to be more accessible than the parent
    @Override
    public void buyItem() {
        System.out.println("Buying item from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Target");

    }
}
