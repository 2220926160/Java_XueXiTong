package cn.zfz;

import org.junit.Test;

public class StudentListTest {
    @Test
    public void showStudents() {
        StudentList studentList = new StudentList();
        StudentInfo studentInfo1 = new StudentInfo("1", "小明", "男", "语文", 99f);
        StudentInfo studentInfo2 = new StudentInfo("1", "小明", "男", "数学", 98f);
        studentList.add(studentInfo1);
        studentList.add(studentInfo2);
        int index = 0;
        studentList.remove(index);
        System.out.println(studentList.toString());
    }
}
