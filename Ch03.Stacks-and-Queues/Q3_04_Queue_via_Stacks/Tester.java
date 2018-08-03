package Q3_04_Queue_via_Stacks;


public class Tester {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<Integer>();

        myQueue.push(2);
        System.out.println("Peek: " + myQueue.peek());
        myQueue.push(4);
        System.out.println("Peek: " + myQueue.peek());
        myQueue.push(10);

        System.out.println("Pop: " + myQueue.pop());
        System.out.println("Pop: " + myQueue.pop());
        System.out.println("Pop: " + myQueue.pop());

        myQueue.push(3);
        myQueue.push(7);

        System.out.println("Peek: " + myQueue.peek());
        System.out.println("Pop: " + myQueue.pop());
        System.out.println("Peek: " + myQueue.peek());

        myQueue.push(9);

        System.out.println("Pop: " + myQueue.pop());
        System.out.println("Pop: " + myQueue.pop());

    }
}
