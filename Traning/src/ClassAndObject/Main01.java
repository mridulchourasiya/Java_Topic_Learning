package ClassAndObject;

public class Main01 {
    public static void main(String[] args) {
        // now to creating object in student
       Student02 str1;
       str1 = new Student02();

      str1.studentId = 124;
      str1.studentName = "jay";
      str1.studnetBatch = "Commerce";
      str1.studentCity = "Dehli";


      str1.studentDetails();
      str1.studentClass();


      Student02 str2;
      // parameter constructor
      str2 = new Student02(712, "jay","katni");
//        str2.studentId = 124;
//        str2.studentName = "jay";
//        str2.studnetBatch = "Commerce";
//        str2.studentCity = "Dehli";

        str2.studentDetails();
        str2.studentClass();
    }
}
