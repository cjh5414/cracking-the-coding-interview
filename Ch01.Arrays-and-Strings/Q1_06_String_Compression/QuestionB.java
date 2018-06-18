package Q1_06_String_Compression;


class QuestionB {
    public static String compress(String str) {
        char[] resultStr = new char[str.length()];
        int count = 1, idx = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((i == str.length()-1) || (str.charAt(i+1) != c)) {
                String countStr = Integer.toString(count);

                // 문자열을 추가하기 전에 압축된 문자열의 길이가 기존의 문자열의 길이보다 크면 원래의 문자열을 반환
                if (idx + countStr.length() > str.length() - 1)
                    return str;

                resultStr[idx++] = c;
                for (char number : countStr.toCharArray())
                    resultStr[idx++] = number;

                count = 1;
            }

            else
                count++;
        }

        return new String(resultStr);
    }
}