package Q3_05_Sort_Stack;

import java.util.Stack;


class QuestionC {
    public static Stack quickSort(Stack<Integer> stack) {
        if (stack.size() <= 1) return stack;

        int pivot = stack.pop();
        Stack<Integer> low = new Stack<Integer>();
        Stack<Integer> high = new Stack<Integer>();

        while (!stack.isEmpty()) {
            if (stack.peek() > pivot)
                high.push(stack.pop());
            else
                low.push(stack.pop());
        }

        low = quickSort(low);
        high = quickSort(high);

        high.push(pivot);

        Stack<Integer> tmp = new Stack<Integer>();

        while (!low.isEmpty())
            tmp.push(low.pop());

        while (!tmp.isEmpty())
            high.push(tmp.pop());

        return high;
    }
}
