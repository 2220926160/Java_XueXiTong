import java.util.*;

public class Driver {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // BankAccount bankAccount = new BankAccount();
        // System.out.println(bankAccount.toString());

        // CheckingAccount checkingAccount = new CheckingAccount();
        // System.out.println(checkingAccount.toString());
        // Customer customer = new Customer(true);
        // Customer customer = new Customer();
        Customer customer = null;

        while (true) {
            switch (menuMain()) {
                case 1: // 开户
                    switch (menuCreat()) { // 开户菜单 1:信用卡 2:存储卡 3:返回
                        case 1:
                            customer = new Customer(true);
                            break;
                        case 2:
                            customer = new Customer(true);
                            break;
                        case 3:
                            ;
                            break;
                    }
                    ;
                    break;
                case 2: // 存款
                    deposit(customer);
                    break;
                case 3:
                    ;
                    break;
                case 4:
                    ;
                    break;
                case 5:
                    ;
                    break;
                case 6:
                    ;
                    break;
                case 7:
                    ;
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }

    public static int menuMain() {
        System.out.println("========================");
        System.out.println("欢迎使用银行系统");
        System.out.println("1.开户 create");
        System.out.println("2.存款 save");
        System.out.println("3.取款 withdraw");
        System.out.println("4.消费 comsume");
        System.out.println("5.还款 repay");
        System.out.println("6.银行结算 settle");
        System.out.println("7.查询余额 balance");
        System.out.println("8.退出 exit");
        System.out.print("请选择(1-8): ");

        final int menuChoice = 8;
        int choice = input.nextInt();
        while (choice < 1 || choice > menuChoice) {
            System.out.print("该选择非法");
            System.out.print("请重新输入您的选择:");
            choice = input.nextInt();
        }
        return choice;
    }

    public static int menuCreat() {
        System.out.println("========================");
        System.out.println("1.信用卡 checkingAccount");
        System.out.println("2.存储卡 savingAccount");
        System.out.println("3.返回 exit");
        System.out.print("请选择(1-3): ");

        final int menuChoice = 3;
        System.out.print("请输入您的选择:");
        int choice = input.nextInt();
        while (choice < 1 || choice > menuChoice) {
            System.out.print("该选择非法");
            System.out.print("请重新输入您的选择:");
            choice = input.nextInt();
        }
        return choice;
    }
    
    public static void deposit(Customer customer) {
        System.out.print("请输入存款金额:");
        double money = input.nextDouble();
        customer.getSavingsAccount().setBalance(customer.getSavingsAccount().getBalance() + money);
        System.out.print("存储 " + money + " RMB成功");
    }
}
