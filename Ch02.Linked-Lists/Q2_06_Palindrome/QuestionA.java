package Q2_06_Palindrome;

import LinkedListsLibrary.LinkedListNode;


public class QuestionA {
    public static LinkedListNode reverseAndClone(LinkedListNode n) {
        LinkedListNode result = null;

        if (n == null) return null;

        while (n != null) {
            LinkedListNode temp = new LinkedListNode(n.data);
            temp.next = result;
            result = temp;
            n = n.next;
        }

        return result;
    }

    public static boolean isEqual(LinkedListNode n1, LinkedListNode n2) {
        while (n1.next != null && n2.next != null) {
            if (n1.data != n2.data) return false;
            n1 = n1.next;
            n2 = n2.next;
        }

        if (n1.next != null || n2.next != null) return false;
        return true;
    }

    public static boolean isPalindrome(LinkedListNode head) {
        LinkedListNode reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }
}
