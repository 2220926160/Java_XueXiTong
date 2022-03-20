
// Emulate a vending machine. Calculate the number of dollars and coins required to express a given amount of change in dollars, 50, 20, 10 and 5 cent coins. For example, $9.85 would be $9, 1 x 50c, 1 x 20x and 1 x 5c coins. Then modify it so that it also prints out the number of $1 and $2 coins. 
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a price:");
        float dollarInput = input.nextFloat();

        float dollars[] = { 1f, 0.5f, 0.2f, 0.1f, 0.05f, 0.01f };
        int number[] = new int[6];
        int j = 0;
        for (float i : dollars) {
            while (dollarInput - i > 0.0) {
                number[j]++;
                dollarInput -= i;
            }
            j++;
        }
        System.out.print("$" + dollarInput + " would be ");
        System.out.println("$" + dollarInput + " would be $" + number[0] + ", " + number[1] + " x 50c, " + number[2]
                + " x 20c and " + number[3] + " x 5c coins");
        input.close();
    }
}
