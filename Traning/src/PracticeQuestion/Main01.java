package PracticeQuestion;

public class Main01 {
    public static void main(String[] args) {
        Employee01 employee01 = new Employee01(102,"Harsh", 23.9033,"Hr");
        Employee01 employee011 = new Employee01(103,"HItesh", 90.009, "developer");
        Employee01 employee012 = new Employee01(104, "Jay", 33.0903, "Devops");


        employee011.calculateSalary(90);
        employee011.displayInfo();


        employee012.calculateSalary(30);
        employee012.displayInfo();


        employee01.calculateSalary(40);
        employee01.displayInfo();
    }
}
