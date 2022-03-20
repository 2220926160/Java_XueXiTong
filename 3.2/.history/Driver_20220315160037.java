import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ClassList classList;
        int choice;
        while (true) {
            choice = showMenu();
            switch (choice) {
                case 1:
                    classList = creat();
                    break;
                case 2:
                    if (classList == null) {
                        System.out.println("请先创建列表");
                    } else {
                        print(classList);
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error");
            }
        }
        // input.close();
    }

    public static int showMenu() {
        System.out.println("+-------------------------------+");
        System.out.println("|    1.Creat Attendance List    |");
        System.out.println("|    2.Print Attendance List    |");
        System.out.println("|    3.Exit                     |");
        System.out.println("+-------------------------------+");

        Scanner input = new Scanner(System.in);
        System.out.print("请输入您的选择：");
        int choice = input.nextInt();
        if (choice >= 1 && choice <= 3) {
            input.close();
            return choice;
        } else {
            System.out.print("请输入合法选择，请重新输入您的选择");
            choice = input.nextInt();
        }

        input.close();
        return 0;
    }

    public static ClassList creat() {
        ClassList classList = new ClassList();
        return classList;
    }

    public static void print(ClassList classList) {
        System.out.println(classList.toString());
    }
};
