import java.util.ArrayDeque;
import java.util.Deque;

public class Dequetest {
    public static void main(String[] args) {


        Deque<Integer> stack = new ArrayDeque<>();

        // Push elements
        stack.push(3);
        stack.push(5);
        stack.push(9);
        // push from the bottom.
        stack.addLast(10);

        System.out.println("Stack: " + stack);


        // peek
        System.out.println("Top: " + stack.peek());


        // Pop ( from the top, supposed to be 9)
        System.out.println("Popped: " + stack.pop());   // top

        // Pop ( from the bottom, supposed to be 10 )
        System.out.println("Popped from the end: " + stack.pollLast());

        // Check if empty, supposed to be false)
        System.out.println("Empty? " + stack.isEmpty());

    }
}