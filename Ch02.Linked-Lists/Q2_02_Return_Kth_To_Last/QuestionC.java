package Q2_02_Return_Kth_To_Last;

import LinkedListsLibrary.LinkedListNode;


public class QuestionC {
    public static int count = 0;

    public static Integer getKthToLast(LinkedListNode n, int p) {
        LinkedListNode last = n;
        for (int i = 0; i < p; i++) {
            if (last == null)
                return null;
            last = last.next;
        }

        while (last != null) {
            last = last.next;
            n = n.next;
        }

        return n.data;
    }
}
