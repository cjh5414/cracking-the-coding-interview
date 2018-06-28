package Q2_04_Partition;

import LinkedListsLibrary.LinkedListNode;


public class QuestionA {
    public static void partition(LinkedListNode n, int mid) {
        LinkedListNode end = n;
        LinkedListNode left = n;
        LinkedListNode right = n;

        while (end != null) {
            end = end.next;
            if (end == null)
                break;

            end = end.next;
            right = right.next;
        }

        while (right != null) {
            while (right.data >= mid) {
                if (right.next == null)
                    return;

                right = right.next;
            }

            while (left.data < mid)
                left = left.next;

            int temp = right.data;
            right.data = left.data;
            left.data = temp;
        }
    }
}
