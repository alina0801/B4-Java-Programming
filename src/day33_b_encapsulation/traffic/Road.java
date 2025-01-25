package day33_b_encapsulation.traffic;

public class Road {
    public static void main(String[] args) {

        //TrafficLight light1 = new TrafficLight();
        //light1.color = "Red";
        //System.out.println(light1.color);

        //light1.color = "Purple";
        //System.out.println(light1.color);


        //TrafficLight light1 = new TrafficLight("Red");
        //System.out.println(light1.color);
        //light1.color = "Black";
        //System.out.println(light1.color);


        //TrafficLight light1 = new TrafficLight("Red");
        // light1.color = "Black";
        //System.out.println(light1.getColor());
        //light1.setColor("Black");
        //System.out.println(light1.getColor());


        TrafficLight light1 = new TrafficLight("Red");
        light1.setColor("Black");
        System.out.println(light1.getColor());

        System.out.println();
        TrafficLight light2 = new TrafficLight("Black");
        System.out.println(light2.getColor());
    }
}







