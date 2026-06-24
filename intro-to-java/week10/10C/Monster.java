public class Monster extends GameCharacter {
  public Monster(String name, int hp, int attack_power) {
    super(name, hp, attack_power);
  }

  @Override
  public void print() {
    System.out.println("Monster: ");
    super.print(); 
  }
}
