package Q3_05_Sort_Stack;

import java.util.Stack;

class SortStack {
    Stack<Integer> tempStack = new Stack<Integer>();
    StackNode head;

    private void realPush(int value) {
        StackNode temp = new StackNode(value);
        temp.next = head;
        head = temp;
    }

    public void push(int value) {
        if (isEmpty())
            realPush(value);
        else {
            while (value > peek()) tempStack.push(pop());

            realPush(value);
            while (!tempStack.isEmpty()) {
                realPush(tempStack.pop());
            }
        }
    }

    public int pop() {
        StackNode temp = head;
        head = head.next;

        return temp.value;
    }

    public int peek() {
        return head.value;
    }

    public boolean isEmpty() {
        if (head == null) return true;
        else return false;
    }

    class StackNode {
        int value;
        StackNode next;

        public StackNode(int value) {
            this.value = value;
        }
    }
}
