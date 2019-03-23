
//this class is responsible for keeping track of teacher id, name, salary
public class Teacher {
  private int id;
  private String name;
  private int salary;

  // creates a new teacher object initializing the id, name and salary
  public Teacher(int id, String name, int salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;

  }

  // getters

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public int getSalary() {
    return this.salary;
  }

  // setters
  // since the teacher id and teacher name will not be changing, we do not need
  // setters for them

  // setter for salary as it may change for the teacher
  public void setSalary(int salary) {
    this.salary = salary;
  }

  public static void main(String[] args) {

  }

}