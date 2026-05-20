import java.util.Random;

public class randomnumber {
  public static void main(String args[]) {

    // Get current time in milliseconds
    long seed = System.currentTimeMillis();

    int max_rand_val = 100;

    // Set the current time as the seed
    Random rand = new Random(seed);

    for (int i = 0; i < 10; i++) {
      int rand_val = rand.nextInt(max_rand_val);
      System.out.println("Random number: " + rand_val);
    }
  }
}
