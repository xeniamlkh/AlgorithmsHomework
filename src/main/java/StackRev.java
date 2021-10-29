// Task 1 - Print a stack in reverse
import java.util.Stack;

public class StackRev {

    public static void main(String[] args) {

        Stack<Character> reverseStack = new Stack<>();
        reverseStack.push('A');
        reverseStack.push('B');
        reverseStack.push('C');
        reverseStack.push('D');
        reverseStack.push('E');

        for (int i = 0; i < reverseStack.size(); i++) {
            System.out.println(reverseStack.get((reverseStack.size() - 1) - i));
        }
    }
}