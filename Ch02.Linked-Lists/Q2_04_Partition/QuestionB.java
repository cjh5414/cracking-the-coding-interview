package Q2_04_Partition;

import LinkedListsLibrary.LinkedListNode;


public class QuestionB {
    public static void partition(LinkedListNode n, int mid) {
        LinkedListNode firstHead = null;
        LinkedListNode secondHead = null;
        LinkedListNode firstTail = null;
        LinkedListNode secondTail = null;
ㅎ
        while (n != null) {
            if (n.data >= mid) {
                if (secondHead == null)
                    secondHead = secondTail = n;
                secondTail.next = n;
            }
            else {
                if (firstHead == null)
                    firstHead = firstTail = n;
                firstTail.next = n;
            }
            n = n.next;
        }

        firstTail.next = secondHead;
        n = firstHead;
    }
}
