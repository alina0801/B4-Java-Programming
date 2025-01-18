package day42_a_collection.collection;

import java.util.*;

public class ListVsSet {
    public static void main(String[] args) {

        System.out.println("-LIST-");
        List<Integer> list = new ArrayList<>();     // LIST interface - duplicates allowed, null allowed, insertion order is kept
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        list.add(4);
        list.add(null);
        System.out.println(list);
        System.out.println(list.get(0));            // Since LIST works with indexes, i can use index
        System.out.println(list.get(list.size() - 1));

        System.out.println("-SET-");
        Set<Integer> set = new HashSet<>();     // SET interface - duplicates NOT allowed, null allowed, insertion order is kept
        set.add(4);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10);
        set.add(4);
        //set.add(null);                        // Since we use HashSet class, null is allowed(In Tree Set null is not allowed)
        System.out.println(set);
        // System.out.println(set.get(0));      // Since SET interface, does not work with indexes, we cannot use index
        // System.out.println(set.get(set.size()-1));

        // Q: How then, we can get the elements for SET
        // A: Loop through SET and get the matching element
        System.out.println("-LOOPING THROUGH SET-");
        for (Integer each : set) {
            if (each == 4) {            // null == 4 --> Object cannot be compared with ==
                System.out.println(each);
            }
        }

        System.out.println("-LOOPING THROUGH LIST-");
        // loop through List and print each element

        for (Integer each : list) {
            System.out.println(each);
        }


        // Q: Can I take one collection and sort it? treeSet sort it, using Collections.sort(list) not recommended , cause Collections.sort return type is void, will not return the object which you can use later
        Set<Integer> sortedSet = new TreeSet<>(set);
        System.out.println(sortedSet);

        System.out.println("---------------");
        // Q: How can I remove duplicates
        System.out.println(list);

        Set<Integer> noDuplicates1 = new HashSet<>(list); // Does not guarantee the order
        System.out.println(noDuplicates1);

        list.remove(null);
        Set<Integer> noDuplicates2 = new TreeSet<>(list); // Removed duplicates and sorted
        System.out.println(noDuplicates2);

        System.out.println(list);
        Set<Integer>noDuplicates3 = new LinkedHashSet<>(list); // Removed duplicated and kept the order same
        System.out.println(noDuplicates3);


        System.out.println("---------------");
        // Q: Can you remove duplicates elements from the follow array
        // [2, 4, 3, 23, 76, -3, -5, 2, 8, 4];

       Integer [] arr =  {2, 4, 3, 23, 76, -3, -5, 2, 8, 4};

       // 1. I can do nested loop and add not duplicates into new array
        // 2. I can convert array with Arrays.asList() method and assign it into an approprieted collection
        // 3. I can use Collections.sort(); just to sort (not remove duplicates)

        System.out.println(Arrays.toString(arr));
        System.out.println(new LinkedHashSet<>(Arrays.asList(arr))); // remove dup and keep same order
        System.out.println(new TreeSet<>(Arrays.asList(arr))); // remove dup and sort the order

        System.out.println("---------------");
        //Q: Can you remove duplicate characters from this string
        // "avnaljkashsldkvnsalsdkffgnv"

        String str = "avnaljkashsldkvnsalsdkffgnv";

        System.out.println( Arrays.toString( str.split("") ) );
        System.out.println( new LinkedHashSet<>( Arrays.asList(    str.split("")   )  )  );

    }
}