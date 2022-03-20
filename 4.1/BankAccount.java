import java.util.Scanner;

public class BankAccount {
    public static Scanner input = new Scanner(System.in);
    private String accoutNum; // 卡号
    private double balance; // 余额

    public BankAccount() {
        System.out.print("请输入卡号:");
        this.accoutNum = input.next();
        this.balance = 0.0d; // 初始余额为0
    }

    public BankAccount(String accouNum, double balance) {
        this.accoutNum = accouNum;
        this.balance = balance;
    }

    public String getAccouNum() {
        return accoutNum;
    }

    public void setAccouNum(String accoutNum) {
        this.accoutNum = accoutNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount [卡号:" + accoutNum + ", 余额:" + balance + "]";
    }

    
}
