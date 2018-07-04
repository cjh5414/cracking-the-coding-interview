package Q2_05_Sum_Lists;

import LinkedListsLibrary.LinkedListNode;


public class Tester {
    public static void main(String[] args) {
        int[] intlist1 = {6, 1, 7};
        int[] intlist2 = {2, 9, 5};

        LinkedListNode num1 = new LinkedListNode(intlist1);
        LinkedListNode num2 = new LinkedListNode(intlist2);
        //LinkedListNode result = QuestionA.sumLists(num1, num2);
        LinkedListNode result = QuestionB.sumLists(num1, num2);

        System.out.println(num1.printForward());
        System.out.println(num2.printForward());
        System.out.println(result.printForward());
    }
}
