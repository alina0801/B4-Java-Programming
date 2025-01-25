package day33_b_encapsulation.login;

public class Login {

    // Instance variables
    private String username;        // im hiding the data with private access modifies
    private String password;


    // Constructor
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // public SETTER -- this setter is for password
    public void setPassword (String username, String password) {
        if (username.equalsIgnoreCase(this.username)){
            if (password.length() >= 8) {
                this.password = password;
            } else {
                System.out.println("Password length has to be at least 8 characters ");
            }
        } else {
            System.out.println("WRONG USERNAME");
        }
    }



    // public GETTER -- this getter is for password
    public String getPassword (String username){
        String result = "";
        if (username.equalsIgnoreCase(this.username)){
            result = password;
        } else {
            result = "WRONG USERNAME";
        }

        return result;
    }




//    @Override
//    public String toString() {
//        return "Login{" +
//                "username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
}