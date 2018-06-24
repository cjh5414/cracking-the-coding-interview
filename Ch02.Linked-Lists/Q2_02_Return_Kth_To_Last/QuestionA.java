package Q2_02_Return_Kth_To_Last;

import LinkedListsLibrary.LinkedListNode;


public class QuestionA {
    public static Integer getKthToLast(LinkedListNode n, int p) {
        LinkedListNode head = n;
        int count = 0;

        while (n != null) {
            count++;
            n = n.next;
        }

        if (p > count)
            return null;

        n = head;
        for (int i = 0; i < count - p; i++)
            n = n.next;

        return n.data;
    }
}
