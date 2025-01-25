package day31_custom_classes;

// Template class
public class TrafficLight {


    // Rule 1
    // If in the class, we do NOT have any EXPLICITLY declared constructor, there is DEFAULT constructor there
    // Default constructor does NOT have any parameters
    // Is not declared explicitly -  It is hidden
    // public className () { }


    // Rule 2
    // Once you declared a constructor explicitly, the compiler does NOT create a DEFAULT CONSTRUCTOR>
    //public TrafficLight () {
    //
    //}


    // Instance variable
    String color;

    // Declared a CONSTRUCTOR
    public TrafficLight (String color1) {
        color = color1;
    }
}
