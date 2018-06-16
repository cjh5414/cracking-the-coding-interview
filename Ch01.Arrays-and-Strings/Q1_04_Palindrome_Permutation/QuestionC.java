package Q1_04_Palindrome_Permutation;


import java.util.Arrays;

class QuestionC {
    static int getCharNumber(Character c) {
        int val = Character.getNumericValue(c);
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        if (val >= a && val <= z)
            return val - a;
        else
            return -1;
    }

    static int[] buildCharFrequencyTable(String str) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        for (char c : str.toCharArray()) {
            int val = getCharNumber(c);
            if (val != -1)
                table[val]++;
        }

        return table;
    }

    static boolean checkMaxOneOdd(int[] table) {
        int countOdd = 0;

        for (int count : table) {
            if (count % 2 == 1) {
                countOdd++;
                if (countOdd > 1)
                    return false;
            }
        }
        return true;
    }


    static boolean isPalindromePermutation(String str) {
        int[] table = buildCharFrequencyTable(str);
        return checkMaxOneOdd(table);
    }
}