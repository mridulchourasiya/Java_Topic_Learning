package Overriding;

public class Parent {

    // parent class
    // covariant return type h to
//    public void m1(){
    public String m1(){
        //overridden method
        System.out.println("i am m1() of parent ");
        // return type bhee String hona chiye
        return "";
    }




}
// inheirt the chid class
class Child extends Parent{
    public  String m1(){
        // redefine the change
        //overriding method
        System.out.println("I am a m1 child of m1");
        return "";
    }
}