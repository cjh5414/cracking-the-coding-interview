package Q1_02_Check_Permutation;


import java.util.Arrays;

class QuestionA {
    static boolean are_permutation(String word1, String word2) {
        if (word1.length() == word2.length()) {
            char sortedWord1[] = word1.toCharArray();
            char sortedWord2[] = word2.toCharArray();

            Arrays.sort(sortedWord1);
            Arrays.sort(sortedWord2);

            if (Arrays.equals(sortedWord1, sortedWord2))
                return true;
        }

        return false;
    }
}