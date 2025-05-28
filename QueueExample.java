import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();

        customerQueue.offer("Alice");
        customerQueue.offer("Bob");
        customerQueue.offer("Charlie");

        System.out.println("Processing customers:");
        while (!customerQueue.isEmpty()) {
            System.out.println("Serving: " + customerQueue.poll());
        }
    }
}
