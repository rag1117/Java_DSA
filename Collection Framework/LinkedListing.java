import java.util.LinkedList;
import java.util.Queue;

public class LinkedListing {
    public static void main(String[] args) {
        Queue<Integer> nums = new LinkedList<>();

        nums.offer(10);
        nums.offer(40);
        nums.offer(50);
        nums.offer(80);

        System.out.println(nums.offer(90));

        System.out.println(nums);

        // System.out.println(nums.poll());
        // System.out.println(nums);

        // System.out.println(nums.peek());
    }
}
