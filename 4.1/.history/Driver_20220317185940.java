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
                    create(menuCreat(), customer);
                    break;
                case 2: // 存款
                {
                    if(isExist(customer, false)) {

                    }
                    if (customer == null) {
                        System.out.println("请先开户");
                    }
                    if (customer.getSavingsAccount() == null) {
                        System.out.println("请先开卡(存储卡)");
                        continue;
                    }
                    save(customer);
                }
                    break;
                case 3: // 取款
                {
                    if (customer.getSavingsAccount() == null) {
                        System.out.println("请先开卡(存储卡)");
                        continue;
                    }
                    withdrawal(customer);
                }
                    ;
                    break;
                case 4: // 消费
                {
                    if (customer.getSavingsAccount() == null) {
                        System.out.println("请先开卡(信用卡)");
                        continue;
                    }
                    comsume(customer);
                }
                    ;
                    break;
                case 5: // 还款
                {
                    if (customer.getSavingsAccount() == null) {
                        System.out.println("请先开卡(信用卡)");
                        continue;
                    }
                    repay(customer);
                }
                    ;
                    break;
                case 6: // 结算
                    ;
                    break;
                case 7: // 查询余额
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

    public static boolean isExist(Customer customer, boolean type) { // type:真,信用卡 假,存储卡
        boolean isExist = true;
        String error = null;
        if (customer == null) {
            error = "请先开户";
        } else if (customer.getCheckingAccount() == null && type) {
            error = "请先开卡(信用卡)";
        } else if (customer.getSavingsAccount() == null && !type) {
            error = "请先开卡(存储卡))";
        }
        if (error != null) {
            System.out.println(error);
            isExist = false;
        }
        return isExist;
    }

    public static void create(int choice, Customer customer) { // choice:[1]创建信用卡 [2]创建存储卡
        if (customer == null) {
            customer = new Customer();
        }
        switch (choice) {
            case 1: // 创建信用卡
                customer.CustomerChecking();
                break;
            case 2: // 创建存储卡
                customer.CustomerSaving();
                break;
        }
    }

    public static void save(Customer customer) { // 存款
        System.out.print("请输入存款金额:");
        double money = input.nextDouble();
        customer.getSavingsAccount().setBalance(customer.getSavingsAccount().getBalance() + money);
        System.out.print("存储 " + money + " RMB成功");
    }

    public static void withdrawal(Customer customer) { // 取款
        System.out.print("请输入取款金额:");
        double money = input.nextDouble();
        if (customer.getSavingsAccount().getBalance() - money < 0) {
            System.out.println("存储卡中余额不足,取款失败");
            return;
        }
        customer.getSavingsAccount().setBalance(customer.getSavingsAccount().getBalance() - money);
        System.out.print("取出 " + money + " RMB成功");
    }

    public static void comsume(Customer customer) { // 消费
        System.out.print("请输入消费刷卡金额 :");
        double money = input.nextDouble();
        customer.getCheckingAccount().setBalance(customer.getCheckingAccount().getBalance() - money);
        System.out.print("消费 " + money + " RMB,刷卡成功");
    }

    public static void repay(Customer customer) { // 还款
        System.out.print("请输入还款金额  :");
        double money = input.nextDouble();
        customer.getCheckingAccount().setBalance(customer.getCheckingAccount().getBalance() + money);
        System.out.print("还款 " + money + " RMB成功");
    }
}
