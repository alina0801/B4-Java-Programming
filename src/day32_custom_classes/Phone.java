package day32_custom_classes;
// Template Class - we set the instructions how the Object of this class will behave
public class Phone {
    // Instance variables - every object has its own copy of these
    String name;
    String brand;
    int memory;
    double version;


    // NON-Parameterized CONSTRUCTOR
    //public Phone (){
    //
    //}


    // Java prioritizes the LOCAL variables over INSTANCE variables if the have same name
    // To make the difference, we use "this"
    public Phone (String name, String brand, int memory, double version) {
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;
    }

    public Phone (String name){
        this.name = name;
    }


    public Phone (String name, String brand, int memory) {
        this.name = name;
        this.brand = brand;
        this.memory = memory;
    }




    @Override
    public String toString() {

        String msg = "Phone Info: ";

        if (name != null) {
            msg += "\n\tName: " + name;
        } else {
            msg += "\n\tName: Info not available."  ;
        }



        if (brand != null) {
            msg += "\n\tBrand: " + brand;
        } else {
            msg += "\n\tBrand: Info not available."  ;
        }


        if (memory != 0) {
            msg += "\n\tMemory: " + memory;
        } else {
            msg += "\n\tMemory: Info not available."  ;
        }


        if (version != 0.0) {
            msg += "\n\tVersion: " + version;
        } else {
            msg += "\n\tVersion: Info not available."  ;
        }


        return msg;




//        return "Phone Info: " +
//                "\n\tName: " + name +
//                "\n\tBrand: " + brand +
//                "\n\tMemory: " + memory +
//                "\n\tVersion: " + version ;
    }
}
