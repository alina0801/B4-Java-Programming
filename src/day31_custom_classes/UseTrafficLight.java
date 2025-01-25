package day31_custom_classes;

// Runner class
public class UseTrafficLight {
    public static void main(String[] args) {

        // Object Reference =  Actual Object -> (new)
        //                           constructor
        //TrafficLight obj1 = new TrafficLight();
        //System.out.println(obj1.color);


        // Initialized the instance variable color to be "Yellow"
        //obj1.color = "Yellow";
        //System.out.println(obj1.color);


        // We initialized the instance variable called "color" to be set to "Yellow"
        TrafficLight obj2 = new TrafficLight("Yellow");
        System.out.println(obj2.color);


        TrafficLight obj3 = new TrafficLight("Red");
        System.out.println(obj3.color);

        obj2.color = "Green";
        System.out.println(obj2.color);










    }
}