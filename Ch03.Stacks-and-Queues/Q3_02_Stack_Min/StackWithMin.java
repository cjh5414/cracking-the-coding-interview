package Q3_02_Stack_Min;

import java.util.Stack;


class StackWithMin extends Stack<NodeWithMin> {
    public void push(int value) {
        int min = Integer.MAX_VALUE;
        if (!isEmpty())
            min = peek().min;

        min = min > value ? value : min;

        super.push(new NodeWithMin(value, min));
    }

    public int getMin() {
        return this.peek().min;
    }
}