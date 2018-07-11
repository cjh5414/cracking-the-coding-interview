package Q2_07_Intersection;

import LinkedListsLibrary.LinkedListNode;


public class QuestionA {
    public static class TailAndLen {
        int length = 0;
        LinkedListNode tailNode = null;
        public TailAndLen(LinkedListNode tail, int length) {
            this.tailNode = tail;
            this.length = length;
        }
    }

    public static TailAndLen getTailAndLen(LinkedListNode head) {
        int length = 1;

        while (head.next != null) {
            length++;
            head = head.next;
        }

        return new TailAndLen(head, length);
    }

    public static LinkedListNode getIntersection(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode result = null;
        LinkedListNode temp1 = head1, temp2 = head2;

        TailAndLen tailAndLen1 = getTailAndLen(head1);
        TailAndLen tailAndLen2 = getTailAndLen(head2);

        if (tailAndLen1.tailNode != tailAndLen2.tailNode) return null;

        LinkedListNode shorter = tailAndLen1.length > tailAndLen2.length ? head2 : head1;
        LinkedListNode longer = tailAndLen1.length > tailAndLen2.length ? head1 : head2;

        for (int i = 0; i < Math.abs(tailAndLen1.length - tailAndLen2.length); i++)
            longer = longer.next;

        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }

        return longer;
    }
}
