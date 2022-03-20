import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
    
        System.out.print("Please enter the length and width of the image:");
        float high = input.nextFloat();
        float width = input.nextFloat();
        System.out.print("Please enter the frame type, 'False' is a normal frame and 'True' is a fancy frame:");
        boolean type = input.nextBoolean();
        System.out.print("Do you need to order a frame color (white by default)?'True' or 'False':");
        boolean color = input.nextBoolean();
        System.out.print("Do you need to put a cardboard behind the picture?'True' or 'False':");
        boolean cardboardNeed = input.nextBoolean();
        System.out.print("Do you need to put glass on top of the picture?'True' or 'False':");
        boolean glassNeed = input.nextBoolean();
        System.out.print("Whether a crown needs to be placed, 'True' or 'False':");
        boolean crownNeed = input.nextBoolean();
        int crownNum = 0;
        if(crownNeed){
            System.out.println("Please enter the desired number of crowns:");
            crownNum = input.nextInt();
        }

        float costSum = 0.0f;
        final float priceColor = 0.1f;
        final float priceOrdinary = 0.15f;
        final float priceFancy = 0.25f;
        final float priceCardboard = 0.02f;
        final float priceCrown = 0.35f;
        final float priceGlass = 0.07f;
        float frameSize = high * width;
        if(type){ // 花式镜框
            costSum += priceFancy * frameSize;
        }
        else{ // 普通
            costSum += priceOrdinary * frameSize;
        }
        if(color){ // 上色
            costSum += priceColor * frameSize;
        }
        if(cardboardNeed){ // 硬纸板
            costSum += priceCardboard * frameSize;
        }
        if(glassNeed){ // 玻璃
            costSum += priceGlass * frameSize;
        }
        if(crownNeed){ // 皇冠成本
            costSum += priceCrown * (crownNum * 1.0f);
        }
    }
}
