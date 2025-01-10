package day38_a_abstraction_interface.shopping;
// You can't have a constructor in a Interface, only in Abstract
public interface Shipping {

    // everything is 'public' in interface
    // variable are by default : 'public' static final
    // CONSTANT variable -> public static final, always have to have a value

    String COUNTRY = "USA";

    // by default --> method is public abstract
    void shippingCost(boolean hasMembership);

    }
