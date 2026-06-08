// Commands: javac ReportA2_1W25CF09.java && java ReportA2_1W25CF09

import java.util.Scanner;

public class ReportA2_1W25CF09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        // 2D array implementation
        int[][] triangle = new int[rows][];

        for (int i = 0; i < rows; i++) {
            // Each row i has exactly i + 1 columns
            triangle[i] = new int[i + 1];

            // The first and last elements of every row are always 1
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            // Calculate the values in between
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Print the triangle
        for (int i = 0; i < rows; i++) {
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}