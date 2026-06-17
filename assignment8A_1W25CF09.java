import java.util.Random;
import java.util.Scanner;

public class assignment8A_1W25CF09 {
  public static int damage(Random rand, int max_rand_val, int critical_hit_rate,
                           int critical_hit_multiplier) {
    int attack_damage = rand.nextInt(max_rand_val);
    if (attack_damage < critical_hit_rate) {
      attack_damage = rand.nextInt(max_rand_val) * critical_hit_multiplier;
      System.out.println("Critical hit!");
    }
    return attack_damage;
  }

  public static void main(String args[]) {
    int player_hp = 100;
    int monster_hp = 100;
    int attack_damage;

    int critical_hit_rate = 9;
    int critical_hit_multiplier = 2;

    Scanner scan = new Scanner(System.in);
    Random rand = new Random(100);
    int max_rand_val = 30;

    while (true) {
      System.out.println("Press Enter to attack.");
      scan.nextLine();

      System.out.println("Attack by Player");

      attack_damage = damage(rand, max_rand_val, critical_hit_rate,
                             critical_hit_multiplier);
      monster_hp -= attack_damage;
      System.out.println("> Dealt:  " + attack_damage +
                         " damage to the monster!");
      System.out.println("> Monster HP: " + monster_hp);

      if (monster_hp <= 0) {
        System.out.println("You win!");
        break;
      }

      System.out.println("Attack by Monster: ");
      attack_damage = damage(rand, max_rand_val, critical_hit_rate,
                             critical_hit_multiplier);
      monster_hp -= attack_damage;

      player_hp -= attack_damage;
      System.out.println("> Player took: " + attack_damage + " damage!");
      System.out.println("> Player HP: " + player_hp);

      if (player_hp <= 0) {
        System.out.println("You lose ...");
        break;
      }
      System.out.println();
    }

    scan.close();
  }
}
