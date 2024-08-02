package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {

        // this same as the ArrayList to interface
        Queue<Integer> queue = new LinkedList<>();

        // Add an element in Queue
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        queue.offer(48);
        queue.offer(60);

        System.out.println(queue);

        // to remove first element
        System.out.println(queue.poll());


        System.out.println(queue);


        //  to show rhe next element to pop
        System.out.println(queue.peek());



    }
}
