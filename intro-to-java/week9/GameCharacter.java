public class GameCharacter {
  private String name;
  private int hp;
  private int attack_power;

  public GameCharacter(String name, int hp, int attack_power) {
    this.name = name;
    this.hp = hp;
    this.attack_power = attack_power;
  }

  // Getter methods
  public String getName() { return name; }
  public int getHP() { return hp; }
  public int attack_power() { return attack_power; }

  // Setter methods
  public void setName(String name) { this.name = name; }
  public void setHP(int hp) { this.hp = hp; }
  public void setAttackPower(int attack_power) {
    this.attack_power = attack_power;
  }

  public void receiveDamage(int damage) {
    hp -= damage;
    if (hp < 0) hp = 0;
  }

  public void print() {
    System.out.println("[ " + name + " ]");
    System.out.println("- HP: " + hp);
    System.out.println("- Attack Power: " + attack_power);
    System.out.println("----------------------");
  }
}