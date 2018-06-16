package Q1_04_Palindrome_Permutation;


public class Tester {
    public static void main(String[] args) {
        System.out.println("Question A.");

        System.out.println("Tact Coa : " + QuestionA.isPalindromePermutation("Tact Coa"));
        System.out.println("Txct Coa : " + QuestionA.isPalindromePermutation("Txct Coa"));
        System.out.println("aaaab: " + QuestionA.isPalindromePermutation("aaaab"));
        System.out.println("a ba a  a: " + QuestionA.isPalindromePermutation("a ba a  a"));
        System.out.println("abcabc: " + QuestionA.isPalindromePermutation("abcabc"));
        System.out.println("adbcacb: " + QuestionA.isPalindromePermutation("adbcacb"));
        System.out.println("abcdeabcdeea: " + QuestionA.isPalindromePermutation("abcdeabcdeea"));

        System.out.println("");

        System.out.println("Question B.");
        System.out.println("Tact Coa : " + QuestionB.isPalindromePermutation("Tact Coa"));
        System.out.println("Txct Coa : " + QuestionB.isPalindromePermutation("Txct Coa"));
        System.out.println("aaaab: " + QuestionB.isPalindromePermutation("aaaab"));
        System.out.println("a ba a  a: " + QuestionB.isPalindromePermutation("a ba a  a"));
        System.out.println("abcabc: " + QuestionB.isPalindromePermutation("abcabc"));
        System.out.println("adbcacb: " + QuestionB.isPalindromePermutation("adbcacb"));
        System.out.println("abcdeabcdeea: " + QuestionB.isPalindromePermutation("abcdeabcdeea"));
    }
}