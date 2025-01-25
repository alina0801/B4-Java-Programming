package day32_custom_classes;

public class OfferV2 {

    // Instance variables - location, company, salary, is full time, number of PTO
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int pto; // PTO - Paid Time Off


    // Constructor - company and location
    public OfferV2 (String company, String location){
        this.company = company;
        this.location = location;
    }


    // Constructor - company, location and salary
    public OfferV2(String location, String company, double salary) {
        this(company, location);
        //this.location = location;
        //this.company = company;
        this.salary = salary;
    }

    // Constructor - company, location, salary, is full time, and number of PTO
    public OfferV2(String location, String company, double salary, boolean isFullTime, int pto) {
        this (location, company, salary);
        //this.location = location;
        //this.company = company;
        //this.salary = salary;
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