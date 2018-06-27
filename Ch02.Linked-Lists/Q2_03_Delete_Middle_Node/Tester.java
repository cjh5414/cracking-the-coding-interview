package Q2_03_Delete_Middle_Node;

import LinkedListsLibrary.LinkedListNode;


public class Tester {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode temp = head;

        int[] intList = {3, 3, 4, 2, 3, 2, 5};

        for (int n : intList) {
            temp.setNext(new LinkedListNode(n));
            temp = temp.next;
        }

        System.out.println(head.printForward());
        QuestionA.deleteNode(head.next.next);
        System.out.println(head.printForward());


    }
}
