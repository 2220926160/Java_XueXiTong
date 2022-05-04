package cn.zfz;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<StudentInfo> studentList;

    public StudentList() {
        this.studentList = new ArrayList<StudentInfo>();
    }

    public StudentList(ArrayList<StudentInfo> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<StudentInfo> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<StudentInfo> studentList) {
        this.studentList = studentList;
    }
    // 添加元素至末尾
    public void insert(StudentInfo studentInfo) {
        studentList.add(studentInfo);
    }
    // 添加元素至指定位置
    public void insert(String id, StudentInfo studentInfo) {
        studentList.add(Integer.parseInt(id), studentInfo);
    }
    // 删除所有元素
    public void clear() {
        studentList.clear();
    }
    // 删除指定位置元素
    public void delete(int index) {
        studentList.remove(index);
    }
    // 删除

    @Override
    public String toString() {
        String str = "";
        for (StudentInfo student : studentList) {
            str += student.toString() + "\n";
        }
        return str;
    }
    
}

class StudentInfo {
    private String id;
    private String name;
    private String gender;
    private String course;
    private String grade;

    public StudentInfo(String id, String name, String gender, String course, String grade) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.course = course;
        this.grade = grade;
    }

    public StudentInfo(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentInfo [course=" + course + ", gender=" + gender + ", grade=" + grade + ", id=" + id + ", name="
                + name + "]";
    }

}