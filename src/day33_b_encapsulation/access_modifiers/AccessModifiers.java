package day33_b_encapsulation.access_modifiers;

public class AccessModifiers {

    // 3 instance variables
    public int a;       // public access modifier (anywhere in the project)
    int b;              // default access modifier
    private int c;      // private access modifier
    //protected int d;  // protected access modifier - will talk later



    // static variables
    public static int a2;       // public access modifier
    static int b2;              // default access modifier
    private static int c2;      // private access modifier
    // protected static int d2; // protected access modifier - will talk later


    // SAME package
    // SAME class
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        // Since the member has public a.m - can be reached in the same class + same package
        System.out.println(obj.a);

        // Since the member has default a.m - can be reached in the same  class + same package
        System.out.println(obj.b);

        // Since the member has private a.m - can be reached in the same class + same package
        System.out.println(obj.c);


        System.out.println("-----------------------");

        // Since it is in the SAME class + SAME package, we can access - public, default, private static members as well
        System.out.println(AccessModifiers.a2);
        System.out.println(AccessModifiers.b2);
        System.out.println(AccessModifiers.c2);




    }



}


