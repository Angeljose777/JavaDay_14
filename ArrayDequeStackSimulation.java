import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeStackSimulation {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        stack.push("Page1");
        stack.push("Page2");
        stack.push("Page3");

        System.out.println("Navigating back:");
        while (!stack.isEmpty()) {
            System.out.println("Back to: " + stack.pop());
        }
    }
}

