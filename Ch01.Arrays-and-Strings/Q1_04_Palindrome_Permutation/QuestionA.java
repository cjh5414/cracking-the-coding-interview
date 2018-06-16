package Q1_04_Palindrome_Permutation;


import java.util.Arrays;

class QuestionA {
    static boolean isPalindromePermutation(String str) {
        char[] arr = str.toLowerCase().toCharArray();
        int idx = 0, countOneLetter;

        Arrays.sort(arr);

        while (!Character.isAlphabetic(arr[idx]))
            idx++;

        if ((arr.length - idx) % 2 == 0)  // 알파벳의 개수가 짝수이면
            countOneLetter = 0;
        else
            countOneLetter = 1;

        for (int i = idx; i < arr.length - 1; i++) {
            if (arr[idx] != arr[idx + 1]) {
                if (countOneLetter == 0)
                    return false;
                else
                    countOneLetter--;
            }
        }

        return true;
    }
}