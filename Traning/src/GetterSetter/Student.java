package GetterSetter;

public class Student {
  private   String name;
   private String rollNumber;

// getter
    public String getRollNumber(){
        return this.rollNumber;
    }


// setter
 public  void setRollNumber(int rollNumber){
        this.rollNumber = String.valueOf(rollNumber);
 }
    public void display(){
        System.out.println(this.name);
        System.out.println(this.rollNumber);
    }
}
