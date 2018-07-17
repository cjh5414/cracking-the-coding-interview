package StackAndQueueLibrary;

public class StackTester {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<Integer>();

        System.out.println("Origin : ");
        myStack.push(10);
        myStack.push(32);
        myStack.push(5);
        myStack.print();

        System.out.println("Pop " + myStack.pop() + " : ");
        myStack.print();

        System.out.println("Peek " + myStack.peek() + " : ");
        myStack.print();

        System.out.println("IsEmpty : " + myStack.isEmpty());
    }
}
