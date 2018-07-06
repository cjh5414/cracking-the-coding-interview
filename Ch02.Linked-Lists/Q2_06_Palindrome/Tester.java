package Q2_06_Palindrome;

import LinkedListsLibrary.LinkedListNode;


public class Tester {
    public static void main(String[] args) {
        int[] intlist = {0, 1, 2, 2, 0};

        LinkedListNode head = new LinkedListNode(intlist);

        System.out.println(head.printForward());
        System.out.println(" Palindrome : " + QuestionA.isPalindrome(head));
    }
}
