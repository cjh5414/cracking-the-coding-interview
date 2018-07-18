package StackAndQueueLibrary;

public class QueueTester {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<Integer>();

        System.out.println("Origin : ");
        myQueue.add(10);
        myQueue.add(32);
        myQueue.add(5);
        myQueue.print();

        System.out.println("Pop " + myQueue.remove() + " : ");
        myQueue.print();

        System.out.println("Peek " + myQueue.peek() + " : ");
        myQueue.print();

        System.out.println("IsEmpty : " + myQueue.isEmpty());
    }
}
