package Q1_06_String_Compression;


class QuestionC {
    public static int getCompressLength(String str) {
        int finalLength = 0;
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            if ((i + 1) >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                finalLength += 1 + String.valueOf(countConsecutive).length();
                countConsecutive = 1;
            }
        }

        return finalLength;
    }

    public static String compress(String str) {
        int finalLength = getCompressLength(str);
        if (finalLength > str.length()) return str;

        StringBuilder sb = new StringBuilder(finalLength);
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;
            char currentChar = str.charAt(i);
            if ((i + 1) == str.length() || currentChar != str.charAt(i+1)) {
                sb.append(currentChar);
                sb.append(countConsecutive);
                countConsecutive = 0;
            }
        }

        return sb.toString();
    }
}