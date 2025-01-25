package day31_custom_classes;
// Template class - will set the instruction how the object will behave.
public class ThisKeyword {

    // instance variable - declared at Class Level
    int a;

    //              local variable - declared at method level
    public ThisKeyword (int a) {

        // Java prioritizes LOCAL variables over the INSTANCE variables if they have same names
        // Q: OK. But how to make the difference between them for Java
        // A: with the help of "this" keyword.
        // this --- >  representation of object reference.
        this.a = a;


    }
}