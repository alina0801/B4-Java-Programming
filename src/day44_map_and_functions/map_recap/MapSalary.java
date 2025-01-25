package day44_map_and_functions.map_recap;

import java.util.*;

public class MapSalary {
    public static void main(String[] args) {

        Map<String, Double> employeesSalaryInfo = new LinkedHashMap<>();
        employeesSalaryInfo.put("Tom", 8500.00);
        employeesSalaryInfo.put("Jack", 2500.00);
        employeesSalaryInfo.put("Jane", 50.00);
        employeesSalaryInfo.put("John", 400.00);
        employeesSalaryInfo.put("James.K", 5500.00);
        employeesSalaryInfo.put("James.B", 6500.00);

        System.out.println(employeesSalaryInfo);

        // Q: Can you find the MAX and MIN salary?
        // A: There are couple different answers

        System.out.println("----------------------------------------------------");
        System.out.println("Collections: ");
        // 1 - Collects utility class
        System.out.println(Collections.max(employeesSalaryInfo.values()));
        System.out.println(Collections.min(employeesSalaryInfo.values()));


        System.out.println("----------------------------------------------------");
        System.out.println("TreeSet: ");
        // 2 - We can convert all the values into Collection Data Structure - TreeSet and get the first(min) and last(max)
        TreeSet<Double> values = new TreeSet<>(employeesSalaryInfo.values()); // removing the duplicates and sorting it
        System.out.println(values.getLast());
        System.out.println(values.getFirst());

        System.out.println("----------------------------------------------------");
        System.out.println("Loop: ");
        // 3 - We can loop through and find the min and max
        double minSalary = Double.MAX_VALUE;
        double maxSalary = Double.MIN_VALUE;

        for (Double eachValue : employeesSalaryInfo.values()) {

            if (eachValue < minSalary) {
                minSalary = eachValue;
            }
            if (eachValue > maxSalary) {
                maxSalary = eachValue;
            }
        }
        System.out.println(maxSalary);
        System.out.println(minSalary);

        System.out.println("----------------------------------------------------");
        System.out.println("Q: get me the Name and Salary for MIN and MAX salary ");

        minSalary = Double.MAX_VALUE;
        String nameOfMaxSalEmp = "";
        maxSalary = Double.MIN_VALUE;
        String nameOfMinSalEmp = "";


        for (String eachKey : employeesSalaryInfo.keySet()) {

            if (employeesSalaryInfo.get(eachKey) < minSalary) {
                minSalary = employeesSalaryInfo.get(eachKey);
                nameOfMinSalEmp = eachKey;
            }
            if (employeesSalaryInfo.get(eachKey) > maxSalary) {
                maxSalary = employeesSalaryInfo.get(eachKey);
                nameOfMaxSalEmp = eachKey;
            }
        }
        System.out.println(nameOfMaxSalEmp + " - " + maxSalary);
        System.out.println(nameOfMinSalEmp + " - " + minSalary);

        System.out.println("----------------------------------------------------");
        System.out.println("Q: get me the Name and Salary for MIN and MAX salary ");

        minSalary = Double.MAX_VALUE;
        nameOfMaxSalEmp = "";
        maxSalary = Double.MIN_VALUE;
        nameOfMinSalEmp = "";

        for (Map.Entry <String, Double> eachEntry : employeesSalaryInfo.entrySet()) {


            if (eachEntry.getValue() < minSalary) {
                minSalary = eachEntry.getValue();
                nameOfMinSalEmp = eachEntry.getKey();
            }

            if (eachEntry.getValue() > maxSalary) {
                maxSalary = eachEntry.getValue();
                nameOfMaxSalEmp = eachEntry.getKey();
            }

        }
          System.out.println(nameOfMaxSalEmp + " - " + maxSalary);
        System.out.println(nameOfMinSalEmp + " - " + minSalary);


    // Q: Find me the employees name who earn more than 6000
        List<String> employeeNamesWhoEarnsMoreThan6000 = new ArrayList<>();

        for (Map.Entry<String, Double> eachEntry : employeesSalaryInfo.entrySet()) {

            if (eachEntry.getValue() > 6000) {
                //System.out.println(eachEntry.getKey());
                employeeNamesWhoEarnsMoreThan6000.add( eachEntry.getKey() );
            }
        }
        System.out.println("Employees Names Who Earns More Than 6000: " + employeeNamesWhoEarnsMoreThan6000.toString().replace("[", "").replace("]", ""));

        System.out.println("----------------------------------------------------");
        System.out.println("Q: Our manager wants to increase everyone's salary by 5%");

        System.out.println(employeesSalaryInfo);

        for (String eachName : employeesSalaryInfo.keySet()){
            employeesSalaryInfo.put(eachName, (employeesSalaryInfo.get(eachName)) + 5000);
        }
        System.out.println(employeesSalaryInfo);

        System.out.println("----------------------------------------------------");
        System.out.println("Q: How many employees has the salary between 4500 and 7500?");

        int counter = 0;
        for (Double eachValue : employeesSalaryInfo.values()){
            if (eachValue>=4500 && eachValue<=7500){
                counter++;
            }
        }
        System.out.println(counter + " employees has the salary between 4500 and 7500");

        System.out.println("----------------------------------------------------");
        System.out.println("Q: Display the names of employees who makes less than 5500");

        for (String eachName : employeesSalaryInfo.keySet()){
            if(employeesSalaryInfo.get(eachName) < 5500){
                System.out.println(eachName);
            }
        }

}
}

