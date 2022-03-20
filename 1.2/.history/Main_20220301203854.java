import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
    
        System.out.print("Please enter the length and width of the image:");
        float high = input.nextFloat();
        float width = input.nextFloat();
        System.out.print("Please enter the frame type, 'False' is a normal frame and 'True' is a fancy frame:");
        boolean type = input.nextBoolean();
        System.out.print("Please enter a picture frame color:");
        String color = input.nextLine();
        System.out.print("Whether a crown needs to be placed, 'True' or 'False':");
        boolean crownNeed = input.nextBoolean();
    }
}
