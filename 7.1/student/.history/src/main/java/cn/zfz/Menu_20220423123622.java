package cn.zfz;

import java.util.Scanner;

public class Menu {
    public Scanner sc = new Scanner(System.in);
    // 登录界面
    public void loginMenu() {

    }
    // 系统界面
    public void systemMenu() {
        while (true) {
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
            System.out.println("请输入选项：");
        }
    }
}
