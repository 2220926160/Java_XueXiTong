import java.util.ArrayList;

public class Students {
    private ArrayList<StudentInformation> studentsInformationList = new ArrayList<StudentInformation>();
    private ArrayList<StudentGrade> studentsGradesList = new ArrayList<StudentGrade>();
    private ArrayList<Subject> subjectsList = new ArrayList<Subject>();

    public Students(String T1, String T2) {
        String splitT1[] = T1.split("，|,|\n");
        String splitT2[] = T2.split("，|,|\n");

        for (int i = 0; !splitT1[i].isEmpty() && !splitT1[i].equals("end"); i += 3) {
            StudentInformation studentInformation = new StudentInformation(splitT1[i], splitT1[i + 1], splitT1[i + 2]);
            studentsInformationList.add(studentInformation);
            System.out.println("学生表添加成功");
        }
        for (int i = 0; !splitT2[i].isEmpty() && !splitT2[i].equals("end"); i += 3) {
            StudentGrade studentGrade = new StudentGrade(splitT2[i], splitT2[i + 1], Float.parseFloat(splitT2[i + 2]));
            studentsGradesList.add(studentGrade);
            System.out.println("学生成绩添加成功");
        }
        studentsAverage();
        subjectsAverage();
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
        for (StudentInformation i : studentsInformationList) {
            float gradeCount = 0;
            float count = 0;
            for (StudentGrade j : studentsGradesList) {
                if (i.getId().equals(j.getId())) {
                    gradeCount += j.getGrade();
                    count++;
                }
            }
            i.setAverage(gradeCount / count);
        }
    }

    public void subjectsAverage() {
        for (StudentGrade i : studentsGradesList) {
            boolean isExist = true;
            for (Subject j : subjectsList) {
                if (i.getSubject().equals(j.getName())) {
                    isExist = false;
                }
            }
            if (!isExist) {
                float gradeCount = 0;
                float count = 0;
                for (StudentGrade x : studentsGradesList) {
                    if (i.getSubject().equals(x.getSubject())) {
                        gradeCount += x.getGrade();
                        count++;
                    }
                }
                Subject newSubject = new Subject(i.getSubject(), gradeCount / count);
                subjectsList.add(newSubject);
            }
        }
    }

    @Override
    public String toString() {
        String msg = "";

        msg += "学生信息：\n";
        for (StudentInformation i : studentsInformationList) {
            msg += i.toString() + "\n";
        }
        msg += "学生成绩：\n";
        for (StudentGrade i : studentsGradesList) {
            msg += i.toString() + "\n";
        }
        msg += "学科成绩：\n";
        for (Subject i : subjectsList) {
            msg += i.toString() + "\n";
        }
        return msg;
    }

};

class StudentInformation {
    private String id;
    private String name;
    private String gender;
    private Float average = 0f;

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

    public Float getAverage() {
        return average;
    }

    public void setAverage(Float average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + gender + ", " + average;
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

    public Float getGrade() {
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

class Subject {
    private String name;
    private Float gradeAverage;

    public Subject(String name, Float gradeAverage) {
        this.name = name;
        this.gradeAverage = gradeAverage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getGradeAverage() {
        return gradeAverage;
    }

    public void setGradeAverage(Float gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    @Override
    public String toString() {
        return name + ", " + gradeAverage;
    }
}