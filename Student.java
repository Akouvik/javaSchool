// this class is responsible for keeping track of students, fees, name, id, grade,fees paid

public class Student {
  private int id;
  private String name;
  private int grade;
  private int feesPaid;
  private int totalFees;

  /**
   * constructor creates a new object as soon as the new keyword is encounted
   * //total fee is 30k per year
   * 
   * to create a new student object by initializing the value
   * 
   */
  public Student(int id, String name, int grade) {
    this.feesPaid = 0;
    this.totalFees = 30000;
    this.id = id;
    this.name = name;
    this.grade = grade;
  }

  // we will not be altering a students name or id so no set method is needed

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public int getGrade() {
    return this.grade;
  }

  // fees paid
  public int getFeesPaid() {
    return feesPaid;
  }

  // remaining fees for student
  public int getTotalFees() {
    return totalFees;
  }

  // setters

  // used to update the students grade
  public void setGrade(int grade) {
    this.grade = grade;
  }

  public void updateFeesPaid(int fees) {
    this.feesPaid += fees;
    this.totalFees -= fees;
  }

  public static void main(String[] args) {

  }
}
