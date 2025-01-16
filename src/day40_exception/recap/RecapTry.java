package day40_exception.recap;

import java.util.ArrayList;

public class RecapTry {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("javaScript");
        System.out.println(list);
        String s = null;

        try {
            System.out.println(list.get(4));        // IndexOutOfBoundsException

            // System.out.println(s.length());

        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            //System.out.println("Index Out Of Bounds Exception");
            System.out.println(e.getMessage());

        } catch (NullPointerException e) {
            System.out.println("NullPointerException ");
            System.out.println(e.getMessage());

            System.out.println("Final Line");
        }

        System.out.println(list);
        System.out.println("---------------------------------");



        try {
            // System.out.println(list.get(4));  // IndexOutOfBoundsException


            System.out.println(s.length()); // NullPointerException

        } catch (RuntimeException e) {
            System.out.println("Index Out Of Bound OR NullPointer");
            System.out.println(e.getMessage());
        }



        System.out.println("---------------------------------");



        try {
            System.out.println(list.get(4));  // IndexOutOfBoundsException


            System.out.println(s.length()); // NullPointerException

        } catch (IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Index Out Of Bound OR NullPointer");
            System.out.println(e.getMessage());
        }




        System.out.println("Final Line");


    }
}
