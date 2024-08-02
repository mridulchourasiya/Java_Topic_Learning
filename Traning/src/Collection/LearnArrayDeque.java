package Collection;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
     ArrayDeque<Integer> abc = new ArrayDeque<>();

     // add an array Deque  element
        abc.offer(12);
        abc.offerFirst(24);
        abc.offer(36);
        abc.offer(48);
        abc.offerLast(60);

        System.out.println(abc);
        // to show the element pop
        System.out.println(abc.peek());
        System.out.println(abc.peekFirst());
        //to remove the last function
        System.out.println(abc.pollLast());
        System.out.println(abc.poll());
        System.out.println(abc);





    }
}
