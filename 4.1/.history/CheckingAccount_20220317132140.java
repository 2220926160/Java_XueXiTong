import java.util.Scanner;

public class CheckingAccount extends BankAccount{ // 信用卡
    public static Scanner input = new Scanner(System.in);
    private double serviceCharge;

    public CheckingAccount() {
        System.out.print("请输入服务费:");
        this.serviceCharge = input.nextDouble();
    }

    public CheckingAccount(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public String toString() {
        return "信用卡 [服务费:" + serviceCharge + "]";
    }
}
