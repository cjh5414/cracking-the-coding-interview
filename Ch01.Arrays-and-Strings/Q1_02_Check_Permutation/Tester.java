package Q1_02_Check_Permutation;

public class Tester {
    public static void main(String[] args) {
        String[] words1 = {"a",  "aaa", "ab", "bca", "abc", "a bc", "w ord", "Aabc", "Aabc"};
        String[] words2 = {"aa", "aaa", "abc", "abc", "bcd", "cba", "ord w", "abcA", "cbaa"};
        for (int i = 0; i < words1.length; i++) {
            boolean result_a = QuestionA.are_permutation(words1[i], words2[i]);
            boolean result_b = QuestionB.are_permutation(words1[i], words2[i]);
            if (result_a == result_b)
                System.out.printf("Test %d. %s, %s = %s\n", i, words1[i], words2[i], result_a);
            else
                System.out.printf("Test %d. %s, %s = A: %s, B: %s\n", i, words1[i], words2[i], result_a, result_b);

        }
    }
}