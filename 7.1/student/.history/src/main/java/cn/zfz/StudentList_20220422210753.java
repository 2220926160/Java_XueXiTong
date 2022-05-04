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
        String str = "";
        return "StudentInfo [course=" + course + ", gender=" + gender + ", grade=" + grade + ", id=" + id + ", name="
                + name + "]";
    }

}