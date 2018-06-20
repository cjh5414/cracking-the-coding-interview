package Q1_08_Zero_Matrix;


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
                {{1, 0, 1, 0}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}},
                {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}
        };

//        System.out.println("Question A.");
//        for (int[][] matrix : matrixs) {
//            matrixPrint(matrix);
//            QuestionA.makeMatrixZero(matrix);
//            matrixPrint(matrix);
//        }

        System.out.println("Question B.");
        for (int[][] matrix : matrixs) {
            matrixPrint(matrix);
            QuestionB.makeMatrixZero(matrix);
            matrixPrint(matrix);
        }
    }
}