public class Person {
  public String name;
  public int birth_year;

  public Person(String name, int birth_year) {
    this.name = name;
    this.birth_year = birth_year;
  }

  public String talk() { return "I am " + getName(); }
  public void walk() { /* Walking process */ }

  public String getName() { return name; }
}
