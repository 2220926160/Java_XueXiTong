import java.util.*;

// Function: Create a new Student and, 
//           if appropriate, add it to the instance of Enrolment.

class SubjectEnrolmentDriver {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        SubjectEnrolment subjectEnrolment = null;
        while (true) {
            Integer choice = -1;
            System.out.println("+-----------------------+");
            System.out.println("1. 创建新学科");
            System.out.println("2. 添加学生");
            System.out.println("3. 删除学生");
            System.out.println("4. 打印学科信息表");
            System.out.println("请输入您的选择: ");
            choice = sc.nextInt(choice);
            
            switch (sc.nextInt()) {
                case 1:
                    {
                        System.out.println("请输入课程号:");
                        System.out.println("请输入课程名:");
                    };
                    break;
                case 2:
                    ;
                    break;
                case 3:
                    ;
                    break;
                case 4:
                    ;
                    break;
                default:
                    System.err.println("Selection Wrong");
            }
        }
    }

}
