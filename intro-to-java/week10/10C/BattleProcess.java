public class BattleProcess {

  public BattleProcess() {}

  public static void attack(GameCharacter attacker, GameCharacter target,
                            java.util.Random rand, double failRate) {
    System.out.println("Attack by " + attacker.getName());
    if (rand.nextDouble() < failRate) {
      System.out.println("> Attack failed!");
      return;
    }
    int attack_damage = rand.nextInt(attacker.attack_power());
    target.receiveDamage(attack_damage);
    System.out.println("> Dealt " + attack_damage + " damage to " +
                       target.getName() + "!");
    System.out.println("> " + target.getName() + " HP: " + target.getHP());
  }

  public static boolean isDefeated(GameCharacter character) {
    return character.getHP() <= 0;
  }

  public static void printResult(GameCharacter winner, GameCharacter loser) {
    System.out.println("");
    System.out.println("----------------------");
    System.out.println(" Battle Result ");
    System.out.println("----------------------");
    System.out.println("> Winner : " + winner.getName());
    System.out.println("> Loser: " + loser.getName());
  }
}