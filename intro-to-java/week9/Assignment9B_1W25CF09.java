import java.util.Random;
import java.util.Scanner;

public class Assignment9B_1W25CF09 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random(999);

    GameCharacter player   = new GameCharacter("Player",   300, 60);
    GameCharacter monster1 = new GameCharacter("Monster1", 100, 20);
    GameCharacter monster2 = new GameCharacter("Monster2", 100, 20);
    GameCharacter monster3 = new GameCharacter("Monster3", 100, 20);

    System.out.println("=== MonsterBattleGame_WithClass_2 ===");
    player.print();
    monster1.print();
    monster2.print();
    monster3.print();

    System.out.println("# Battle start");
    while (true) {
      System.out.println("# Press Enter to attack");
      scan.nextLine();

      if (!BattleProcess.isDefeated(monster1)) BattleProcess.attack(player, monster1, rand, 0.2);
      if (!BattleProcess.isDefeated(monster2)) BattleProcess.attack(player, monster2, rand, 0.2);
      if (!BattleProcess.isDefeated(monster3)) BattleProcess.attack(player, monster3, rand, 0.2);

      if (BattleProcess.isDefeated(monster1) &&
          BattleProcess.isDefeated(monster2) &&
          BattleProcess.isDefeated(monster3)) {
        BattleProcess.printResult(player, monster1);
        break;
      }

      System.out.println("---");

      if (!BattleProcess.isDefeated(monster1)) BattleProcess.attack(monster1, player, rand, 0.1);
      if (!BattleProcess.isDefeated(monster2)) BattleProcess.attack(monster2, player, rand, 0.1);
      if (!BattleProcess.isDefeated(monster3)) BattleProcess.attack(monster3, player, rand, 0.1);

      if (BattleProcess.isDefeated(player)) {
        GameCharacter winner = !BattleProcess.isDefeated(monster1) ? monster1 :
                               !BattleProcess.isDefeated(monster2) ? monster2 : monster3;
        BattleProcess.printResult(winner, player);
        break;
      }
    }

    scan.close();
  }
}
