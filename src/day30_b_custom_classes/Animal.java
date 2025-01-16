package day30_b_custom_classes;

// Template Class
public class Animal {

    // Instance variables
    String species; // Birds, Fish
    long population;



    // Instance method
    // Ths is a SPECIAL method.
    // This method will help us to PRINT OBJECT directly.
    // If this method is NOT declared and you print your object directly, it will show memory location

    public String toString() {
        String message = "Species: " + species + "\nPopulation: " + population;
        return message;
    }





}