package day36_inheritance_cont.taxi;

public class LyftXL extends Lyft {

    public LyftXL(String driverName) {
        super(driverName);
    }


    // Instance overridden method - cost will be %20 more
    @Override
    public double calculateRate (int miles){
        return super.calculateRate(miles) * 1.20;
    }


}