package day38_a_abstraction_interface.interface_mehtods;
// concrete class
public class MacbookPro implements Mac {
    @Override
    public void turnOn() {
        System.out.println("Macbook Pro is turned on.");

    }

 class Runner{
     public static void main(String[] args) {
         System.out.println(Mac.NAME);
         System.out.println(Mac.OS);

         System.out.println(MacbookPro.NAME);
         System.out.println(MacbookPro.OS);

         // Reaching abstract method with Interface name - NOT VALID
         // Mac.turnOn();

         // Reaching overriden mehtod (instance method) with Class name - NOT VAlLID
         // MacbookPro.turnOn();

         MacbookPro mac = new MacbookPro();
         mac.turnOn();

         System.out.println();
         // Reaching static member with interface name - VALID
         Mac.company();

         // Reaching the static member with class name - NOT VALID
         // MacbookPro.company(); // ONLY can be called with its OWN interface name
         // mac.company(); // ONLY can be called with its OWN interface name

         System.out.println();
         // Reaching the default method with intercase name - NOT VALID
         // Mac.faceTime(); // non-static canNOT be called by Interface name
         // Reaching the default method with class name - NOT VALID
         // MacbookPro.faceTime(); // non-static canNOT be called by Class name
         mac.faceTime();

     }

    }
}
