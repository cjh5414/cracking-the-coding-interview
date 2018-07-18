package StackAndQueueLibrary;

import java.util.LinkedList;
import java.util.Iterator;


public class MyQueue<T> {
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }

        public T getData() {
            return this.data;
        }
    }

    private QueueNode<T> head = null;
    private QueueNode<T> tail = null;

    public void add(T data) {
        QueueNode<T> node = new QueueNode<T>(data);

        if (head == null)
            head = tail = node;

        else {
            tail.next = node;
            tail = node;
        }
    }

    public T remove() {
        T data = head.getData();
        head = head.next;
        if (head == null) tail = null;
        return data;
    }

    public T peek() {
        return head.getData();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        QueueNode<T> temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
