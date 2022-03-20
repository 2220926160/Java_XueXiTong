import java.util.Scanner;

interface Isubject {
    public String toString();
}

public class Subject implements Isubject{
    private String subjectID;
    private String subjectName;

    public Subject() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入课程号：");
        this.subjectID = input.next();
        System.out.print("请输入课程名：");
        this.subjectName = input.next();
        input.close();
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
