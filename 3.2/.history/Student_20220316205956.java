import java.util.Scanner;

interface IStudent {
    public String toString();
}

public class Student implements IStudent{
    public static Scanner sc = new Scanner(System.in); 
    private String studentID; // 学号
    private String firstName; // 名字
    private String lastName; // 姓氏

    public Student() {
        System.out.print("请输入学号:");
        this.studentID = sc.next();
        System.out.print("请输入学生名字:");
        this.firstName = sc.next();
        System.out.print("请输入学生姓氏:");
        this.lastName = sc.next();
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
        return "Student [名字:" + firstName + ", 姓氏:" + lastName + ", 学号:" + studentID + "]";
    }

}
