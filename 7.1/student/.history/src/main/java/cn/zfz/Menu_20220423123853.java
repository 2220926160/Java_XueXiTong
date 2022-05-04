package cn.zfz;

import java.util.Scanner;

public class Menu {
    public Scanner sc = new Scanner(System.in);

    // 登录界面
    public void loginMenu() {

    }

    // 系统界面
    public void systemMenu() {
        System.out.println(" ======学生成绩管理系统======= ");
        System.out.println("1.从 excel 中加载数据");
        System.out.println("2. 从文本文件加载数据 ");
        System.out.println("3. 从 xml 文件加载数据 ");
        System.out.println("4. 从 json 文件中加载数据");
        System.out.println("5. 键盘输入数据 ");
        System.out.println("6. 成绩查询 ");
        System.out.println("7. 输出到 excel 文件");
        System.out.println("8. 输出到纯文本文件 ");
        System.out.println("9. 输出到 xml 文件 ");
        System.out.println("10. 输出到 json 文件 ");
        System.out.println("11. 修改密码 ");
        System.out.println("12. 退出 ");
        int choice = 0;
        while (true) {
            System.out.print("请输入选项：");
            choice = sc.nextInt();
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 12:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
