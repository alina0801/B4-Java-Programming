package day40_exception.throws_keyword;

public class UsingThrows {
    public static void main(String[] args) {

        // Thread.sleep(2000); // Compile Time Exception (checked exception) + may have Runtime exception

        /**  With Exceptions, we have two options:
         * 1. Handle it with   ---> try/catch block
         * 2. Do not handle it ---> By pass it to someone else
         *
          */
test1(200);
// test2(200);
// Thread.sleep(200);

    }

    public static void test1(int millis){
       // 1 - Handling it with try/catch block
        try {
            Thread.sleep(millis);    // when minus value provided -> IllegalArgumentException
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void test2(int millis) throws InterruptedException{
        // 2- By pass it to someone else who calls this method
        Thread.sleep(millis);
    }
}
