
// 程序随机给出一个 1-1000 的整数，然后让您猜测它是什么数字。你可以猜出任何数字，游戏会提示太大或太小，从而缩小结果范围。经过几次猜测和提示，终于给出了答案。
// 在游戏过程中，记录下您需要在游戏结束时猜测的次数并发布结果。您最多可以猜到10次。游戏结束后，如果您想再次玩游戏，请选择y以重新启动游戏，选择N退出程序
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Random random = new Random();
        int randomNum = random.nextInt(1000);

        Scanner input = new Scanner(System.in);
        int frequency = 0;
        boolean isRight = false;
        boolean reStart = true;
        while(reStart){
            while (frequency < 10 && !isRight) {
                System.out.print("Please enter the number you guessed:");
                int guessNum = input.nextInt();
                if (guessNum < randomNum) {
                    System.out.println("Too small!");
                }
                else if(guessNum > randomNum){
                    System.out.println("Too big!");
                }
                else{
                    isRight = true;
                }
                frequency++;
                if(!isRight){
                    System.out.println("You have " + (10 - frequency) + " more chances.");
                }
            }
            if(frequency >= 10){
                System.out.println("You failed!");
            }
            else{
                System.out.println("You did it!");
            }
            reStart = false;
            System.out.print("Please ask if you want to restart the new game? Y or N:");
            reStart = input.nextBoolean();
        }
        input.close();
    }
}