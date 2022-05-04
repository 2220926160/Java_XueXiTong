import java.util.ArrayList;

public class Students {
    private String studentsInformation;
    private ArrayList<Student> studentsList;

    public Students(String studentsInformation) {
        this.studentsInformation = studentsInformation;
        String T[] = studentsInformation.split(",|\n");
    }

};

class Student {
    private String id;
    private String name;
    private String gender;

    public Student(String id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
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

    @Override
    public String toString() {
        return "Student [gender=" + gender + ", id=" + id + ", name=" + name + "]";
    }

}
