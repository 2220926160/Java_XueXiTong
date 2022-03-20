import java.util.*;

public class Main {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length and width of the image:");
        float high = input.nextFloat();
        float width = input.nextFloat();
        System.out.print("Please enter the frame type, 0 is a normal frame and 1 is a fancy frame:");
        boolean type = input.nextBoolean();
        System.out.print("Please enter a picture frame color:");
        String color = input.nextLine();
        System.out.print("Whether a crown needs to be placed, Y or N:");


    }
}
