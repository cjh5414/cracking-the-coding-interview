package Q1_05_One_Away;


class QuestionB {
    static boolean isOneEditAway(String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) > 1) return false;

        String shortStr = str1.length() < str2.length() ? str1 : str2;
        String longStr = str1.length() < str2.length() ? str2 : str1;

        int idx1 = 0, idx2 = 0;
        boolean foundDiff = false;

        while (idx1 < shortStr.length() && idx2 < longStr.length()) {
            if (shortStr.charAt(idx1) != longStr.charAt(idx2)) {
                if (foundDiff)
                    return false;
                else {
                    foundDiff = true;
                    if (shortStr.length() == longStr.length())
                        idx1++;
                }
            }
            else
                idx1++;

            idx2++;
        }

        return true;
    }
}