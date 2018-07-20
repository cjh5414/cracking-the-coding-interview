package Q3_01_Three_in_One;


public class Tester {
    public static void main(String[] args) {
        MultiStack stacks = new MultiStack(5);

        stacks.push(0, 10);
        stacks.push(1, 11);

        stacks.print();

//        stacks.pop(2);
//        stacks.peek(2);

        stacks.push(0, 20);
        stacks.push(0, 30);
        stacks.push(1, 21);
        stacks.push(1, 31);

        stacks.print();
        System.out.println("Peek(0): " + stacks.peek(0));
        System.out.println("Peek(1): " + stacks.peek(1));

        stacks.push(2, 12);
        stacks.push(2, 22);
        stacks.push(2, 32);
        stacks.push(1, 41);
        stacks.push(0, 40);
        stacks.push(2, 42);

        stacks.print();
        System.out.println("Peek(0): " + stacks.peek(0));
        System.out.println("Peek(1): " + stacks.peek(1));
        System.out.println("Peek(2): " + stacks.peek(2));

        System.out.println("Pop(2): ");
        stacks.pop(2);
        stacks.print();

        System.out.println("Pop(1): ");
        stacks.pop(1);
        stacks.print();

        stacks.push(0, 50);
        stacks.print();
    }
}
