package Q2_07_Intersection;

import LinkedListsLibrary.LinkedListNode;


public class Tester {
    public static void main(String[] args) {
        int[] intlist1 = {0, 1, 2, 3};
        int[] intlist2 = {1, 2, 2, 3};

        LinkedListNode head = new LinkedListNode(intlist1);
        LinkedListNode head2 = new LinkedListNode(intlist2);

        LinkedListNode startOfIntersection = QuestionA.getIntersection(head, head2);

        System.out.println(head.printForward());
        System.out.println(head2.printForward());
        if (startOfIntersection == null)
            System.out.println("Null");
        else
            System.out.println(startOfIntersection.data);
    }
}
