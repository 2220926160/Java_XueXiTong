import javax.swing.text.StyledEditorKit.BoldAction;

public class SubjectEnrolment {
    private final int subjectIdFirst = 0; // 课程编号起始位置
    private static Integer subjectNum = 0; // 总注册课程数
    private Integer subjectId; // 课程ID，为键值，无重复
    private String subjectName; // 课程名
    private Integer term; // 学期
    private Integer year; // 年份

    private Student studentList[]; // 学生信息表
    private Integer studentNum; // 学生数
    private Integer studentMax = 100; // 表的最大学生数 默认100人

    public SubjectEnrolment() {
        subjectNum++;
        subjectId = subjectIdFirst + subjectNum;
        subjectName = null;
        term = 0;
        year = 0;
        studentList = new Student[1];
        studentNum = 0;
        studentMax = 1;
    }

    public boolean isFull() {
        if(studentNum < studentMax) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isexistStudentId() {
        return false;
    }

    public void add(Student student) {
        if(isFull()) {
            System.out.println(student.getId() + " 学生添加失败");
            return;
        } 
        studentList[studentNum++] = student;
        System.out.println(student.getId() + " 学生添加成功");
    }

    public void delete(Integer studentId) {

    }
    


    public Integer searchId(String studentId) {
        return 0;
    }

    @Override
    public String toString() {
        String msg = "";    
        msg += "课程号: " + subjectId +  "课程名: " + subjectName + "\n";
        msg += "选课学生信息\n";
        msg += "学号\t姓名\t年龄";
        for (int i = 0; i < studentNum && this.studentList[i] != null; i++) {
            msg += this.studentList[i].getId() + this.studentList[i].getName() + Integer.toString(this.studentList[i].getAge()) + "\n" ;
        } 
        return msg;
    }
}
