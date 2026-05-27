public class assignment6B_1W25CF09 {
  public static void main(String args[]) {
    int[][] x = new int[9][9];

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        x[i][j] = (i + 1) * (j + 1);
      }
    }

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.printf("%3d", x[i][j]);
      }
      System.out.println();
    }
  }
}
