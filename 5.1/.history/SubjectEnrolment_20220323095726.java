public class SubjectEnrolment {
    private final int subjectIdFirst = 0; // 课程编号起始位置
    private static Integer subjectNum = 0; // 总注册课程数
    private String subjectId; // 课程ID，为键值，无重复
    private String subjectName; // 课程名
    private Integer term; // 学期
    private Integer year; // 年份

    private Student studentList[]; // 学生信息表
    private Integer studentNum; // 学生数
    private Integer studentMax = 100; // 表的最大学生数 默认100人

    public SubjectEnrolment() {
        subjectNum++;
        subjectId = Integer.toString(subjectIdFirst + subjectNum);
        subjectName = null;
        term = 0;
        year = 0;
        studentList = new Student[1];
        studentNum = 0;
        studentMax = 1;
    }

    public SubjectEnrolment(String subjectId, String subjectName, Integer year, Integer term, Integer studentMax) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.term = term;
        this.year = year;
        this.studentNum = 0;
        this.studentMax = studentMax;
        this.studentList = new Student[studentMax];
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

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Student[] getStudentList() {
        return studentList;
    }

    public void setStudentList(Student[] studentList) {
        this.studentList = studentList;
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }

    public Integer getStudentMax() {
        return studentMax;
    }

    public void setStudentMax(Integer studentMax) {
        this.studentMax = studentMax;
    }

    public boolean isFull() {
        if (studentNum < studentMax) {
            return false;
        } else {
            return true;
        }
    }

    public void add(String studentId, String studentName) {
        Student student = new Student(studentId, studentName);
        this.add(student);
    }

    public void add(Student student) {
        if (isFull()) {
            System.out.println(student.getId() + " 学生添加失败, 原因: 学生信息表已满");
            return;
        }
        if (searchId(student.getId()) != -1) {
            studentList[studentNum].clone(student);;
            studentNum++;
        }
        System.out.println(student.getId() + " 号学生添加成功");
    }

    public void delete(String studentId) {
        Integer i = this.searchId(studentId);
        if (i != -1) {
            this.studentNum--;
            for (Integer j = i; j < this.studentNum; j++) {
                studentList[j] = studentList[j + 1];
            }
        } else {
            System.out.println(studentId + " 学生删除失败, 原因: 查找无结果");
        }
    }

    public Integer searchId(String studentId) {
        for (int i = 0; i < studentNum; i++) {
            if (studentList[i].getName().equals(studentId)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String msg = "";
        msg += "课程信息\n";
        msg += "课程号: " + subjectId + " 课程名: " + subjectName + " 年份:" + year + " 学期:" + term + "\n";
        msg += "选课学生信息\n";
        msg += "学号\t姓名\n";
        for (int i = 0; i < studentNum; i++) {
            msg += this.studentList[i].getId() + this.studentList[i].getName() + "\n";
        }
        return msg;
    }
}
