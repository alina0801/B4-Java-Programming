package day32_custom_classes;
/*
    create a class called Food

       - data:

           name, quantity, unit price, total price
*/
/*
    - constructor

        - create a constructor that creates a Food object with the name

        - create a constructor that creates a Food object with the name and quantity

        - create a constructor that creates a Food object with the name, quantity, and unit price
            -> call calculatePrice() method here
*/
/*
    - method:

        - calculatePrice(): multiple the quantity by unit price and assign the value to the total price

        - toString()
            print all the Food information

*/
// Template Class - set of instruction for each object of this class
public class Food {
    // Instance Variables - name, quantity, unit price, total price
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    // 1st Constructor - name
    public Food (String name) {
        this.name = name;
    }

    // 2nd Constructor - name and quantity
    public Food (String name, int quantity) {
        this(name);
        //this.name = name;
        this.quantity = quantity;
    }

    //3rd Constructor - name, quantity, and unit price
    //            -> call calculatePrice() method here

    public Food (String name, int quantity, double unitPrice){
        this(name, quantity);
        //this.name = name;
        //this.quantity = quantity;
        this.unitPrice = unitPrice;
        calculateTotalPrice();
    }


    // Instance method -  does not have "static"
    public void calculateTotalPrice () {
        totalPrice = quantity * unitPrice;
    }

    @Override
    public String toString() {
        return "Food Info: " + name  + " - > " + quantity +  " x " + unitPrice + " = " + totalPrice;
    }
}
