package Q3_02_Stack_Min;

import java.util.Stack;


class StackWithMin extends Stack<NodeWithMin> {
    public void push(int value) {
        int min = Math.min(min(), value);
        super.push(new NodeWithMin(value, min));
    }

    public int min() {
        if (isEmpty())
            return Integer.MAX_VALUE;
        else
            return peek().min;

    }

    public int getMin() {
        return this.peek().min;
    }
}