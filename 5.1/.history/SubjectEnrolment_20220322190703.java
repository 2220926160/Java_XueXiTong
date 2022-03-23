import java.util.Arrays;

public class SubjectEnrolment {
    private Student studentList[];
    private Integer count;
    private Integer studentMax;
    private final int subjectIdFirst = 0; // 课程编号起始位置
    private static Integer subjectNum = 0; // 总注册课程数
    private Integer subjectId; // 课程数，为键值，无重复
    private String subjectName; // 课程名

    public SubjectEnrolment() {
        studentList = new Student[1];
        count = 0;
        subjectNum++;
        subjectId = subjectId + subjectNum;
        subjectName = null;
        studentMax = 0;
    }

    public SubjectEnrolment(int studentMax, String subjectName) {
        this.studentList = new Student[studentMax];
        this.count = 0;
        subjectNum++;
        this.subjectId = subjectId + subjectNum;
        this.subjectName = subjectName;
        this.studentMax = studentMax;
    }

    public SubjectEnrolment(Student[] studentList, Integer count, Integer subjectId, String subjectName) {
        this.studentList = studentList;
        this.count = count;
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public Student[] getStudentList() {
        return studentList;
    }

    public void setStudentList(Student[] studentList) {
        this.studentList = studentList;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public int getSubjectIdFirst() {
        return subjectIdFirst;
    }

    public static Integer getSubjectNum() {
        return subjectNum;
    }

    public static void setSubjectNum(Integer subjectNum) {
        SubjectEnrolment.subjectNum = subjectNum;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        String msg = "";    
        msg += "课程: " + subjectName;
        for (int i = 0; i < count && this.studentList[i] != null; i++) {
            
        } 

        return msg;
    }
}
