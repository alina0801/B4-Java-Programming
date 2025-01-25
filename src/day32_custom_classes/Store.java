package day32_custom_classes;

public class Store {
    public static void main(String[] args) {
        Food food1 = new Food ("Apple");
        System.out.println(food1);

        Food food2 = new Food("Orange", 5);
        System.out.println(food2);

        Food food3 = new Food("Banana", 2, 3.99);
        System.out.println(food3);

    }
}