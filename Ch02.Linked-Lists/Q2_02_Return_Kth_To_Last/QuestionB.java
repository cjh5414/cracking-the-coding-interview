package Q2_02_Return_Kth_To_Last;

import LinkedListsLibrary.LinkedListNode;


public class QuestionB {
    public static int count = 0;

    public static Integer getKthToLast(LinkedListNode n, int p) {
        if (n.next == null)
            count = 1;
        else {
            getKthToLast(n.next, p);
            count++;
            if (count == p)
                return n.data;
        }

        return null;
    }
}
