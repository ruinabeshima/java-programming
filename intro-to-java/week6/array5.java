public class array5 {
  public static void main(String args[]) {
    int[] x = new int[10];
    int[] y = new int[10];
    for (int i = 0; i < 10; i++) {
      x[i] = i;
      y[i] = 10 - x[i];
    }
    for (int i = 0; i < 10; i++) {
      System.out.println("x[" + i + "] = " + x[i] + ", y[" + i + "] = " + y[i]);
    }
  }
}