package day32_custom_classes;

public class Company {
    public static void main(String[] args) {

        // Once we have custom constructor declared, there is NO default constructor anymore
        // Employee emp1 = new Employee();
        Employee emp1 = new Employee("SDET", "Tom");
        System.out.println(emp1);

        Employee emp2 = new Employee("Jerry", 107, "QA", 120_000.00);
        System.out.println(emp2);

        System.out.println();
        emp1.goToMeeting();
        emp2.goToMeeting();

    }
}