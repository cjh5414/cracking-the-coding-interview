package Q1_08_Zero_Matrix;


class QuestionA {
    public static void makeMatrixZero(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        boolean[] rowZero = new boolean[row];
        boolean[] colZero = new boolean[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            if(rowZero[i]) {
                for (int j = 0; j < col; j++)
                    matrix[i][j] = 0;
            }
        }

        for (int j = 0; j < col; j++) {
            if(colZero[j]) {
                for (int i = 0; i < row; i++)
                    matrix[i][j] = 0;
            }
        }
    }
}