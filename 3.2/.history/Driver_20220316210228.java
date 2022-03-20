import java.util.*;

public class Driver {
    public static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        // ClassList classList = new ClassList(input);

        // ISubject subject = new Subject();
        // System.out.println(subject.toString());

        // IStudent student = new Student();
        IStudent student = new Student();
        // System.out.println(student.toString());


        // ClassList classList = new ClassList();
        // int choice;
        // while (true) {
        //     choice = showMenu();
        //     switch (choice) {
        //         case 1:
        //             creat(classList);
        //             break;
        //         case 2:
        //             if (classList == null) {
        //                 System.out.println("请先创建列表");
        //             } else {
        //                 print(classList);
        //             }
        //             break;
        //         case 3:
        //             System.exit(0);
        //             break;
        //         default:
        //             System.out.println("Error");
        //     }
        // }
    }

    // public static int showMenu() {
    //     System.out.println("+-------------------------------+");
    //     System.out.println("|    1.Creat Attendance List    |");
    //     System.out.println("|    2.Print Attendance List    |");
    //     System.out.println("|    3.Exit                     |");
    //     System.out.println("+-------------------------------+");

    //     Scanner input = new Scanner(System.in);
    //     System.out.print("请输入您的选择：");
    //     int choice = input.nextInt();
    //     while (choice < 1 || choice > 3) {
    //         System.out.print("请输入合法选择，请重新输入您的选择：");
    //         choice = input.nextInt();
    //     }
    //     input.close();
    //     return choice;
    // }

    // public static void creat(Scanner input, ClassList classList) {
    //     classList = new ClassList(input);
    // }

    // public static void print(ClassList classList) {
    //     System.out.println(classList.toString());
    // }
};
