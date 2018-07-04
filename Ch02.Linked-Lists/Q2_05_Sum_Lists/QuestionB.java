package Q2_05_Sum_Lists;

import LinkedListsLibrary.LinkedListNode;


public class QuestionB {
    public static boolean carry = false;

    public static LinkedListNode sumLists(LinkedListNode n1, LinkedListNode n2) {
        LinkedListNode result;

        int sum = n1.data + n2.data;
        if (sum > 9) {
            carry = true;
            sum -= 10;
        } else {
            carry = false;
        }

        if (n1.next == null)
            return new LinkedListNode(sum);
        else {
            result = new LinkedListNode(sum);
            result.next = sumLists(n1.next, n2.next);

            if (carry) result.data++;
        }

        return result;
    }
}
