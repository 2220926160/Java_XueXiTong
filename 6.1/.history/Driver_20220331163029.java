import java.util.*;

public class Driver {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("+-------------------+");
        System.out.println("|   密码有效性检验  |");
        System.out.println("|   运算表达式求解  |");
        System.out.println("|   学生成绩统计    |");
        System.out.println("|   退出            |");
        System.out.println("+-------------------+");

        //== 密码有效性检验测试
        // System.out.println("请输入密码:");
        // CheckingPassword checkingPassword = new CheckingPassword(sc.nextLine());
        // // CheckingPassword checkingPassword = new CheckingPassword();
        // System.out.println(checkingPassword.toString());

        //== 运算表达式求解
        Calculate calculate = new Calculate("max(1,3.2)");
        System.out.println(calculate.toString());

        // while (true) {
        // System.out.print("请选择(1-4): ");
        // switch (sc.nextInt()) {
        // case 1: // 密码有效性检验
        // ;
        // break;
        // case 2: // 运算表达式求解
        // ;
        // break;
        // case 3: // 学生成绩求解
        // ;
        // break;
        // case 4:
        // System.exit(0);
        // break;
        // default:
        // ;
        // break;
        // }
        // }
    }
};