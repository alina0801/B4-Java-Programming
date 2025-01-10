package day38_b_polymorphism;

public class Reptile extends Animal {

    // String name;
    int numOfLegs;
    @Override
    public void eat(){
        System.out.println("Reptile eating...");
    }
}
