package Q1_06_String_Compression;


public class Tester {
    public static void main(String[] args) {
        String[] strArray = {"aabccccaaa", "abcd", "aaaaaaaabcd", "abcdddd", "abbbbc", "aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbb"};

        System.out.println("Question A.");
        for (String s : strArray)
            System.out.println(s + " -> " + QuestionA.compress(s));

        System.out.println("Question B.");
        for (String s : strArray)
            System.out.println(s + " -> " + QuestionB.compress(s));
    }
}