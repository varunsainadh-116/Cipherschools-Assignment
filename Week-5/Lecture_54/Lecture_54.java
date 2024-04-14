import java.util.*;
import java.util.Stack;

public class Lecture_54 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        // Add elements to the stack
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of stack: ");
        int size = sc.nextInt();
        for(int i = 0; i<size; i++){
            int x = sc.nextInt();
            stack.push(x);
            x = 0;
        }
        sc.close();
        // Display the elements in the stack
        System.out.println("Stack: " + stack);

        // Remove elements from the stack
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Display the elements in the stack
        System.out.println("Stack: " + stack);

        // View the top element in the stack
        System.out.println("Top element: " + stack.peek());

        // Search for an element in the stack
        System.out.println("Search for 30: " + stack.search(30));
    }
}