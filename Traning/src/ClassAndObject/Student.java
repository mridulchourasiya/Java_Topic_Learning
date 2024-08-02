package ClassAndObject;


class Student{
    private String name;
    private int age;
    private double grade;

    // Constructor
    public Student() {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter and Setter methods
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}