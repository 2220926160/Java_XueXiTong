import java.util.Scanner;

public class Student {
    private String studentID;
    private String firstName;
    private String lastName;

    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学号：");
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        input.close();
    }

    public Student(String studentID, String firstName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", studentID=" + studentID + "]";
    }

}
