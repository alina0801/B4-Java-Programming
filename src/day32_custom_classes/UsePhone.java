package day32_custom_classes;
// Runner Class - main() method is used to start the execution.
public class UsePhone {
    public static void main(String[] args) {

        // Phone phone1 = new Phone();

        // All instance members should be called by object reference.
        // name = "Iphone 16 Pro";


        // Instead of giving initial values like below, we can use constructor
        //phone1.name = "Iphone 16 Pro";
        //phone1.brand = "Apple";
        //phone1.memory = 128;
        //phone1.version = 18.2;


        // Since there is NO-MATCHING CONSTRUCTOR, this will give an issue.
        //Phone phone1 = new Phone();


        Phone phone1 = new Phone("Iphone 16 Pro", "Apple", 128, 18.2);


        // If you do not have toString() method in the template class, you will get memory location
        //System.out.println(phone1); // day32_custom_classes.Phone@30f39991


        // After we declared toString() method in template class
        System.out.println(phone1);


        System.out.println();
        Phone phone2 = new Phone("IPhone 12 Mini");
        System.out.println(phone2);


        System.out.println();
        Phone phone3 = new Phone ("IPone 16 Pro MAX", "Apple", 512);
        System.out.println(phone3);


        System.out.println();
        Phone phone4 = new Phone("IPone 14 Pro", "Apple", 512, 16.0);
        System.out.println(phone4);



    }
}
