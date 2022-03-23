public class SubjectEnrolment {
    private Student studentList[];
    private Integer count;

    public SubjectEnrolmentDriver() {
    }

    public SubjectEnrolmentDriver(Student[] studentList, Integer count) {
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
        return "SubjectEnrolmentDriver [count=" + count + ", studentList=" + Arrays.toString(studentList) + "]";
    }
}
