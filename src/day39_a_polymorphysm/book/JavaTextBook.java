package day39_a_polymorphysm.book;
// Concrete Class
public class JavaTextBook extends EBook {

    // You can have any other members specific to this class: instance members , static
    boolean isFun;
    @Override
    public void open() {
        System.out.println("Opening Java text book");
    }

    @Override
    public void read() {
        System.out.println("Reading Java text book");

    }

    @Override
    public void download() {
        System.out.println("Downloading Java text book");
    }
}
