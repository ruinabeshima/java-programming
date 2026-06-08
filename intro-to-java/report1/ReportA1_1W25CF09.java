// How to run: javac ReportA1_1W25CF09.java && java ReportA1_1W25CF09

class ReportA1_1W25CF09 {
    public static void main(String[] args) {
        // Define a 2 x 3 matrix
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}};

        // Define a 3 x 2 matrix
        int[][] matrixB = {{7, 8}, {9, 10}, {11, 12}};

        // Initialize the result matrix for multiplication (2 x 2)
        int[][] result = {{0, 0}, {0, 0}};

        // Multiplication of two matrices
        for (int i = 0; i < 2; i++) { // Columns of matrix A
            for (int j = 0; j < 2; j++) { // Rows of matrix B
                for (int k = 0; k < 3; k++) {  // Columns of matrix B and rows of matrix A
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Output result
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }
}