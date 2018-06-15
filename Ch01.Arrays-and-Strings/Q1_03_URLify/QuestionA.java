package Q1_03_URLify;


import java.util.Arrays;

class QuestionA {
    static String urlify(String str){
        char[] array =
        char[] resultStr = new char[128];
        int idx = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)==' ') {
                resultStr[idx++] = '%';
                resultStr[idx++] = '2';
                resultStr[idx++] = '0';
            }
            else
                resultStr[idx++] = str.charAt(i);
        }

        return new String(resultStr);
    }
}