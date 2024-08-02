package ClassAndObject;

public class Student02 {

    // Data: DataMembers : Instance Variable
    int studentId;
    String studentName;
    String studentCity;
    String studnetBatch;

    // non parametrize constructor
    public  Student02(){
        // adding the argument of this keyowrd
        this(90,"thest","jabalpur");
        System.out.println("the non Parametrize construction");
    }



    // multiple parameterize constructor
    public  Student02( int st){

        System.out.println("Parameterize Constructor : (int n)");

    }


    //Behaviour : method member
    public void studentDetails(){
        System.out.println("Student Name is :"+ studentName);


    }


    // another example
    public  Student02(int i, String studentName, String studentCity){
        this.studentName = studentName;
        this.studentCity = studentCity;
        studentId = i;
//        studentName = n;
//        studentCity = c;
    }

    public void studentClass(){
        System.out.println("The student Id is : "+ studentId);
        System.out.println("The Student Live in : "+ studentCity);
        System.out.println("The Student is Study in :"+ studnetBatch);
    }

}
