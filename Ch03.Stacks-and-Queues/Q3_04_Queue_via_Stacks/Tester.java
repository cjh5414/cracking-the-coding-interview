package Q3_04_Queue_via_Stacks;


public class Tester {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.push(2);
        myQueue.push(4);
        myQueue.push(10);

        myQueue.print();

        System.out.println("Pop: " + myQueue.pop());
        System.out.println("Pop: " + myQueue.pop());
        System.out.println("Pop: " + myQueue.pop());
    }
}
