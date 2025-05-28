import java.util.PriorityQueue;
import java.util.Comparator;

class Task {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}

public class CustomTaskScheduler {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(Comparator.comparingInt(t -> t.priority));

        taskQueue.offer(new Task("Low Priority Task", 5));
        taskQueue.offer(new Task("High Priority Task", 1));
        taskQueue.offer(new Task("Medium Priority Task", 3));

        System.out.println("Task Scheduler Output:");
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println(task.name + " (Priority: " + task.priority + ")");
        }
    }
}
