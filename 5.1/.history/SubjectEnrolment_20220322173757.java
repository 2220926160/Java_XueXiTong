import java.util.Arrays;

public class SubjectEnrolment {
    private Student studentList[]; 
    private Integer count;
    private final int subjectIdFirst = 0;
    private static Integer subjectNum = 0;
    private Integer subjectId; 
    private String subjectName; 

    public SubjectEnrolment() {
        studentList = new Student[1];
        count = 1;
        subjectNum++;
        subjectId = subjectId + subjectNum;
        subjectName = null;
    }

    public SubjectEnrolment(Student[] studentList, Integer count) {
        this.studentList = studentList;
        this.count = count;
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
