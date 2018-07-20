package Q3_01_Three_in_One;

import java.util.EmptyStackException;


public class MultiStack {
    private int numberOfStacks = 3;
    private int[] array;
    private int[] index = new int[numberOfStacks];
    private int size = 0;

    public MultiStack(int size) {
        array = new int[size * numberOfStacks];
        this.size = size;
    }

    public void push(int i, int data) {
        if (isFull(i))
            throw new EmptyStackException();

        array[(size * i) + index[i]++] = data;
    }

    public int peek(int i) {
        if (isEmpty(i))
            throw new EmptyStackException();

        return array[(size * i) + index[i] - 1];
    }

    public int pop(int i) {
        if (isEmpty(i))
            throw new EmptyStackException();

        return array[(size * i) + (index[i]--) - 1];
    }

    public boolean isFull(int i) {
        return index[i] >= (size * (i + 1) - 1);
    }

    public boolean isEmpty(int i) {
        return index[i] <= (size * i);
    }

    public void print() {
        for (int i = 0; i < numberOfStacks; i++) {
            System.out.print(i + "|");
            for (int j = size * i; j < (size * i) + index[i]; j++)
                System.out.print(array[j] + " ");
            System.out.print("  ");
        }
        System.out.println();
    }
}
