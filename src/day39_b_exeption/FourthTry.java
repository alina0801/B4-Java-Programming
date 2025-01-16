package day39_b_exeption;

public class FourthTry {
    public static void main(String[] args) {


        //InterruptedException --- >  compile time exception
        try{
            Thread.sleep(-20);
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Finish Line");

    }
}