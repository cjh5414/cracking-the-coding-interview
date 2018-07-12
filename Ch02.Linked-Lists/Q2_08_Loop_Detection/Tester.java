package Q2_08_Loop_Detection;

import LinkedListsLibrary.LinkedListNode;


public class Tester {
    public static void main(String[] args) {
        int[] intlist = {1, 2, 3, 4, 5};

        LinkedListNode head = new LinkedListNode(intlist);

        LinkedListNode temp = null;
        LinkedListNode node3 = null;

        temp = head;
        while (temp.next != null) {
            temp = temp.next;
            if (temp.data == 3)
                node3 = temp;
        }
        temp.next = node3;

        temp = head;
        for (int i = 0; i < 6; i++) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("");

        LinkedListNode startNode = QuestionA.findStartCircle(head);
        System.out.println("Start : " + startNode.data);
    }
}
