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

    public void push(int value) {
        if (stacks.get(stackIndex).size() == 10) {
            stacks.add(new Stack<Integer>());
            stackIndex++;
        }

        stacks.get(stackIndex).push(value);
    }

    public int pop() {
        if (stacks.get(stackIndex).isEmpty()) {
            if (stackIndex == 0)
                throw new EmptyStackException();
            else
                stackIndex--;
        }

        return stacks.get(stackIndex).pop();
    }
}
