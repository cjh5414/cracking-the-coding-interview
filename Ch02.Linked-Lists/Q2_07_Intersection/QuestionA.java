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
            temp2 = temp2.next;
        }

        if (temp1 != temp2) return null;

        temp1 = head1;
        temp2 = head2;

        if (len1 > len2) {
            for (int i = 0; i < len1 - len2; i++)
                temp1 = temp1.next;
        }

        else if (len1 < len2) {
            for (int i = 0; i < len2 - len1; i++)
                temp2 = temp2.next;
        }

        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1;
    }
}
