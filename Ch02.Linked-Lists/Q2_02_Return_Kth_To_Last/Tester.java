package Q2_02_Return_Kth_To_Last;

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
        System.out.println("Question A.");
        System.out.println("뒤에서 1번째" + QuestionA.getKthToLast(head, 1));
        System.out.println("뒤에서 3번째" + QuestionA.getKthToLast(head, 3));
        System.out.println("뒤에서 6번째" + QuestionA.getKthToLast(head, 6));
        System.out.println("뒤에서 20번째" + QuestionA.getKthToLast(head, 20));

        System.out.println("Question B.");
        System.out.println("뒤에서 1번째" + QuestionB.getKthToLast(head, 1));
        System.out.println("뒤에서 3번째" + QuestionB.getKthToLast(head, 3));
        System.out.println("뒤에서 6번째" + QuestionB.getKthToLast(head, 6));
        System.out.println("뒤에서 20번째" + QuestionB.getKthToLast(head, 20));

        System.out.println("Question C.");
        System.out.println("뒤에서 1번째" + QuestionC.getKthToLast(head, 1));
        System.out.println("뒤에서 3번째" + QuestionC.getKthToLast(head, 3));
        System.out.println("뒤에서 6번째" + QuestionC.getKthToLast(head, 6));
        System.out.println("뒤에서 20번째" + QuestionC.getKthToLast(head, 20));
    }
}
