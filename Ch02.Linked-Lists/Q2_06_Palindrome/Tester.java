package Q2_06_Palindrome;

import LinkedListsLibrary.LinkedListNode;


public class Tester {
    public static void main(String[] args) {
        int[] intlist1 = {0, 1, 2, 2, 1, 0};
        int[] intlist2 = {0, 1, 2, 2, 0};

        LinkedListNode head = new LinkedListNode(intlist1);

        System.out.println(head.printForward());
        System.out.println("A. Palindrome : " + QuestionA.isPalindrome(head));
        System.out.println("B. Palindrome : " + QuestionB.isPalindrome(head));

        LinkedListNode head2 = new LinkedListNode(intlist2);

        System.out.println(head2.printForward());
        System.out.println("A. Palindrome : " + QuestionA.isPalindrome(head2));
        System.out.println("B. Palindrome : " + QuestionB.isPalindrome(head2));
    }
}
