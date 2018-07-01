package Q2_04_Partition;

import LinkedListsLibrary.LinkedListNode;


public class QuestionB {
    public static void partition(LinkedListNode n, int mid) {
        LinkedListNode firstHead = null;
        LinkedListNode secondHead = null;
        LinkedListNode firstTail = null;
        LinkedListNode secondTail = null;

        while (n != null) {
            System.out.println(n.data);
            if (n.data >= mid) {
                if (secondHead == null) {
                    secondHead = n;
                    secondTail = n;
                }
                else {
                    secondTail.next = n;
                    secondTail = secondTail.next;
                }
            }
            else {
                if (firstHead == null) {
                    firstHead = n;
                    firstTail = n;
                }
                else {
                    firstTail.next = n;
                    firstTail = firstTail.next;
                }
            }
            n = n.next;
        }

        secondTail.next = null;
        firstTail.next = secondHead;
        n = firstHead;
    }
}
