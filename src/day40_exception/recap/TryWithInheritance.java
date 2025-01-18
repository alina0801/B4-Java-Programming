package day40_exception.recap;

public class TryWithInheritance {
    public static void main(String[] args) {

        try {
            int[] nums = {23, 45, 2, 6, 2};
            System.out.println(nums[9]);        // ArrayIndexOutOfBoundsException
            /**
             * Parent exception class canNOT be before the Child exception class
             * Because the PArent Exception class can catch whatever the Child could catch as well
             * So, Child Exception class will never be reached
             *
             *
             * All possible references of ArrayIndexOutOfBoundsException
             *
             * POLYMORPHISM -> possible references:
             * 1. Itself: ArrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException;
             * 2. PARENT: IndexOutOfBoundsException = new ArrayIndexOutOfBoundsException;
             * 3. GRAND PARENT: RuntimeException = new ArrayIndexOutOfBoundsException;
             * 4. Exception e = new ArrayIndexOutOfBoundsException;
             * 5. Throwable e = = new ArrayIndexOutOfBoundsException;
             */


        } catch (ArrayIndexOutOfBoundsException e){

        } catch (IndexOutOfBoundsException e){
            System.out.println("Child");
        } catch (Exception e) {
            System.out.println("Parent");
            e.printStackTrace();

        }
    }
}
