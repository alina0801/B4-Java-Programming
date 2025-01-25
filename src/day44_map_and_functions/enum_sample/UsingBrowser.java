package day44_map_and_functions.enum_sample;

public class UsingBrowser {
    public static void main(String[] args) {

        Browser browser = Browser.CHROME; //  String browser = "Chrome"
//      switch(Browser.CHROME) - > you can declare it straight
        switch (browser){
            case CHROME:
            case FIREFOX:
                System.out.println("Opening either Chrome or Firefox");
            case EDGE:
                System.out.println("Opening Edge");
                break;
            case SAFARI:
                System.out.println("Opening Safari");
                break;
            default:
                System.out.println("Unknown browser");
        }
    }
}
