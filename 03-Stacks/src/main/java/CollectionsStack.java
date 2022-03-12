import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class CollectionsStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        for (int i =0; i<5; i++) {
            stack.push(i);
        }
//        stack.push(1);
        System.out.println("Stack elements: ");
        stack.forEach(System.out::println);
        System.out.println("Top of the stack is: " + stack.peek());
        stack.pop();
        stack.pop();
        System.out.println("Updated stack: ");
        stack.forEach(System.out::println);



        Deque<Integer> stack1 = new ArrayDeque<>();
        for (int j =0; j<5; j++) {
            stack1.push(j);
        }
//        stack.push(1);
        System.out.println("Stack elements: ");
        stack1.forEach(System.out::println);
        System.out.println("Top of the stack is: " + stack1.peek());
        stack1.pop();
        stack1.pop();
        System.out.println("Updated stack: ");
        stack.forEach(System.out::println);
    }
}
