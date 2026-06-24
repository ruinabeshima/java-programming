public class Faculty extends Person {
  public String course;

  public Faculty(String name, int birth_year, String course) {
    super(name, birth_year);
    this.course = course;
  }

  @Override
  public String talk() {
    return super.talk() + " and my course is " + getCourse();
  }

  public String getCourse() { return course; }
}
