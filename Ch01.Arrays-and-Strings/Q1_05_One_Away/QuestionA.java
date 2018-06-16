package Q1_05_One_Away;


class QuestionA {
    static int getCharNumber(char c) {
        int val = Character.getNumericValue(c);
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        if (a <= val && val <= z) {
            return val - a;
        }

        return -1;
    }

    static int[] buildCharFrequencyTable(String str1, String str2) {
        int[] table = new int[26];

        for (char c : str1.toCharArray()) {
            int charNum = getCharNumber(c);
            if (charNum != -1)
                table[charNum]++;
        }

        for (char c : str2.toCharArray()) {
            int charNum = getCharNumber(c);
            if (charNum != -1)
                table[charNum]--;
        }

        return table;
    }

    static boolean checkEditAtOnce(int[] table, int diff) {
        int editionCount = 1;

        if (diff == 0)
            editionCount = 2;


        for (int i : table) {
            if (i != 0) {
                if(editionCount == 0) return false;
                else editionCount--;
            }
        }

        return true;
    }

    static boolean isOneAway(String str1, String str2) {
        int[] table = buildCharFrequencyTable(str1, str2);
        return checkEditAtOnce(table, str1.length() - str2.length());
    }
}