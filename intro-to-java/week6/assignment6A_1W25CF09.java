public class assignment6A_1W25CF09 {
  public static void main(String args[]) {
    int[] x = new int[20];
    x[0] = 0;
    x[1] = 1;

    for (int i = 2; i < 20; i++) {
      x[i] = x[i - 1] + x[i - 2];
    }
    for (int i = 0; i < x.length; i++) {
      System.out.println(x[i] + " ");
    }
  }
}