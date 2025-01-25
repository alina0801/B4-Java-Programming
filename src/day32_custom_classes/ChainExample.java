package day32_custom_classes;
// Template Class
public class ChainExample {

    // 1st Constructor - NON-Parameterized Constructor
    public ChainExample () {
        System.out.println("First");
    }


    // 2nd Constructor - Parameterized (parameters int)
    public ChainExample (int i) {
        this();
        System.out.println("Second");
    }


    // 3rd Constructor - Parameterized (parameter String)
    public ChainExample (String str) {
        this(4);
        System.out.println("Third");
    }


    // 4th Constructor -  Parameterized (parameter double)
    public ChainExample (double d){
        this();
        System.out.println("Fourth");
    }

}


/**
 *  RULES for Constructor Chaining
 *      1 - this() should always be the FIRST LINE
 *      2 - Only ONE constructor can be called in the SAME constructor
 *      3 - Constructor should not call itself
 *      4 - Constructor should not contain itself in the chaining with multiple constructors
 *      5 - Constructor that is called can NOT call the one which called it
 */
