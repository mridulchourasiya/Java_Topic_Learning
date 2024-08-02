package Abstraction;

abstract public class MyClass {
    //complete Method
    public  void cal(){
        System.out.println("Calculatimg results");
    }

   // abstract method
  abstract  public  void launchRockit();


}

class  Start{
    public static void main(String[] args) {
       MyChild ob = new MyChild();
       ob.cal();
       ob.launchRockit();
    }
}