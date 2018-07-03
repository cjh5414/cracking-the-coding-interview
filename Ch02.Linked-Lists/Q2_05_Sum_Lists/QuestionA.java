package Q2_05_Sum_Lists;

import LinkedListsLibrary.LinkedListNode;


public class QuestionA {
    public static LinkedListNode sumLists(LinkedListNode n1, LinkedListNode n2) {
        LinkedListNode resultHead = null;
        LinkedListNode resultTemp = null;
        boolean carry = false;

        while (!(n1 == null && n2 == null)) {
            int num1 = 0, num2 = 0, sum = 0;

            if (n1 != null) num1 = n1.data;
            if (n2 != null) num2 = n2.data;
            sum = num1 + num2;

            if (carry) sum++;

            if (sum > 9) {
                carry = true;
                sum -= 10;
            } else
                carry = false;

            LinkedListNode temp = new LinkedListNode(sum);

            if (resultHead == null)
                resultHead = resultTemp = temp;
            else {
                resultTemp.next = temp;
                resultTemp = temp;
            }

            if (n1 != null) n1 = n1.next;
            if (n2 != null) n2 = n2.next;
        }

        if (carry)
            resultTemp.next = new LinkedListNode(1);

        return resultHead;
    }
}
