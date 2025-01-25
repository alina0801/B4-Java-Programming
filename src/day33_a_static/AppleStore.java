package day33_a_static;

public class AppleStore {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("Iphone 16 Pro", 1099.99);
        System.out.println(iphone1);
        Iphone iphone2 = new Iphone("Iphone 16 ProMax", 1299.99);
        System.out.println(iphone2);

        System.out.println(Iphone.company);
        System.out.println(Iphone.os);
        System.out.println(Iphone.appleDay);

    }
}