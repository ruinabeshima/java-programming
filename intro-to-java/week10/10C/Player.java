public class Player extends GameCharacter {
  public Player(String name, int hp, int attack_power) {
    super(name, hp, attack_power);
  }

  @Override
  public void print() {
    System.out.println("Player: ");
    super.print(); 
  }
}
