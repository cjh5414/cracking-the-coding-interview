package Q3_03_Stack_of_Plates;

import java.util.ArrayList;
import java.util.Stack;
import java.util.EmptyStackException;


public class SetOfStacks {
    private ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();
    private int capacity = 10;
    private int stackIndex = 0;

    public SetOfStacks() {
        stacks.add(new Stack<Integer>());
    }

    public Stack<Integer> getLastStack() {
        if (stacks.size() == 0)
            return null;
        return stacks.get(stacks.size() - 1);
    }

    public void push(int value) {
        Stack<Integer> lastStack = getLastStack();
        if (lastStack != null || lastStack.size() == capacity)
            lastStack.push(value);
        else {
            Stack<Integer> newStack = new Stack<Integer>();
            newStack.push(value);
            stacks.add(newStack);
        }
    }

    public int pop() {
        Stack<Integer> lastStack = getLastStack();
        if (lastStack == null)
            throw new EmptyStackException();

        else if (lastStack.size() == 1)
            stacks.remove(lastStack);

        return lastStack.pop();
    }
}
