package Q1_06_String_Compression;


class QuestionA {
    public static String compress(String str) {
        str = str + '\0';
        char[] resultStr = new char[str.length()];
        char temp = str.charAt(0);
        int count = 1, idx = 0;

        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);

            if (temp != c){
                String countStr = Integer.toString(count);

                // 문자열을 추가하기 전에 압축된 문자열의 길이가 기존의 문자열의 길이보다 크면 원래의 문자열을 반환
                if (idx + countStr.length() + 1 > str.length() - 1)
                    return str;

                resultStr[idx++] = temp;
                for (char number : countStr.toCharArray())
                    resultStr[idx++] = number;

                temp = c;
                count = 1;
            }
            else
                count++;
        }

        return new String(resultStr);
    }
}