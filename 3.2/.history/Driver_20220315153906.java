import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.close();
    }

    public static int showMenu() {
        return 0;
    }

    public static ClassList creat() {
        Scanner input = new Scanner(System.in);

        Integer semester = input.nextInt();
        Integer year = input.nextInt();
        String subjectID = input.next();
        String subjectName = input.next();
        Subject subj = new Subject(subjectID, subjectName);
        String studentID1 = input.next();
        String firstName1 = input.next();
        String lastName1 = input.next();
        Student s1 = new Student(studentID1, firstName1, lastName1);
        Student s2;
        // ClassList classList = new
    }
};
