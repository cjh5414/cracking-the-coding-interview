package Q3_05_Sort_Stack;

import java.util.Stack;


class Question {
    public static Stack<Integer> sort(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<Integer>();
        int min = Integer.MAX_VALUE;

        while (!stack.isEmpty()) {
            int temp = stack.pop();
            if (temp < min) {
                if (min != Integer.MAX_VALUE)
                    tempStack.push(min);
                min = temp;
            }
            else
                tempStack.push(temp);
        }

        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());

        stack.push(min);

        return stack;
    }
}
