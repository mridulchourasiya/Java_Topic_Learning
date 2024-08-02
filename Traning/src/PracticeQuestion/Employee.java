package PracticeQuestion;

public class Employee {
    // question is to print employee job title attribute and add a method to calculate to update the salary
    private String name;
    private  String title;
    private  double salary;


    public Employee( String name, String title,double salary){
        this.name = name;
        this.salary = salary;
        this.title = title;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getSalary(){
        return  salary;
    }

    public  void  setSalary(double salary){
       this.salary = salary;
    }


    public  String getTitle(){
        return  title;
    }

    public  void  setTitle(String title){
        this.title = title;
    }



    // increment salary method

    public  void  riseSalary(double precentage){
        salary = salary + salary * precentage / 100;
    }



    public  void displaySalary(){
        System.out.println("Job Title: "+ title);
        System.out.println("Employee name: "+ name);
        System.out.println("Employee salary: "+ salary);
    }
}
