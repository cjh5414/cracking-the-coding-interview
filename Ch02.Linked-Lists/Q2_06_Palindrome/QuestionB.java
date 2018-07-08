package Q2_06_Palindrome;

import java.util.*;

import LinkedListsLibrary.LinkedListNode;


public class QuestionB {
    public static boolean isPalindrome(LinkedListNode head) {
        LinkedListNode slow = head;
        LinkedListNode fast = head;
        Stack<Integer> stack = new Stack<Integer>();

        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null)
            slow = slow.next;

        while (slow != null) {
            if (slow.data != stack.pop()) return false;
            slow = slow.next;
        }

        return true;
    }
}
