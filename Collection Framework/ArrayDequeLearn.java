import java.util.ArrayDeque;
public class ArrayDequeLearn {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        
        adq.offer(2);
        adq.offerFirst(23);
        adq.offerLast(1);
        adq.offerLast(10);
        adq.offerLast(10);
        adq.offerLast(76);
        adq.offerLast(22);

        System.out.println(adq);
        
        // adq.poll();
        // System.out.println(adq);
        
        // adq.pollFirst();
        // System.out.println(adq);
        
        // adq.pollLast();
        // System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
    }
}
