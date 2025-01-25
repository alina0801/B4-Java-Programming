package day38_a_abstraction_interface.relation;

// Going from interface to interface is still INHERITANCE. so we use 'extends'
// Interface can extends multiple interfaces

import day38_a_abstraction_interface.shopping.Shipping;

public interface ConsumerApp extends AllowUserToSell, Shipping {


}
// Going from interface to class (Child class, is the one get addition info from interface), is we use 'implements'
abstract class Test implements AllowUserToSell, Shipping {

}

class Runner {
    public static void main(String[] args) {

    }
}
