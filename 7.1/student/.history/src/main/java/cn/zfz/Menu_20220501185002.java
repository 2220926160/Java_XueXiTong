package cn.zfz;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public Scanner sc = new Scanner(System.in);

    public Menu() {
    }

    // 登录界面
    public void loginMenu() {

    }

    // 系统界面
    public void systemMenu() {
        System.out.println(" ======学生成绩管理系统======= ");
        System.out.println("1. 从 excel 中加载数据");
        System.out.println("2. 从文本文件加载数据 ");
        System.out.println("3. 从 xml 文件加载数据 ");
        System.out.println("4. 从 json 文件中加载数据(未完成)");
        System.out.println("5. 键盘输入数据(输入end结束录入) ");
        System.out.println("6. 成绩查询 ");
        System.out.println("7. 输出到 excel 文件");
        System.out.println("8. 输出到纯文本文件 ");
        System.out.println("9. 输出到 xml 文件");
        System.out.println("10.输出到 json 文件(未完成)");
        System.out.println("11.修改密码(未完成)");
        System.out.println("12.退出 ");
        int choice = 0;
        StudentList studentList = new StudentList();
        while (true) {
            System.out.println("=====================================");
            System.out.print("请输入选项:");
            choice = sc.nextInt();
            switch (choice) {
                case 1: // 从 excel 中加载数据
                    studentList.setStudentList(loadFromExcel("data/student.xls"));
                    break;
                case 2: // 从 txt 文件加载数据
                    studentList.setStudentList(loadFromTxt("data/student.txt"));
                    break;
                case 3: // 从 xml 文件加载数据
                    studentList.setStudentList(loadFromXml("data/student.xml"));
                    break;
                case 4:

                    break;
                case 5: // 键盘输入数据
                    inputFromKeyboard(studentList);
                    break;
                case 6: // 成绩查询
                    gradeSearch(studentList);
                    break;
                case 7: // 输出到 excel 文件
                    saveToExcel("data/student.xls", studentList.getStudentList());
                    break;
                case 8: // 输出到纯文本文件
                    saveToTxt("data/student.txt", studentList.getStudentList());
                    break;
                case 9: // 输出到 xml 文件
                    saveToXml("data/student.xml", studentList.getStudentList());
                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 12: // 退出
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    public ArrayList<StudentInfo> loadFromExcel(String pathExcel) {
        InputFile inputFile = new InputFile();
        inputFile.setPathExcel(pathExcel);
        inputFile.InputExcel();
        return inputFile.getStudentList();
    }

    public ArrayList<StudentInfo> loadFromTxt(String pathTxt) {
        InputFile inputFile = new InputFile();
        inputFile.setPathTxt(pathTxt);
        inputFile.InputTxt();
        return inputFile.getStudentList();
    }

    public ArrayList<StudentInfo> loadFromXml(String pathXml) {
        InputFile inputFile = new InputFile();
        inputFile.setPathXml(pathXml);
        inputFile.InputXml();
        return inputFile.getStudentList();
    }

    public void saveToExcel(String pathExcel, ArrayList<StudentInfo> studentList) {
        OutputFile outputFile = new OutputFile(studentList);
        outputFile.setPathExcel(pathExcel);
        outputFile.outputExcel();
    }

    public void saveToTxt(String pathTxt, ArrayList<StudentInfo> studentList) {
        OutputFile outputFile = new OutputFile(studentList);
        outputFile.setPathTxt(pathTxt);
        outputFile.outputTxt();
    }

    public void saveToXml(String pathXml, ArrayList<StudentInfo> studentList) {
        OutputFile outputFile = new OutputFile(studentList);
        outputFile.setPathXml(pathXml);
        outputFile.outputXml();
    }

    public void gradeSearch(StudentList studentList) {
        StudentList searchList = new StudentList();
        System.out.print("请输入待查询学生的学号:");
        String searchId = sc.next();
        if (studentList.isExistBy_Id(searchId)) {
            searchList.setStudentList(studentList.searchBy_id(searchId));
        } else {
            System.out.println("【不存在该学生】");
        }
        if (searchList.size() != 0) {
            System.out.println("学号 姓名 性别 课程 成绩");
            System.out.println(searchList.toString(" "));
        }
    }

    public void inputFromKeyboard(StudentList studentList) {
        sc.nextLine(); // 吸收脏数据
        String endstr = "end";
        String inputLine = sc.nextLine();
        String splitSymbol = " ";
        while (!inputLine.equals(endstr)) {
            String[] info = inputLine.split(splitSymbol, 5);
            StudentInfo studentInfo = new StudentInfo(info[0], info[1], info[2],
                    info[3], Float.parseFloat(info[4]));
            if (studentList.add(studentInfo)) {
                System.out.println("增加成功");
            }
            inputLine = sc.next();
        }
    }
}
