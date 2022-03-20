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

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        boolean isExit = false;
        int choice = 0;
        Integer grades[] = new int[5];
        while(!isExit){
            menu();
            System.out.print("Please enter your selection:");
            choice = input.nextInt();
            if(choice == 1){

            }
            else if(choice == 2){

            }
            else if(choice == 3){
                
            }
            else if(choice == 4){
                
            }
            else if(choice == 5){
                
            }
            else if(choice == 6){
                isExit = true;
            }
        }
    }
    public static void menu(){
        System.out.println("+------------------------+");
        System.out.println("|     [1]input score     |");
        System.out.println("|     [2]class average   |");
        System.out.println("|     [3]highest Grade   |");
        System.out.println("|     [4]lowest Grade    |");
        System.out.println("|     [5]sort            |");
        System.out.println("|     [6]exit            |");
        System.out.println("+-----------------------+");
    }
}