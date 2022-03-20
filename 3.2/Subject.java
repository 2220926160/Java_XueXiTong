import java.util.Scanner;

public class Subject {
    public static Scanner sc = new Scanner(System.in);
    private String subjectID; // 课程号
    private String subjectName; // 课程名

    public Subject() {
        System.out.print("请输入课程号:");
        this.subjectID = sc.next();
        System.out.print("请输入课程名:");
        this.subjectName = sc.next();
    }

    public Subject(String subjectID, String subjectName) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "课程 [课程号:" + subjectID + ", 课程名:" + subjectName + "]";
    }

}
