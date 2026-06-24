public class Student extends Person {
  public String studentId;

  public Student(String name, int birthYear, String studentId) {
    super(name, birthYear);
    this.studentId = studentId;
  }

  @Override
  public String talk() {
    return super.talk()+
        " and my student ID is " + getStudentID();
  }

  public String getStudentID() { return studentId; }
}
