
// Emulate a vending machine. Calculate the number of dollars and coins required to express a given amount of change in dollars, 50, 20, 10 and 5 cent coins. For example, $9.85 would be $9, 1 x 50c, 1 x 20x and 1 x 5c coins. Then modify it so that it also prints out the number of $1 and $2 coins. 
import java.nio.BufferUnderflowException;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a price:");
        float dollarInput = input.nextFloat();

        float dollars[] = { 1f, 0.5f, 0.2f, 0.1f, 0.05f };
        int number[] = new int[5];
        int j = 0;
        for (float i : dollars) {
            while (dollarInput - i > 0.0) {
                number[j]++;
                dollarInput -= i;
            }
            j++;
        }
        for (int i : number) {
            System.out.println(i);
        }
        // System.out.println("$%f", number[0]);
        input.close();
    }
}
