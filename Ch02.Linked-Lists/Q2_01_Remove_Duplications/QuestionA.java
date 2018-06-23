package Q2_01_Remove_Duplications;

import java.util.HashSet;
import LinkedListsLibrary.LinkedListNode;


public class QuestionA {
    public static void removeDups(LinkedListNode temp) {
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode prev = null;

        while (temp != null) {
            if (set.contains(temp.data)) {
                prev.next = temp.next;
            }
            else {
                set.add(temp.data);
                prev = temp;
            }
            temp = temp.next;
        }
    }
}
