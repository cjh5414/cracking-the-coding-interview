package Q3_05_Sort_Stack;


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

    }
}
