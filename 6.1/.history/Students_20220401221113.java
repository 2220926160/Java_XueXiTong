import java.util.ArrayList;

public class Students {
    private ArrayList<StudentInformation> studentsInformationList;
    private ArrayList<StudentGrade> studentsGradesList;

    public Students(String T1, String T2) {
        String splitT1[] = T1.split("，|\n");
        String splitT2[] = T2.split("，|\n");
        for (int i = 0; !splitT1[i].isEmpty() && splitT1[i].equals("end");) {
            StudentInformation studentInformation = new StudentInformation(splitT1[i], splitT1[i++], splitT1[i++]);
            studentsInformationList.add(studentInformation);
        }
        for (int i = 0; !splitT2[i].isEmpty() && splitT2[i].equals("end");) {
            StudentGrade studentGrade = new StudentGrade(splitT2[i], splitT2[i++], splitT2[i++]);
            studentsGradesList.add(studentGrade);
        }
    }

    public ArrayList<StudentInformation> getStudentsInformationList() {
        return studentsInformationList;
    }

    public void setStudentsInformationList(ArrayList<StudentInformation> studentsInformationList) {
        this.studentsInformationList = studentsInformationList;
    }

    public ArrayList<StudentGrade> getStudentsGradesList() {
        return studentsGradesList;
    }

    public void setStudentsGradesList(ArrayList<StudentGrade> studentsGradesList) {
        this.studentsGradesList = studentsGradesList;
    }

    public void studentsAverage() {

    }

    public StudentInformation studentInformationFind() {
        StudentInformation studentInformation = null;
        return studentInformation;
    }

    @Override
    public String toString() {
        return "Students [studentsGradesList=" + studentsGradesList + ", studentsInformationList="
                + studentsInformationList + "]";
    }

};

class StudentInformation {
    private String id;
    private String name;
    private String gender;
    private String average = "0";

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
    
    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + gender;
    }
}

class StudentGrade {
    private String id;
    private String subject;
    private Float grade;

    public StudentGrade(String id, String subject, Float grade) {
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

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return id + ", " + subject + ", " + grade;
    }
};
