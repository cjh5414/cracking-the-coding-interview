package Q3_05_Sort_Stack;

import java.util.Stack;


class QuestionB {
    public static Stack mergeSort(Stack<Integer> stack) {
        if (stack.size() <= 1) return stack;

        Stack<Integer> left = new Stack<Integer>();
        Stack<Integer> right = new Stack<Integer>();
        Stack<Integer> tempStack = new Stack<Integer>();
        int count = 0;

        while (!stack.isEmpty()) {
            if (count == 0)
                left.push(stack.pop());
            else
                right.push(stack.pop());

            count = (count + 1) % 2;
        }

        left = mergeSort(left);
        right = mergeSort(right);

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.peek() < right.peek())
                tempStack.push(left.pop());
            else
                tempStack.push(right.pop());
        }

        if (left.isEmpty()) {
            while (!right.isEmpty())
                tempStack.push(right.pop());
        }
        else {
            while (!left.isEmpty())
                tempStack.push(left.pop());
        }

        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());

        return stack;
    }
}
