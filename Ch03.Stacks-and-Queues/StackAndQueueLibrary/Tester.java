package StackAndQueueLibrary;

public class Tester {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<Integer>();

        myStack.push(10);
        myStack.push(32);
        myStack.push(5);

        myStack.print();

        myStack.pop();

        myStack.print();
    }
}
