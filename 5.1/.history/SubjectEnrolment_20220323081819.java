public class SubjectEnrolment {
    private final int subjectIdFirst = 0; // 课程编号起始位置
    private static Integer subjectNum = 0; // 总注册课程数
    private Integer subjectId; // 课程ID，为键值，无重复
    private String subjectName; // 课程名
    
    private Student studentList[]; // 学生信息表
    private Integer studentNum; // 学生数
    private final Integer studentMax = 100; // 表的最大学生数 默认100人



    public SubjectEnrolment() {
        studentList = new Student[1];
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

    public boolean isFull() {
        if(count < studentMax) {
            return false;
        } else {
            return true;
        }
    }

    public void add(Student student) {
        if(isFull()) {
            System.out.println(student.getId() + " 学生添加失败");
            return;
        } 
        studentList[count++] = student;
        System.out.println(student.getId() + " 学生添加成功");
    }

    public void delete(Integer studentId) {

    }
    

    @Override
    public String toString() {
        String msg = "";    
        msg += "课程号: " + subjectId +  "课程名: " + subjectName + "\n";
        msg += "选课学生信息\n";
        msg += "学号\t姓名\t年龄";
        for (int i = 0; i < count && this.studentList[i] != null; i++) {
            msg += this.studentList[i].getId() + this.studentList[i].getName() + Integer.toString(this.studentList[i].getAge()) + "\n" ;
        } 
        return msg;
    }
}
