import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Teacher lizzy = new Teacher(1, "lizzy", 500);
    Teacher shiva = new Teacher(2, "shiva", 700);
    Teacher matt = new Teacher(3, "matt", 900);

    List<Teacher> teacherList = new ArrayList<>();
    teacherList.add(lizzy);
    teacherList.add(shiva);
    teacherList.add(matt);

    // students
    Student brian = new Student(1, "brian", 4);
    Student rakshith = new Student(2, "rakshith", 12);
    Student rabbi = new Student(3, "rabbi", 8);

    List<Student> studentList = new ArrayList<>();
    studentList.add(brian);
    studentList.add(rakshith);
    studentList.add(rabbi);

    School ghs = new School(teacherList, studentList);
    System.out.println("ghs has earned $" + ghs.totalMoneyEarned());
  }
}