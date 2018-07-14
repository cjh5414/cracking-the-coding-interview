package StackAndQueueLibrary;

import java.util.LinkedList;
import java.util.Iterator;


public class MyStack<T> {
    LinkedList<T> list = new LinkedList<T>();

    public void push(T n) {
        list.add(n);
    }

    public T pop() {
        return list.removeLast();
    }

    public void print() {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            System.out.print(" ");
        }
    }
}

