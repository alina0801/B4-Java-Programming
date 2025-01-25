package day33_a_static;

public class BestBuyStores {
    public static void main(String[] args) {
        BestBuy store1 = new BestBuy("Arlington, VA");
        BestBuy store2 = new BestBuy("Paramus, NJ");
        BestBuy store3 = new BestBuy("Orlando, FL");


        // What is the good way to call the static members
        // Calling static member by object reference is fine but not good
        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);

        // Proper way is to use Class name to call static members
        System.out.println(BestBuy.headquarter);


        // Can I call the instance members by Class name?
        // NO - because each object has its own copy
        // System.out.println(BestBuy.location);


        System.out.println();
        BestBuy.headquarter = "900 Test St South, Richfield, Alaska";
        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);

        System.out.println();
        store2.headquarter = "100 Check Dr South, Richfield, Virginia";
        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);
        System.out.println(BestBuy.headquarter);


        System.out.println();
        System.out.println(store1.specialDay);
        System.out.println(store3.specialDay);
        System.out.println(BestBuy.specialDay);

        System.out.println("-----------------------------------");
        // Instance methods / members canNOT be reach by class name
        // BestBuy.openStore();
        store1.openStore();
        store2.openStore();
        store3.openStore();

        System.out.println("-----------------------------------");
        BestBuy.specialsDaySale(); // Good practice
        store1.specialsDaySale();  // Not recommended
        store2.specialsDaySale();  // Not recommended
        store3.specialsDaySale();  // Not recommended


    }
}