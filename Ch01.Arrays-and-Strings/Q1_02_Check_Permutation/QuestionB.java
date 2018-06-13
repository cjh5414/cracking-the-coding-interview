package Q1_02_Check_Permutation;


import java.util.Arrays;

class QuestionB {
    static boolean are_permutation(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;

        int[] letter = new int[128];

        for (char c : word1.toCharArray())
            letter[c]++;

        for (char c : word2.toCharArray()) {
            letter[c]--;
            if(letter[c] < 0)
                return false;
        }

        return true;
    }
}