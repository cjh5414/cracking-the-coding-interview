package Q3_05_Sort_Stack;

import java.util.Stack;


public class Tester {
    public static void main(String[] args) {
        SortStack sortStack = new SortStack();

        sortStack.push(5);
        sortStack.push(1);
        sortStack.push(3);

        System.out.println("5 1 3 | peek : " + sortStack.peek());

        sortStack.push(2);
        sortStack.push(4);

        System.out.println("5 1 3 2 4 | peek : " + sortStack.peek());

        while (!sortStack.isEmpty())
            System.out.println("pop : " + sortStack.pop());
        System.out.println("");

        for (int i = 0; i < 2; i++) {
            System.out.println("Question " + i);
            Stack<Integer> stack = new Stack<Integer>();
            stack.push(5);
            stack.push(7);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(6);
            stack.push(1);
            stack.push(8);
            stack.push(5);

            if (i == 0)
                Question.sort(stack);
            else if (i == 1)
                QuestionB.mergeSort(stack);

            while (!stack.isEmpty())
                System.out.println("pop : " + stack.pop());
        }
    }
}
