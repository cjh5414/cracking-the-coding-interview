package StackAndQueueLibrary;

import java.util.LinkedList;
import java.util.Iterator;


public class MyStack<T> {
    private static class StackNode<T> {
        T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode head = null;

    public void push(T data) {
        StackNode<T> node = new StackNode<T>(data);
        node.next = head;
        head = node;
    }

    public T pop() {
        StackNode<T> temp = head;
        head = head.next;
        return temp.data;
    }

    public void print() {
        StackNode<T> temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}

