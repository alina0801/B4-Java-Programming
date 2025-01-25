package day33_a_static;
// Template Class
public class Iphone {

    // Instance Variables
    String model;
    double price;


    // Static variables
    static String company;
    static String os;
    static String appleDay;


    // Constructor - helps to initialize instance variables
    public Iphone(String model, double price) {
        this.model = model;
        this.price = price;
    }


    // Static Block - static initialization
    static {
        System.out.println("STATIC BLOCK RUN:");
        // model = "Iphone PRO"; // NOT VALID - static ONLY accepts static
        company = "Apple";
        os = "IOS";
        appleDay = "November 30th";
    }


    // Instance method - special one
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}' +
                " -- " +
                "Company: " + company +
                ", OS: " + os +
                ", Apple Day: " + appleDay;

    }
}
