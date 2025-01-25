package day32_custom_classes;

/*
  create a class called Employee

   - data:

       name, id, job title, salary

*/

/*

- constructor

    - create a constructor that creates an Employee object with the name and job title

    - create a constructor that creates an Employee object with the name, id, job title, and salary

*/

/*
    - method:

        goToMeeting()
            when this method is called print:
                $name is going to a meeting

        toString()
            print all the employees information

 */
// Template class
public class Employee {

    // name, id, job title, salary
    // Instance variable - does not have "static" keyword
    String name;
    int id;
    String jobTitle;
    double salary;


    // Constructor - name and jobTitle
    public Employee (String jobTitle, String name) {
        this.name = name;
        this.jobTitle = jobTitle;
    }


    // Constructor - name, id, job title, and salary
    public Employee (String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Instance Method - does not have "static" keyword
    public void goToMeeting () {
        //  $name is going to a meeting
        System.out.println(name + " is going to a meeting");
    }


    // Instance Method - does not have "static" keyword
    public String toString() {
        return name + " - " + jobTitle + " - " + id + " - $" + salary;
    }
}