import java.util.Arrays;

public class SubjectEnrolment {
    private Student studentList[];
    private Integer count;
    private String subjectId; // ID of subject
    private String subjectName; // name of subject

    public SubjectEnrolment() {
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
