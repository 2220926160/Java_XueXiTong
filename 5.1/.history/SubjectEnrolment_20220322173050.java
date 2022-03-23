import java.util.Arrays;

public class SubjectEnrolment {
    private Student studentList[]; // list of student
    private Integer count; // Student number
    private String subjectId; // ID of subject
    private String subjectName; // name of subject

    public SubjectEnrolment() {
        studentList = new Student[1];
        count = 1;
        subjectId = 0;
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
