package day27_wrapper_arraylist;

import java.util.Arrays;

public class AddElementInArr {

    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4, 5}; // arr.length --- > 5
        //          0  1  2  3  4
        System.out.println( Arrays.toString( a ) );


        int [] b = addElemInArr(a, 40);
        System.out.println( Arrays.toString( b ) );

        System.out.println( Arrays.toString( addElemInArr(b, 890) ) );
        System.out.println( Arrays.toString( addElemInArr(a, 900) ) );

        System.out.println("-------------------------");

        int [] c = addElemInArray(a, 3, 4 ,56, 76);
        System.out.println( Arrays.toString( c ) );
        int [] d = addElemInArray(a, 3, 4 ,56, 76, 54, 23);
        System.out.println( Arrays.toString( d ) );

    }


    // I need to build a function (method) which adds the element into an array.
    public static int [] addElemInArr (int [] arr, int num) {

        int [] addedArr = Arrays.copyOf(arr, arr.length + 1); // {1, 2, 3, 4, 5, _ };
        addedArr [addedArr.length - 1] = num;

        return addedArr;
    }

    /*
        HOME PRACTICE
            Implement the same code with fori loop
            Note: make the method name: addElemInArr2
     */


    // I need to build a function / a code  (method) which adds couple elements into an array
    public static int [] addElemInArray (int [] arr, int ... arr2 ) {

        int [] addedAr = Arrays.copyOf(arr, arr.length + arr2.length);
        // {1, 2, 3, 4, 5,  _, _, _,.......}


        for (int i = arr.length, j = 0; i < addedAr.length; i++, j++) {
            // i < 9  --- >  i = 5, j = 0;  i < 9; i++, j++
            addedAr[i] = arr2[j];
        }

        return addedAr;
    }


}