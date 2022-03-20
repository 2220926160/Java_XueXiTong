import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.close();
    }

    public static int showMenu() {
        System.out.println("+-------------------------------+");
        System.out.println("|    1.Creat Attendance List    |");
        System.out.println("|    2.Print Attendance List    |");
        System.out.println("|    3.Exit                     |");
        System.out.println("+-------------------------------+");
        return 0;
    }

    public static ClassList creat() {
        ClassList classList = new ClassList();
        return classList;
    }

    public static void print() {

    }
};
