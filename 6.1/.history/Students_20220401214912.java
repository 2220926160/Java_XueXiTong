import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class Students {
    private ArrayList<StudentInformation> studentsInformationList;
    private ArrayList<StudentGrade> studentsGradesList;

    public Students(String T1, String T2) {
        String splitT1[] = T1.split(",|\n");
        String splitT2[] = T2.split(",|\n");
        for (int i = 0; !splitT1[i].isEmpty();) {
            StudentInformation studentInformation = new StudentInformation(splitT1[i], splitT1[i++], splitT1[i++]);
            studentsInformationList.add(studentInformation);
        }
    }

    public String getStudentsInformation() {
        return studentsInformation;
    }

    public void setStudentsInformation(String studentsInformation) {
        this.studentsInformation = studentsInformation;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "Students [studentsInformation=" + studentsInformation + ", studentsList=" + studentsList + "]";
    }

};

class StudentInformation {
    private String id;
    private String name;
    private String gender;

    public StudentInformation(String id, String name, String gender) {
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
        return id + ", " + name + ", " + gender;
    }
}

class StudentGrade {
    private String id;
    private String subject;
    private String grade;

    public StudentGrade(String id, String subject, String grade) {
        this.id = id;
        this.subject = subject;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return id + ", " + subject + ", " + grade;
    }
};
