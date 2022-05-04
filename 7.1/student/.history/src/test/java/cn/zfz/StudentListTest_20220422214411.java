package cn.zfz;

import org.junit.Test;

public class StudentListTest {
    @Test
    public void showStudents() {
        StudentListTest studentListTest = new StudentListTest();
        StudentInfo studentInfo1 = new StudentInfo("1", "小明", "男", "语文", "99");
        StudentInfo studentInfo2 = new StudentInfo("1", "小明", "男", "数学", "98");
        studentListTest.add(studentInfo1);
        System.out.println(studentListTest.toString());
    }
}
