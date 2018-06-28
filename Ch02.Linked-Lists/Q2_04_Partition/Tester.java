package Q2_04_Partition;

import LinkedListsLibrary.LinkedListNode;


public class Tester {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode temp = head;

        int[] intList = {2, 3, 5, 10, 2, 1};

        for (int n : intList) {
            temp.setNext(new LinkedListNode(n));
            temp = temp.next;
        }

        System.out.println(head.printForward());
        QuestionA.partition(head, 5);
        System.out.println(head.printForward());
    }
}
