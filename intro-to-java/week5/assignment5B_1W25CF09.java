import java.util.Random;
import java.util.Scanner;

public class assignment5B_1W25CF09 {
  public static void main(String args[]) {
    int player_hp = 100;
    int monster_hp = 100;

    Scanner scanner = new Scanner(System.in);
    Random rand = new Random(100);
    int max_rand_val = 30;

    while (player_hp > 0 && monster_hp > 0) {
      System.out.println("Press Enter to attack!");
      scanner.nextLine();

      int monster_rand_val = rand.nextInt(max_rand_val);
      monster_hp -= monster_rand_val;
      System.out.println("You inflicted " + monster_rand_val +
                         " damage! The monster has " + monster_hp +
                         "HP left");

      int player_rand_val = rand.nextInt(max_rand_val);
      player_hp -= player_rand_val;
      System.out.println("The monster inflicted " + player_rand_val +
                         " damage onto you! You have " + player_hp +
                         "HP left");
    }

    if (player_hp <= 0) {
      System.out.println("You died! You lose!");
    } else if (monster_hp <= 0) {
      System.out.println("The monster died! You win!");
    }

    scanner.close();
  }
}
