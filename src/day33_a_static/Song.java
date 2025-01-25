package day33_a_static;

// Template Class - sent the instructions for each object of this class
public class Song {

    // Instance variables - each object has its own set of values/copies - no static keyword

    String name;
    double length;
    String singer;
    String genre;

    // Constructor - special method, NO return, used to initialize the instatce variables
    // 1st Constructor - name

    public Song(String name) {
       // name = name; // Compiler prioritizes the LOCAL over INSTACE since both have the same name
        this.name = name;   // 'this' is reference to the object reference
    }


    // 2nd Constructor - name


    public Song(String name, double length) {
        this(name);
        this.length = length;
    }

    // 3rd Constructor - name


    public Song(String name, double length, String singer, String genre) {

        this(name, length);
        this.singer = singer;
        this.genre = genre;
    }

    // if this toString method is not declared explicitly, printing the obj will give the memory location
    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", singer='" + singer + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
