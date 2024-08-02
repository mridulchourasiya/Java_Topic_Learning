package PracticeQuestion;

public class Employee01 {
    private  int id;
    private  String name;
    private  double salary;
    private  String role;



    public Employee01(int id, String name, double salary, String role){
        this.id = id;
        this.role = role;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public  String getName(){
        return name;
    }
    public void  setName(String name){
        this.name = name;
    }


    public String getRole(){
        return  role;
    }

    public void  setRole(String role){
        this.role = role;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void calculateSalary(double field){
      salary = salary * salary * field / 100;
    }

    public  void  displayInfo(){
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Salary: "+ salary);
        System.out.println("Role: "+ role);

    }
}
