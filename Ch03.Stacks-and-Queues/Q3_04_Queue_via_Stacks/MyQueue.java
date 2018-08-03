package Q3_04_Queue_via_Stacks;

import java.util.Stack;

class MyQueue<T> {
    Stack<T> newStack = new Stack<T>();
    Stack<T> oldStack = new Stack<T>();

    public void push(T value) {
        newStack.push(value);
    }

    public T pop() {
        if (oldStack.empty()) {
            int newStackSize = newStack.size();
            for (int i = 0; i < newStackSize - 1; i++) {
                oldStack.push(newStack.pop());
            }
            return newStack.pop();
        }
        else {
            return oldStack.pop();
        }
    }

    public T peek() {
        if (oldStack.empty()) {
            int newStackSize = newStack.size();

            for (int i = 0; i < newStackSize; i++) {
                oldStack.push(newStack.pop());
            }
            return oldStack.peek();
        }
        else {
            return oldStack.peek();
        }
    }
}