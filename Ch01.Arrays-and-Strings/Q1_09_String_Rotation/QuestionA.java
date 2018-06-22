package Q1_09_String_Rotation;


class QuestionA {
    public static boolean isSubstring(String big, String small) {
        if (big.indexOf(small) >= 0) return true;
        else return false;
    }

    public static boolean isRotationString(String s1, String s2){
        String temp = s2 + s2;

        return isSubstring(temp, s1);
    }
}