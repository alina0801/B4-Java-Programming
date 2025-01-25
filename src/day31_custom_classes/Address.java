package day31_custom_classes;

public class Address {

    String street;
    String city;
    String state;
    int zipCode;


//    public Address (String inputStreet, String inputCity, String inputState, int inputZipCode ) {
//        street = inputStreet;
//        city = inputCity;
//        state = inputState;
//        zipCode = inputZipCode;
//    }



    public Address (String street, String city, String state, int zipCode ) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Address: " + street + ", " + city + ", " + state + ", " + zipCode;
    }

}


class Runner {
    public static void main(String[] args) {
        Address obj = new Address("123 Test St", "Test", "VA", 22222);
        System.out.println(obj);

        obj.state = "MD";
        System.out.println(obj);
    }
}