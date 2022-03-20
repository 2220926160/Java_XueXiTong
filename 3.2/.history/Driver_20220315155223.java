import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.close();
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
        if(choice >= 1 && choice <= 3) {
            return choice;
        }
        else {
        System.out.print("请输入合法选择，请重新输入您的选择");

        }

        input.close();
        return 0;
    }

    public static ClassList creat() {
        ClassList classList = new ClassList();
        return classList;
    }

    public static void print() {

    }
};
