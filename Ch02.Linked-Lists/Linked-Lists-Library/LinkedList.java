package Linked-Lists-Library;


public class LinkedList {
    private LinkedList next;
    private int data;

    public LinkedList(int data) {
        this.data = data;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }
}
