import java.util.Arrays;

public class SubjectEnrolment {
    private Student studentList[];
    private Integer count;
    private final int subjectIdFirst = 0; // 课程编号起始位置
    private static Integer subjectNum = 0; // 总注册课程数
    private Integer subjectId; // 课程数，为键值，无重复
    private String subjectName; // 课程名

    // 默认创建课程，包含学生信息表，课程信息
    public SubjectEnrolment() {
        studentList = new Student[1];
        count = 1;
        subjectNum++;
        subjectId = subjectId + subjectNum;
        subjectName = null;
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

    @Override
    public String toString() {
        return "SubjectEnrolment [count=" + count + ", studentList=" + Arrays.toString(studentList) + "]";
    }

}
