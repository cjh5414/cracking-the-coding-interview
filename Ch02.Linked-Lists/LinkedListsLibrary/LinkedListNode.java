package LinkedListsLibrary;


public class LinkedListNode {
    public LinkedListNode next;
    // public LinkedListNode prev;
    public int data;

    public LinkedListNode(int data) {
        this.data = data;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

//    public void setPrevious(LinkedListNode prev) {
//        this.prev = prev;
//    }

    public String printForward() {
        if (next != null)
            return data + " -> " + next.printForward();
        else
            return ((Integer) data).toString();
    }
}
