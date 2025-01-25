package day33_b_encapsulation.traffic;

public class TrafficLight {

    private String color;

    public TrafficLight(String color) {
        //this.color = color;
        setColor(color);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        // "Red", "Green", "Yellow"

        // Option 1
        if(color.equalsIgnoreCase("yellow") ||
                color.equalsIgnoreCase("red") ||
                color.equalsIgnoreCase("green")) {

            this.color = color;
        } else {
            System.out.println("Not valid color to traffic light");
        }


        // Option 2
        //switch (color.toLowerCase()){
        //    case "red":
        //    case "yellow":
        //    case "green":
        //        this.color = color;
        //        break;
        //    default:
        //        System.out.println("Not valid color to traffic light");
        //}



    }
}