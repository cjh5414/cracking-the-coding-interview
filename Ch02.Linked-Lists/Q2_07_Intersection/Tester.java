package Q2_07_Intersection;

import LinkedListsLibrary.LinkedListNode;


public class Tester {
    public static void main(String[] args) {
        int[] intlist1 = {0, 1};
        int[] intlist2 = {8, 1, 9};

        LinkedListNode head = new LinkedListNode(intlist1);
        LinkedListNode head2 = new LinkedListNode(intlist2);

        LinkedListNode temp = null;
        LinkedListNode node1 = new LinkedListNode(2);
        LinkedListNode node2 = new LinkedListNode(3);
        node1.next = node2;

        temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = node1;

        temp = head2;
        while (temp.next != null) temp = temp.next;
        temp.next = node1;

        LinkedListNode startOfIntersection = QuestionA.getIntersection(head, head2);

        System.out.println(head.printForward());
        System.out.println(head2.printForward());
        if (startOfIntersection == null)
            System.out.println("Null");
        else
            System.out.println(startOfIntersection.data);
    }
}
