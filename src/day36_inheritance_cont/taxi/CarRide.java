package day36_inheritance_cont.taxi;

public class CarRide {
    public static void main(String[] args) {

        Lyft l = new Lyft("Feyruz");
        System.out.println("Cost: $" + l.calculateRate(10));


        LyftXL xl = new LyftXL("Tom");
        System.out.println("Cost: $" + xl.calculateRate(10));

        /*
            xl - access
                    - driverName
                    - calculataRate() -- from parent / override with different implementation
         */
    }
}
