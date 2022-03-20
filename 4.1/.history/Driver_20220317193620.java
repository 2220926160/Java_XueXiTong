import java.util.*;

public class Driver {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Customer customer = null;

        while (true) {
            switch (menuMain()) {
                case 1: // 开户
                    customer = create(menuCreat(), customer);
                    break;
                case 2: // 存款
                    if (isExist(customer, false)) {
                        save(customer);
                    }
                    break;
                case 3: // 取款
                    if (isExist(customer, false)) {
                        withdrawal(customer);
                    }
                    ;
                    break;
                case 4: // 消费
                    if (isExist(customer, true)) {
                        comsume(customer);
                    }
                    ;
                    break;
                case 5: // 还款
                    if (isExist(customer, true)) {
                        repay(customer);
                    }
                    ;
                    break;
                case 6: // 结算
                    settle(customer);
                    break;
                case 7: // 查询余额
                    balance(customer);
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
            System.out.print("该选择非法,请重新输入您的选择:");
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

    public static Customer create(int choice, Customer customer) { // choice:[1]创建信用卡 [2]创建存储卡
        if (customer == null) {
            customer = new Customer();
        }
        switch (choice) {
            case 1: // 创建信用卡
                customer.CustomerChecking();
                System.out.println("信用卡开卡成功!");
                break;
            case 2: // 创建存储卡
                customer.CustomerSaving();
                System.out.println("存储卡开卡成功!");

                break;
        }
        System.out.println("开卡成功!");
        return customer;
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

    public static void settle(Customer customer) { // 结算
        if (isExist(customer, true)) {
            customer.getCheckingAccount().setBalance(
                    customer.getCheckingAccount().getBalance() - customer.getCheckingAccount().getServiceCharge());
            System.out.print("信用卡结算成功");
        }
        if (isExist(customer, false)) {
            customer.getSavingsAccount().setBalance(
                    customer.getSavingsAccount().getBalance() * customer.getSavingsAccount().getInterestRate());
            System.out.print("存储卡结算成功");
        }
    }

    public static void balance(Customer customer) { // 查询余额
        if (isExist(customer, true)) {
            System.out.print("信用卡余额:" + customer.getCheckingAccount().getBalance());
        }
        if (isExist(customer, false)) {
            System.out.print("存储卡余额:" + customer.getSavingsAccount().getBalance());
        }
    }
}
