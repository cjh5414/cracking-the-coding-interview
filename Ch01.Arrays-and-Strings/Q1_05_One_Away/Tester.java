package Q1_05_One_Away;


public class Tester {
    public static void main(String[] args) {
        String[][] strPairArray = { {"pale", "ple"}, {"pales", "pale"}, {"pale", "bale"}, {"pale", "bake"}};

        System.out.println("Question A.");
        for (String[] strPair : strPairArray)
            System.out.println(strPair[0] + ", " + strPair[1] + " -> " + QuestionA.isOneAway(strPair[0], strPair[1]));

        System.out.println("Question B.");
        for (String[] strPair : strPairArray)
            System.out.println(strPair[0] + ", " + strPair[1] + " -> " + QuestionB.isOneEditAway(strPair[0], strPair[1]));
    }
}