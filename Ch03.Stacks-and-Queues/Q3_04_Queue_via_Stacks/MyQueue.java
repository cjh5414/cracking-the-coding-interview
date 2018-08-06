package Q3_04_Queue_via_Stacks;

import java.util.Stack;

class MyQueue<T> {
    Stack<T> newStack = new Stack<T>();
    Stack<T> oldStack = new Stack<T>();

    public void push(T value) {
        newStack.push(value);
    }

    public void shiftStacks() {
        if (oldStack.empty()) {
            int newStackSize = newStack.size();
            for (int i = 0; i < newStackSize; i++) {
                oldStack.push(newStack.pop());
            }
        }
    }

    public T pop() {
        shiftStacks();
        return oldStack.pop();
    }

    public T peek() {
        shiftStacks();
        return oldStack.peek();
    }
}