package Q2_03_Delete_Middle_Node;

import LinkedListsLibrary.LinkedListNode;


public class QuestionA {
    public static boolean deleteNode(LinkedListNode n) {
        if (n == null && n.next == null)
            return false;

        n.data = n.next.data;
        n.next = n.next.next;
        return true;
    }
}
