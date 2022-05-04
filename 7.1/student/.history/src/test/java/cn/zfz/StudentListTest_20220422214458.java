package cn.zfz;

import org.junit.Test;

public class StudentListTest {
    @Test
    public void showStudents() {
        StudentList studentList = new StudentList();
        StudentInfo studentInfo1 = new StudentInfo("1", "小明", "男", "语文", "99");
        StudentInfo studentInfo2 = new StudentInfo("1", "小明", "男", "数学", "98");
        studentList.add(studentInfo1);
        studentList.add(studentInfo2);
        System.out.println(studentList.toString());
    }
}
