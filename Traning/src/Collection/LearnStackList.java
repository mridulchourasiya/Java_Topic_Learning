package Collection;

import java.util.Stack;

public class LearnStackList {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

// add an element in stack
        animals.push("lion");
        animals.push("cat");
        animals.push("Dog");
        animals.push("mouse");

        System.out.println("Stack"+ animals);
        // show the top element
        System.out.println(animals.peek());

        // to remove the top element
        animals.pop();
        System.out.println("Stack "+ animals);



    }
}
