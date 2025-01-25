package my_utilities;

import day33_b_encapsulation.access_modifiers.AccessModifiers;




// DIFFERENT package
// DIFFERENT class
public class AccessOutsidePackage {
    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
        // Since the member has public a.m - can be reached in the different class + different package
        System.out.println(obj.a);

        // Since the member has default a.m - can not be reached in the different class + different package
        //System.out.println(obj.b);


        System.out.println("-----------------------");
        // Since it is in the DIFFERENT class+ DIFFERENT package, we can access - public. default and private static members are NOT accessible
        System.out.println(AccessModifiers.a2);
        // System.out.println(AccessModifiers.b2);
        // System.out.println(AccessModifiers.c2);

    }
}