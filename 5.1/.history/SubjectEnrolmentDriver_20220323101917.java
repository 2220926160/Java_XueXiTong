import java.util.*;

// Function: Create a new Student and, 
//           if appropriate, add it to the instance of Enrolment.

class SubjectEnrolmentDriver {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        SubjectEnrolment subjectEnrolment = new SubjectEnrolment("123456", "数学", 2022, 2, 2);
        // SubjectEnrolment subjectEnrolment = null;
        System.out.println("+-----------------------+");
        System.out.println("|   1. 创建新学科       |");
        System.out.println("|   2. 添加学生         |");
        System.out.println("|   3. 删除学生         |");
        System.out.println("|   4. 打印学科信息表   |");
        System.out.println("|   5. 退出             |");
        System.out.println("+-----------------------+");
        while (true) {
            System.out.print("请输入您的选择: ");
            switch (sc.nextInt()) {
                case 1:
                    subjectEnrolment = creatSubject();
                    break;
                case 2: {
                    if (subjectEnrolment == null) {
                        System.out.println("未创建课程, 请先创建");
                        continue;
                    } else {
                        addStduent(subjectEnrolment);
                    }
                }
                    break;
                case 3:
                    if (subjectEnrolment == null) {
                        System.out.println("未创建课程, 请先创建");
                        continue;
                    } else {
                        deleteStudent(subjectEnrolment);
                    }
                    break;
                case 4:
                    if (subjectEnrolment == null) {
                        System.out.println("未创建课程, 请先创建");
                        continue;
                    } else {
                        display(subjectEnrolment);
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Selection Wrong");
            }
        }
    }

    public static SubjectEnrolment creatSubject() {
        System.out.print("请输入课程号: ");
        String subjectId = sc.next();
        System.out.print("请输入课程名: ");
        String subjectName = sc.next();
        System.out.print("请输入年份: ");
        Integer year = sc.nextInt();
        System.out.print("请输入学期: ");
        Integer term = sc.nextInt();
        System.out.print("请输入课程最大学生数: ");
        Integer studentMax = sc.nextInt();
        SubjectEnrolment subjectEnrolment = new SubjectEnrolment(subjectId, subjectName, year, term, studentMax);
        System.out.println(subjectEnrolment.getSubjectId() + " 号课程创建成功");
        return subjectEnrolment;
    }

    public static void addStduent(SubjectEnrolment subjectEnrolment) {
        System.out.print("请输入学号: ");
        String studentId = sc.next();
        System.out.print("请输入学生姓名: ");
        String studentName = sc.next();
        subjectEnrolment.add(studentId, studentName);
    }

    public static void deleteStudent(SubjectEnrolment subjectEnrolment) {
        System.out.print("请输入将要删除的学号: ");
        String studentId = sc.next();
        subjectEnrolment.delete(studentId);
    }

    public static void display(SubjectEnrolment subjectEnrolment) {
        System.out.println(subjectEnrolment.toString());
    }
}
