package Q3_03_Stack_of_Plates;


public class Tester {
    public static void main(String[] args) {
        SetOfStacks setOfStacks = new SetOfStacks();

        for (int i = 0; i < 36; i++)
            setOfStacks.push(i);

        for (int i = 0; i < 37; i++)
            System.out.println("Popped " + setOfStacks.pop());
    }
}
