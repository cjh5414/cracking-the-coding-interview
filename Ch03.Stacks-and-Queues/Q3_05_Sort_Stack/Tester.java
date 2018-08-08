package Q3_05_Sort_Stack;

import java.util.Stack;


public class Tester {
    public static void main(String[] args) {
        SortStack sortStack = new SortStack();

        sortStack.push(5);
        sortStack.push(1);
        sortStack.push(3);

        System.out.println("5 1 3 | peek : " + sortStack.peek());

        sortStack.push(2);
        sortStack.push(4);

        System.out.println("5 1 3 2 4 | peek : " + sortStack.peek());

        while (!sortStack.isEmpty())
            System.out.println("pop : " + sortStack.pop());
        System.out.println("");

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        Question.sort(stack);

        while (!stack.isEmpty())
            System.out.println("pop : " + stack.pop());
    }
}
