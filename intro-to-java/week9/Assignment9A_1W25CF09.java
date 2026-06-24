import java.util.Random;
import java.util.Scanner;

public class Assignment9A_1W25CF09 {

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random(100);

    GameCharacter player  = new GameCharacter("Player",  100, 30);
    GameCharacter monster = new GameCharacter("Monster", 100, 30);

    System.out.println("=== MonsterBattleGame_WithClass ===");
    player.print();
    monster.print();

    System.out.println("# Battle start");
    while (true) {
      System.out.println("# Press Enter to attack");
      scan.nextLine();

      BattleProcess.attack(player, monster, rand, 0.0);
      if (BattleProcess.isDefeated(monster)) {
        BattleProcess.printResult(player, monster);
        break;
      }

      System.out.println("---");

      BattleProcess.attack(monster, player, rand, 0.0);
      if (BattleProcess.isDefeated(player)) {
        BattleProcess.printResult(monster, player);
        break;
      }
    }

    scan.close();
  }
}
