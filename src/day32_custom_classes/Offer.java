package day32_custom_classes;
/*
    create a class called Offer

    - data:

        location, company, salary, is full time, number of PTO
*/
/*
    - constructor

        - create a constructor that creates an Offer object with the company and location

        - create a constructor that creates an Offer object with the company, location, and salary

        - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

*/
/*
    - method:

        toString()
            print all the employees information

 */
// Template class - set of instruction for the each object of this class
public class Offer {

    // Instance variables - location, company, salary, is full time, number of PTO
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int pto; // PTO - Paid Time Off


    // Constructor - company and location
    public Offer (String company, String location){
        this.company = company;
        this.location = location;
    }


    // Constructor - company, location and salary
    public Offer(String location, String company, double salary) {
        this.location = location;
        this.company = company;
        this.salary = salary;
    }

    // Constructor - company, location, salary, is full time, and number of PTO
    public Offer(String location, String company, double salary, boolean isFullTime, int pto) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.pto = pto;
    }

    // Instance method - does not have "static" keyword
    public String toString() {

        String result = "Offer Info: ";

        result += "\n\tLocation: " + location;
        result += "\n\tCompany: " + company;

        result += "\n\tSalary: " + ((salary > 0) ? "$"+salary : "Info Not available.");
        result += "\n\tIs Full Time: " + ( (isFullTime) ? "Full Time" : "Either Not Full Time or Info Not available." );
        result += "\n\tNumber Of PTO: " + ( (pto > 0) ? pto + " days" : "O days as PTO or Info Not available.");

        return result;
    }
}
