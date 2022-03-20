import java.util.Scanner;

public class Customer { // 顾客/用户
    public static Scanner input = new Scanner(System.in);
    private String ssn; // 社会安全号码
    private String name; // 用户名
    private CheckingAccount checkingAccount = null; // 信用卡
    private SavingsAccount savingsAccount = null; // 存储卡

    public Customer() { // type为真,创建信用卡 为假,创建存储卡
        System.out.print("请输入社会安全号码:");
        input.next();
        System.out.print("请输入用户名:");
        input.next();
    }

    public void CustomerChecking() {
        checkingAccount = new CheckingAccount();
    }
    
    public void CustomerSaving() {
        savingsAccount = new SavingsAccount();
    }

    public Customer(String ssn, String name, CheckingAccount checkingAccount, SavingsAccount savingsAccount) {
        this.ssn = ssn;
        this.name = name;
        this.checkingAccount = checkingAccount;
        this.savingsAccount = savingsAccount;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    @Override
    public String toString() {
        return "Customer [checkingAccount=" + checkingAccount + ", name=" + name + ", savingsAccount=" + savingsAccount
                + ", ssn=" + ssn + "]";
    }

}
