import java.util.Scanner;

public class SavingsAccount { // 存储卡
    public static Scanner input = new Scanner(System.in);
    private double interestRate;

    public SavingsAccount() {
        System.out.print("请输入利率:");
        this.interestRate = input.nextDouble();
    }

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "存储卡 [利率:" + interestRate + "]";
    }

}
