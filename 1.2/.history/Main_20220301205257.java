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
        int crownNum;
        if(crownNeed){
            System.out.println("Please enter the desired number of crowns:");
            crownNum = input.nextInt();
        }

        float costSum = 0.0f;
        final float priceSize = 0.1f;
        final float priceCardboard = 0.02f;
        final float priceCrown = 0.35f;
        final float priceGlass = 0.35f;
        float frameSize = high * width;
        costSum += priceSize * frameSize;
        if(type){ // 花式镜框
            costSum += (priceGlass + priceCardboard) * frameSize;
        }
        else{

        }
        if(crownNeed){
            costSum += priceCrown * crownNum;
        }
    }
}
