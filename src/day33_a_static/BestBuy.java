package day33_a_static;
// Template Class
public class BestBuy {

    // Instance Variable - belongs to each object / each has its own copy
    String location;


    // static variable - belong to all objects, ONE / SAME copy for all
    static String headquarter = "7601 Penn Ave South, Richfield, Minnesota";
    static String specialDay = "28th Dec";


    // Constructor - helps to initialize the instance variables
    public BestBuy (String location) {
        this.location = location;
    }


    // instance method / NON-static method
    public void openStore () {
        System.out.println("Opening the store in location: " + location);

        // In Instance method, we can reach both INSTANCE and STATIC members
        System.out.println("Headquarter is " + headquarter);
    }


    // static methods
    public static void specialsDaySale () {
        System.out.println("There is %40-%70 discounts on " + specialDay);

        // Static ONLY ACCEPTS static
        // System.out.println("Location is: " + location);
    }

}

/**
 * static
 *      - all objects share/have the ONE/SAME copy
 *      - if it changes/updated, all objects are affected
 *      - We use class name to reach the static members
 *          - Possible to used the object reference as well but not good approach
 *      - Static ONLY accepts static members
 *      - we cannot use 'this' keyword (because belongs to a class, not only to one object)
 *
 *
 * instance
 *      - every object has its OWN copy
 *      - if instance for one object is changed/updated, it only affects that object
 *      - We use object reference to reach instance members
 *          - NOT possible to use the Class Name to reach the instance members
 *      - Instance accepts BOTH static and instance members
 */
