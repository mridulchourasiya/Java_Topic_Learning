package ExceptionHandling;

public class Main {
    static  void  chackAge(int age){
        if (age < 18){
            throw new ArithmeticException("Access denide - You must at atlest 18 year old");

        }else {
            System.out.println("Access Greanted you are Old enough");
        }


    }


    public static void main(String[] args) {
        chackAge(20);
    }
}
