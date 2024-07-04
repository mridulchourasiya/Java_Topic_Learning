package ClassAndObject;

class Employee {
    private  String name;
    private  int Id;
    private  String Designation;
    private  double salary;


    public  Employee(String name, int Id, String Designation, double salary){
        this.name= name;
        this.Id = Id;
        this.Designation= Designation;
        this.salary= salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public  void displayInfo(){
        System.out.println("Employee Information");
        System.out.println("Name "+ name);
        System.out.println("Id "+Id);
        System.out.println("Designation "+ Designation);
        System.out.println("Salary "+salary);
    }
}
