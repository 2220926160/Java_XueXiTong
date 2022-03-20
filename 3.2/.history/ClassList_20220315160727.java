import java.util.Scanner;

public class ClassList {
    private Integer semester;
    private Integer year;
    private Subject subj;
    private Student s1;
    private Student s2;

    public ClassList() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学期：");
        this.semester = input.nextInt();
        System.out.println("请输入年份：");
        this.year = input.nextInt();
        this.subj = new Subject();
        this.s1 = new Student();
        this.s2 = new Student();
        input.close();
    }

    public ClassList(Integer semester, Integer year, Subject subj, Student s1, Student s2) {
        this.semester = semester;
        this.year = year;
        this.subj = subj;
        this.s1 = s1;
        this.s2 = s2;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Subject getSubj() {
        return subj;
    }

    public void setSubj(Subject subj) {
        this.subj = subj;
    }

    public Student getS1() {
        return s1;
    }

    public void setS1(Student s1) {
        this.s1 = s1;
    }

    public Student getS2() {
        return s2;
    }

    public void setS2(Student s2) {
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "1";
        // return "ClassList [s1=" + s1 + ", s2=" + s2 + ", semester=" + semester + ", subj=" + subj + ", year=" + year
        //         + "]";
    }

}
