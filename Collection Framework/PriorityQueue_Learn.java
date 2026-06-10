import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueue_Learn {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(50);
        pq.offer(20);
        pq.offer(200);
        pq.offer(10);
        pq.offer(80);

        System.out.print(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());

    }
}
