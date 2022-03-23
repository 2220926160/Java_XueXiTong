import java.util.*;

// Function: Create a new Student and, 
//           if appropriate, add it to the instance of Enrolment.

class SubjectEnrolmentDriver {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        while (true) {
            Integer choice = -1;
            System.out.println("+-----------------------+");
            System.out.println("1. Create new Subject");
            System.out.println("2. Add a Student");
            System.out.println("3. Print subject details");
            System.out.println("4. Exit");
            System.out.println("Please enter your selection: ");
            choice = sc.nextInt(choice);
            switch (sc.nextInt()) {
                case 1:
                    ;
                    break;
                case 2:
                    ;
                    break;
                case 3:
                    ;
                    break;
                case 4:
                    ;
                    break;
                default:
                    System.err.println("Selection Wrong");
            }
        }
    }

}
