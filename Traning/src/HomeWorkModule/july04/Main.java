package HomeWorkModule.july04;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(50000);
        System.out.println("Full Time Employee Salary: "+ fullTimeEmployee.calculateSalary());

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2000, 30);
        System.out.println("Part Time Employee Salary: " + partTimeEmployee.calculateSalary());

        Employee02 emp = new Employee02(101, "John Doe", 75000.0);

        // Display employee information
        emp.display();
        System.out.println();

        // Employee starts shift
        emp.shiftIn();
        System.out.println();

        // Employee ends shift
        emp.shiftOut();
    }


}
