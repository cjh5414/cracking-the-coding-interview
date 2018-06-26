package Q2_02_Return_Kth_To_Last;

import LinkedListsLibrary.LinkedListNode;


public class QuestionB {
    public static int count = 0;

    public static Integer getKthToLast(LinkedListNode n, int p) {
        if (n == null)
            count = 0;
        else {
            Integer result = getKthToLast(n.next, p);
            if (result != null)
                return result;
            count++;
            if (count == p)
                return n.data;
        }

        return null;
    }
}
