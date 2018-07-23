package Q3_02_Stack_Min;

import java.util.Stack;


class StackWithMin2 extends Stack<Integer> {
    private Stack<Integer> minStack = new Stack<Integer>();

    public void push(int value) {
        if (isEmpty() || minStack.peek() > value)
            minStack.push(value);
        super.push(value);
    }

    public Integer pop() {
        if (minStack.peek() == this.peek())
            minStack.pop();
        return super.pop();
    }

    public int getMin() {
        return minStack.peek();
    }
}