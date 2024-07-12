package HomeWorkModule.july04;

public class Employee02 {
    private int employeeID;
    private String name;
    private double salary;

    // Constructor to initialize all attributes
    public Employee02(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    // Method to indicate the employee's shift starts
    public void shiftIn() {
        System.out.println(name + " (ID: " + employeeID + ") has started their shift.");
    }

    // Method to indicate the employee's shift ends
    public void shiftOut() {
        System.out.println(name + " (ID: " + employeeID + ") has ended their shift.");
    }

    // Method to display the employee's information
    public void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

}
