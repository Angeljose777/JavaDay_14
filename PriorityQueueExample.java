import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> tasks = new PriorityQueue<>();

        tasks.offer(5); // low priority
        tasks.offer(1); // high priority
        tasks.offer(3);

        System.out.println("Processing tasks by priority:");
        while (!tasks.isEmpty()) {
            System.out.println("Executing task with priority: " + tasks.poll());
        }
    }
}

