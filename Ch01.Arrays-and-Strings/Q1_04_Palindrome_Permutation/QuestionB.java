package Q1_04_Palindrome_Permutation;


import java.util.Arrays;

class QuestionB {
    static boolean isPalindromePermutation(String str) {
        String lowerStr = str.toLowerCase();
        int vitVector = 0, val;
        char c;


        for (int i = 0; i < lowerStr.length(); i++) {
            c = lowerStr.charAt(i);

            if (Character.isAlphabetic(c)) {
                val = c - 'a';
                if ((vitVector & (1 << val)) == 0)
                    vitVector |= (1 << val);
                else
                    vitVector &= ~(1 << val);
            }
        }

        if (vitVector == 0) return true;

        while (vitVector % 2 == 0)
            vitVector /= 2;

        if (vitVector == 1) return true;
        else return false;
    }
}