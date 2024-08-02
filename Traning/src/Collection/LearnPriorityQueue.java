package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> qp = new PriorityQueue<>(Comparator.reverseOrder());

        qp.offer(12);
        qp.offer(24);
        qp.offer(36);
        qp.offer(48);
        qp.offer(60);
        qp.offer(72);
        qp.offer(84);
// to print all the element in that
        System.out.println(qp);
        // remove an element in the queue
        qp.poll();
        System.out.println(qp);


        // show the order in row
        System.out.println(qp.peek());
    }
}
