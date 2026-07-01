public class MethodsIncludingError {
  public static void causeArrayExceptions(int array_max) {
    try {
      int[] array = new int[array_max];
      for (int i = -1; i < array_max; i++) {
        array[i] = i;
        System.out.println(array[i]);
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
}
