import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> navigation = new LinkedList<>();

        navigation.addFirst("Home");
        navigation.addFirst("About");
        navigation.addFirst("Contact");

        System.out.println("Back Navigation:");
        while (!navigation.isEmpty()) {
            System.out.println("Back to: " + navigation.removeFirst());
        }
    }
}

