package Q1_06_String_Compression;


public class Tester {
    public static void main(String[] args) {
        String[] strArray = {"aabccccaaa", "abcd", "aaaaaaaabcd", "abcdddd", "abbbbc", "aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbb"};

        for (String s : strArray) {
            String answerA = QuestionA.compress(s);
            String answerB = QuestionB.compress(s);
            String answerC = QuestionC.compress(s);

            System.out.println(answerA.length());
            System.out.println(answerB.length());
            System.out.println(answerC.length());

            if (answerA.equals(answerB)) {

                System.out.println(s + " -> " + answerA);
            }

            else {
                System.out.println(s + " -> ");
                System.out.println("A." + answerA);
                System.out.println("B." + answerB);
                System.out.println("C." + answerC);
            }
        }
    }
}