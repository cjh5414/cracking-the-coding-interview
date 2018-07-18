package StackAndQueueLibrary;

public class QueueTester {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<Integer>();

        System.out.println("Origin : ");
        myQueue.push(10);
        myQueue.push(32);
        myQueue.push(5);
        myQueue.print();

        System.out.println("Pop " + myQueue.pop() + " : ");
        myQueue.print();

        System.out.println("Peek " + myQueue.peek() + " : ");
        myQueue.print();

        System.out.println("IsEmpty : " + myQueue.isEmpty());
    }
}
