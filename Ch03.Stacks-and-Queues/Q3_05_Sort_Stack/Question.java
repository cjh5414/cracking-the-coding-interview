package Q3_05_Sort_Stack;

import java.util.Stack;


class Question {
    public static void sort(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<Integer>();
        int min = Integer.MAX_VALUE;

        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!tempStack.isEmpty() && temp < tempStack.peek()) {
                stack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());
    }
}
