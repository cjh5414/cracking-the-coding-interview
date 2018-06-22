package Q1_09_String_Rotation;


public class Tester {
    public static void main(String[] args) {
        String s1 = "waterbottle", s2 = "erbottlewat";

        System.out.println(s1 + ", " + s2 + " : " + QuestionA.isRotationString(s1, s2));
    }
}