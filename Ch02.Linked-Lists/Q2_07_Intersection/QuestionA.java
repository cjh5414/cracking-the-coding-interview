package Q2_07_Intersection;

import LinkedListsLibrary.LinkedListNode;


public class QuestionA {
    public static LinkedListNode getIntersection(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode result = null;
        LinkedListNode temp1 = head1, temp2 = head2;
        int len1 = 1, len2 = 1;

        while (temp1.next != null) {
            len1++;
            temp1 = temp1.next;
        }

        while (temp2.next != null) {
            len2++;
            tepm2 = temp2.next;
        }

        if (temp1 != temp2) return null;

    }
}
