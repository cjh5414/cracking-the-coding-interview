package LinkedListsLibrary;


public class LinkedListNode {
    public LinkedListNode next;
    // public LinkedListNode prev;
    public int data;

    public LinkedListNode(int data) {
        this.data = data;
    }

    public LinkedListNode(int[] intlist) {
        this.data = intlist[0];
        LinkedListNode temp = this;

        for (int i = 1; i < intlist.length; i++) {
            LinkedListNode newNode = new LinkedListNode(intlist[i]);
            temp.next = newNode;
            temp = temp.next;
        }
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

    public LinkedListNode clone() {
        LinkedListNode newHead = new LinkedListNode(this.data);

        if (next != null) {
            newHead.next = next.clone();
        }

        return newHead;
    }
}
