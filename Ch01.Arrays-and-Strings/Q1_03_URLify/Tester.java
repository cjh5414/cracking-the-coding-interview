package Q1_03_URLify;


public class Tester {
    public static void main(String[] args) {
        String str = "Mr John Smith        ";
        char[] arr = str.toCharArray();

        System.out.print(str + " -> ");
        QuestionA.urlify(arr, 13);
        System.out.println(new String(arr));
    }
}