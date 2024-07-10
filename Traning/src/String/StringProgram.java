package String;

public class StringProgram {
    public static void main(String[] args) {

        //upperCase
        String orignal = "Hello";
        String upperCase = orignal.toUpperCase();

        System.out.println("Original String: " + orignal);
        System.out.println("Uppercase String: " + upperCase);


        // to Contain()

        String original = "hello world";
        String subString = "world";
        boolean contains = original.contains(subString);

        System.out.println("Orignal String: " + original);
        System.out.println("Contain "+ subString + ": " + contains);

        // to Length()

        String str = "hello world";
        int length = str.length();

        System.out.println("The length of the String " + str + "is :"+ length);
//

      //to Trim()
        String strWithWhitespace = "  hello world  ";
        String trimmedStr = strWithWhitespace.trim();
        System.out.println("Original String: \"" + strWithWhitespace + "\"");
        System.out.println("Trimmed String: \"" + trimmedStr + "\"");



    }
}
