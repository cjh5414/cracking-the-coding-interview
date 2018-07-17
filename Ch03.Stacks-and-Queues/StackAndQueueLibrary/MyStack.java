package StackAndQueueLibrary;

import java.util.LinkedList;
import java.util.Iterator;


public class MyStack<T> {
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }

        public T getData() {
            return this.data;
        }
    }

    private StackNode<T> head = null;

    public void push(T data) {
        StackNode<T> node = new StackNode<T>(data);
        node.next = head;
        head = node;
    }

    public T pop() {
        StackNode<T> temp = head;
        head = head.next;
        return temp.getData();
    }

    public T peek() {
        return head.getData();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        StackNode<T> temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
