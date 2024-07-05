package HomeWorkModule.july04;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(50000);
        System.out.println("Full Time Employee Salary: "+ fullTimeEmployee.calculateSalary());

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2000, 30);
        System.out.println("Part Time Employee Salary: " + partTimeEmployee.calculateSalary());
    }


}
