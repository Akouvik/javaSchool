import java.util.List;
import java.util.ArrayList;

public class Main {

  // this should be a text user interface but for now this will do
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
    Teacher megan = new Teacher(6, "megan", 540);

    ghs.addTeacher(megan);
    // student brian
    brian.payFees(5000);
    System.out.println("GHS has earned $" + ghs.totalMoneyEarned());
    brian.payFees(6000);
    // total money school earned
    System.out.println("GHS has earned $" + ghs.totalMoneyEarned());

    System.out.println("------------MAKING School PAY SLARY -------------");
    // teacher lizzy getting paid
    lizzy.receiveSalary(lizzy.getSalary());
    System.out.println("------------GHS has paid " + lizzy.getName() + " $" + lizzy.getSalary() + " and now has $"
        + ghs.totalMoneyEarned() + " left");

    // teacher shiva
    shiva.receiveSalary(shiva.getSalary());
    System.out.println("------------GHS has paid " + shiva.getName() + " $" + shiva.getSalary() + " and now has $"
        + ghs.totalMoneyEarned() + " left");

    // printout without toString
    System.out.println(brian);
    matt.receiveSalary(matt.getSalary());
    System.out.println(matt);

  }
}