package Q2_08_Loop_Detection;

import LinkedListsLibrary.LinkedListNode;


public class QuestionA {
    public static LinkedListNode findStartCircle(LinkedListNode head) {
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast == null && fast.next != null) {
            if (fast == slow) {
                System.out.println("hi");
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return null;
    }
}
