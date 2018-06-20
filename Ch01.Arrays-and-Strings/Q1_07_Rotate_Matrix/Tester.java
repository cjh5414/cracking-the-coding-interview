package Q1_07_Rotate_Matrix;


public class Tester {
    public static void matrixPrint(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("}");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[][][] matrixs = {
                {{1, 2, 3}, {4, 5, 6} ,{7, 8, 9}},
                {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}
        };

        for (int[][] matrix : matrixs) {
            matrixPrint(matrix);
            QuestionA.rotateMatrix(matrix);
            matrixPrint(matrix);
        }
    }
}