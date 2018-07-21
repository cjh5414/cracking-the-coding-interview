package Q3_02_Stack_Min;


public class Tester {
    public static void main(String[] args) {
        StackWithMin stackWithMin = new StackWithMin();

        stackWithMin.push(5);
        System.out.println(stackWithMin.getMin());
        stackWithMin.push(6);
        System.out.println(stackWithMin.getMin());
        stackWithMin.push(3);
        System.out.println(stackWithMin.getMin());
        stackWithMin.push(7);
        System.out.println(stackWithMin.getMin());
        stackWithMin.pop();
        System.out.println(stackWithMin.getMin());
        stackWithMin.pop();
        System.out.println(stackWithMin.getMin());
    }
}
