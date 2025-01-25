package day33_b_encapsulation.access_modifiers;


//SAME package
//DIFFERENT class
public class AccessInPackage {
    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
        // Since the member has public a.m - can be reached in the different class + same package
        System.out.println(obj.a);

        // Since the member has default a.m - can be reached in the different class + same package
        System.out.println(obj.b);

        // Since the member has private a.m - can NOT be reached in the different class + same package
        // System.out.println(obj.c);


        System.out.println("-----------------------");
        // Since it is in the DIFFERENT class + SAME package, we can access - public, default static members as well. private is NOT accessible
        System.out.println(AccessModifiers.a2);
        System.out.println(AccessModifiers.b2);
        // System.out.println(AccessModifiers.c2);


    }
}