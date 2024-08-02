package PracticeQuestion;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Abishake", "HR", 45.900);
        Employee employee1 = new Employee("shikha","developer", 55.9088);

         employee1.riseSalary(8);
         employee.riseSalary(12);


        System.out.println("Employee one salary" + employee1);
        System.out.println("Employee two salary"+ employee);


        employee1.displaySalary();
        employee.displaySalary();


    }
}
