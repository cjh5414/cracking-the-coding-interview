package Q2_01_Remove_Duplications;

import LinkedListsLibrary.LinkedListNode;


public class Tester {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode head2;
        LinkedListNode temp = head;

        int[] intList = {3, 3, 4, 2, 3, 2, 5};

        for (int n : intList) {
            temp.setNext(new LinkedListNode(n));
            temp = temp.next;
        }

        head2 = head.clone();

        System.out.println(head.printForward());
        System.out.println(head2.printForward());

        QuestionA.removeDups(head);
        QuestionB.removeDups(head2);

        System.out.println(head.printForward());
        System.out.println(head2.printForward());
    }
}
