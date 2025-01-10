package day38_a_abstraction_interface.interface_mehtods;

public interface Mac {
    // everything in interface is -> 'public'
    // all the variables are      -> 'public static final'
    // all the methods without body -> 'public abstract'
    // there is NO CONSTRUCTOR at all (including default)
    // possible to have 'default' and 'static method'


    // We can have total 4 things in interface

    // 1 - public static final variables / CONSTANTS
    String NAME = "Apple";
    String OS = "IOS";

    // 2 - public abstract methods
    void turnOn();

    // 3 - public static method (After Java 8)
    static void company(){
        System.out.println("Company name: " + NAME);
        System.out.println("Operating System: " + OS);
    }
/*
    default gives the children the option of implementation or not. whereas abstract is forcing the children for that
    and static is what belogns to the class regardless of the inheritance

 */

    // 4 - default method -> is not the access modifier in interface
    public default void faceTime(){
        System.out.println("Calling with Facetime");
    }
}
