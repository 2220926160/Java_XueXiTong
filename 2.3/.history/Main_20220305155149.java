// 创建一个 Java 程序，以数字成绩 （0-100） 的形式输入 5 个学生成绩。
// 如果输入的年级小于0或大于100，则要求重新进入该特定等级。您的程序是计算和显示班级平均成绩，并在选择适当的菜单选项时显示最高和最低成绩
// input score
// class average
// highest Grade
// lowest Grade
// sort
// exit
// 完成后增加校验功能。当用户不输入分数时，如果选择了其他函数，则会给出"请先输入分数再执行该函数"的提示，并返回主菜单。

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        boolean isExit = false;
        int choice = 0;
        Double grades[] = new Double[5];
        for(Double i : grades){
            System.out.println(i);
        }
        while (!isExit) {
            Menu();
            System.out.print("Please enter your selection:");
            choice = input.nextInt();
            if (choice == 1) { // input score
                System.out.print("Please enter a grade:");
                if (IdexNULL(grades) == -1) {
                    System.out.println("The student grade list is full!");
                } 
                else {
                    grades[IdexNULL(grades)] = input.nextDouble();
                    System.out.println("Added successfully!");
                }
            } 
            else if (choice == 2) { // class average
                if (IsNULL(grades)) {
                    System.out.println("Please enter your scores first");
                    continue;
                } 
                System.out.println("Average:" + Average(grades));
            }
            else if (choice == 3) { // highest Grade
                if (IsNULL(grades)) {
                    System.out.println("Please enter your scores first");
                    continue;
                } 
                System.out.println("Highest grade:" + grades[IndexHighest(grades)]);
            } 
            else if (choice == 4) { // lowest Grade
                System.out.println("Lowest grade:" + grades[IndexLowest(grades)]);
            }
            else if (choice == 5) { // sort
                Arrays.sort(grades);
                System.out.println("Sort succeeded!");
            } 
            else if (choice == 6) { // exit
                isExit = true;
            }
        }
        System.out.println("Thank you for using it!");
        input.close();
    }

    public static void Menu() {
        System.out.println("+------------------------+");
        System.out.println("|     [1]input score     |");
        System.out.println("|     [2]class average   |");
        System.out.println("|     [3]highest Grade   |");
        System.out.println("|     [4]lowest Grade    |");
        System.out.println("|     [5]sort            |");
        System.out.println("|     [6]exit            |");
        System.out.println("+------------------------+");
    }

    public static void Warn(Double[] num) {
        if (IsNULL(num)) {
            System.out.println("Please enter your scores first");
            return;
        }
    }

    public static int IdexNULL(Double[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public static double Average(Double[] num) {
        if (IsNULL(num)) {
            return 0;
        }
        double sum = 0.0d;
        for (Double i : num) {
            sum += i;
        }
        return sum / num.length;
    }

    public static boolean IsNULL(Double[] num) {
        for (Double i : num) {
            if (i != null) {
                return false;
            }
        }
        return true;
    }

    public static int IndexHighest(Double[] num) {
        if (IsNULL(num)) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > num[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int IndexLowest(Double[] num) {
        if (IsNULL(num)) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < num[index]) {
                index = i;
            }
        }
        return index;
    }
}