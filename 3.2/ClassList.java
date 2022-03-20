import java.util.Scanner;

public class ClassList {
    public static Scanner sc = new Scanner(System.in);
    private Integer semester;
    private Integer year;
    private Subject subj;
    private Student s1;
    private Student s2;

    public ClassList() {
        System.out.print("请输入学期:");
        this.semester = sc.nextInt();
        System.out.print("请输入年份:");
        this.year = sc.nextInt();
        this.subj = new Subject();
        this.s1 = new Student();
        this.s2 = new Student();
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
        return "选课列表 [" + s1.toString() + ", " + s2.toString() + ", 学期:, " + semester + subj.toString() + ", 年份:" + year
                + "]";
    }

}
