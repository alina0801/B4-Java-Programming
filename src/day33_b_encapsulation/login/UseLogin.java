package day33_b_encapsulation.login;

public class UseLogin {
    public static void main(String[] args) {

        Login user1 = new Login("loopcamp", "hello&123");

        // Since username and password INSTANCE variables are having 'private' access modifiers, I can not directly reach them
        //System.out.println(user1.username);
        //System.out.println(user1.password);
        //user1.username = "loopacademy";

        // System.out.println(user1);


        // But how can I access INDIRECTLY
        System.out.println( user1.getPassword("loop") );
        System.out.println( user1.getPassword("loopcamp") );


        user1.setPassword("loopcamp", "bye@123");
        System.out.println(user1.getPassword("loopcamp"));

        user1.setPassword("lopcamp", "byeee@123");
        System.out.println(user1.getPassword("loopcamp"));

        user1.setPassword("loopcamp", "byeee@123");
        System.out.println(user1.getPassword("loopcamp"));


        // username INSTANCE variable is private
        // NOT accessible out-site of the class
        // Since there is no public SETTER/GETTER, we dont have indirect access either
        //user1.username = "tom";
        //user1.getUsername();
        //user1.setUsername("");



    }
}
