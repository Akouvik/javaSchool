import java.util.List;

public class School {

  // the school can have many teachers, and students
  // so we have to create an array of teachers and students
  // but because we have to initialize hte size of an array when an array is
  // created and we dont know hte exact amount of students and teachers that this
  // school will have, we cannot use arrays
  /**
   * We can use and ArrayList instead
   */
  private List<Teacher> teachers;
  private List<Student> students;
  private int totalMoneyEarned;
  private int totalMoneySpent;

  // create a constructor and initialize the list of teachers and students
  public School(List<Teacher> teachers, List<Student> students) {
    this.teachers = teachers;
    this.students = students;
    this.totalMoneyEarned = 0;
    this.totalMoneySpent = 0;
  }

  // getters

  // returns list of teachers
  public List<Teacher> getTeachers() {
    return this.teachers;
  }

  public List<Student> getStudents() {
    return this.students;
  }

  public int totalMoneyEarned() {
    return this.totalMoneyEarned;
  }

  public int totalMoneySpent() {
    return this.totalMoneySpent;
  }

  // setters

  // adds a teacher to the school
  public void addTeacher(Teacher teacherToAdd) {
    this.teachers.add(teacherToAdd);
  }

  // add a student to the school
  public void addStudent(Student studentToAdd) {
    this.students.add(studentToAdd);
  }

  public void updateTotalMoneyEarned(int MoneyEarned) {
    this.totalMoneyEarned += MoneyEarned;
  }

  public void updateTotalMoneySpent(int MoneySpent) {
    this.totalMoneyEarned -= MoneySpent;
    // salary given by school to its teachers
    // this.totalMoneySpent += MoneySpent;
  }
}