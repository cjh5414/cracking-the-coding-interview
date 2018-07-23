package Q3_02_Stack_Min;

import java.util.Stack;


class StackWithMin2 extends Stack<Integer> {
    private Stack<Integer> minStack = new Stack<Integer>();

    public void push(int value) {
        if (min() > value)
            minStack.push(value);
        super.push(value);
    }

    public Integer pop() {
        int val = super.pop();

        if (min() == val)
            minStack.pop();
        return val;
    }

    public int min() {
        if (minStack.isEmpty())
            return Integer.MAX_VALUE;
        else
            return minStack.peek();

    }

    public int getMin() {
        return minStack.peek();
    }
}