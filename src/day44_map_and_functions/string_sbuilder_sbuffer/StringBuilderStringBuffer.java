package day44_map_and_functions.string_sbuilder_sbuffer;

public class StringBuilderStringBuffer {
    public static void main(String[] args) {


        // 1. String
        //    Strings are IMMUTABLE
        String str1 = "loopcamp";                                // Stored it in a heap in a String Pool
        String str2 = new String("loopcamp");            // Stored it directly in a Heap (all the Objects)

        str1 = str1 + str2;                                      // This line created COMPLETELY a new object in a HEAP
        System.out.println("String: " + str1);

        System.out.println("----------------------------------------------------------");

        // 2. String Builder
        //  It is in java.lang package can only create object of StringBuilder with NEW keyword
        //  String Builder is MUTABLE - once object create we can change
        //  It is NOT Synchronized, NOT TreadSafe
        //  It can be ONLY created by 'new' keyword

        StringBuilder strBuilder = new StringBuilder("loopcamp");   // Stored directly in Heap
        System.out.println("StringBuilder: " + strBuilder);
        strBuilder.append("loopcamp");                              // This line does not create a new object, it updates the existing one
        System.out.println("StringBuilder: " + strBuilder);
        //StringBuilder strBuilder2 = "loop";

        System.out.println("----------------------------------------------------------");
        // 3. StringBuffer Class
        //  It is in java.lang package - can only create object of StringBuilder with NEW keyword
        //  StringBuffer is MUTABLE - once object create we can change
        //  It IS Synchronized, TreadSafe
        //  It can be ONLY created by 'new' keyword
        StringBuffer strBuffer = new StringBuffer("loopcamp");
        System.out.println("StringBuffer " + strBuffer);
        //StringBuffer strBuffer2 = "loopcamp";
        strBuffer.reverse();                                               // This line does not create a new object, it updates the existing one
        System.out.println("StringBuffer " + strBuffer);

    }
}
