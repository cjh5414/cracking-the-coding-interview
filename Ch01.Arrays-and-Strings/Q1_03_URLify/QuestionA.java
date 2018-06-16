package Q1_03_URLify;


class QuestionA {
    static void urlify(char[] str, int strLen){
        int spaceCount = 0, idx, i;
        for (i = 0; i<strLen; i++)
            if (str[i] == ' ') spaceCount++;

        idx = strLen + spaceCount * 2 - 1;

        for (i = strLen - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[idx] = '0';
                str[idx-1] = '2';
                str[idx-2] = '%';
                idx -= 3;
            }
            else
                str[idx--] = str[i];
        }
    }
}