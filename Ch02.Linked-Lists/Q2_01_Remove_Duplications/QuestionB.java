package Q2_01_Remove_Duplications;

import java.util.HashSet;
import LinkedListsLibrary.LinkedListNode;


public class QuestionB {
    public static void removeDups(LinkedListNode temp) {
        LinkedListNode cur = temp;
        LinkedListNode n;

        while (cur != null) {
            n = cur;
            while (n.next != null) {
                if (cur.data == n.next.data) {
                    n.next = n.next.next;
                } else {
                    n = n.next;
                }
            }
            cur = cur.next;
        }
    }
}
