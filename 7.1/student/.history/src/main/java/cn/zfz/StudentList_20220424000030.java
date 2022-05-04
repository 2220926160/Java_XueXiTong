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
    public boolean add(StudentInfo studentInfo) {
        try {
            if (studentList.add(studentInfo))
                return true;
        } catch (Exception e) {
            System.out.println("添加失败");
        }
        return false;
    }

    // 添加元素至指定位置
    public boolean add(int index, StudentInfo studentInfo) {
        try {
            studentList.add(index, studentInfo);
            System.out.println("添加成功");
            return true;
        } catch (Exception e) {
            System.out.println("添加失败");
        }
        return false;
    }

    // 删除所有元素
    public void clear() {
        studentList.clear();
    }

    // 删除指定位置元素
    public void remove(int index) {
        try {
            studentList.remove(index);
            System.out.println("删除成功");
        } catch (Exception e) {
            System.out.println("删除失败");
        }
    }

    public Float searchGradeById(String id) {
        
        return 0f;
    }
    // 根据"学号"判断是否存在
    public boolean isExistBy_Id(String id) {
        for (StudentInfo studentInfo : studentList) {
            if (studentInfo.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
    // 根据"学号"和"课程"判断是否存在
    public boolean isExistBy_Id_course(String id, String course) {
        for (StudentInfo studentInfo : studentList) {
            if (studentInfo.getId().equals(id) && studentInfo.getCourse().equals(course)) {
                return true;
            }
        }
        return false;
    }
    public ArrayList<StudentInfo> searchBy_id(String id) {
        ArrayList<StudentInfo> search_id_list = new ArrayList<StudentInfo>();
        for (StudentInfo studentInfo : studentList) {
            if (studentInfo.getId().equals(id)) {
                search_id_list.add(studentInfo);
            }
        }
        return search_id_list;
    }
    // 返回记录数
    public int size() {
        return studentList.size();
    }

    // @Override
    public String toString() {
        String str = "";
        for (StudentInfo student : studentList) {
            str += student.toString() + "\n";
        }
        return str;
    }
    // @Override
    public String toString(String splitSymbol) {
        String str = "";
        for (StudentInfo student : studentList) {
            str += student.toString(splitSymbol) + "\n";
        }
        return str;
    }

}

class StudentInfo {
    private String id;
    private String name;
    private String gender;
    private String course;
    private Float grade;

    public StudentInfo(String id, String name, String gender, String course, Float grade) {
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

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentInfo [id=" + id + ", name=" + name + ", gender=" + gender + ", course=" + course + ", grade="
                + grade + "]";
    }
    public String toString(String splitSymbol) {
        String str = "";
        str += id + splitSymbol + name + splitSymbol + gender + splitSymbol + course + splitSymbol + grade;
        return str;
    }

}