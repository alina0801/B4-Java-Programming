package day36_inheritance_cont.app;

public class App {
    String name;
    double version;

    public App(String name, double version) {
        this.name = name;
        this.version = version;
    }

    //Instance method
    public void download(){
        System.out.println(name + " is downloading version " + version);
    }
}
