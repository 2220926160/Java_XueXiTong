package cn.zfz;

public class StudentList {

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

}