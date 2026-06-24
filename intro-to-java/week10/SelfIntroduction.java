public class SelfIntroduction {
  public static void main(String[] args) {
    Student me_student = new Student("Rui", 2008, "1W25CF09-2");
    Faculty me_faculty = new Faculty("Rui", 2008, "Java Programming");
    System.out.println(me_student.talk());
    System.out.println(me_faculty.talk());
  }
}
