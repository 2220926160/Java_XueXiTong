public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        StudentInfo studentInfo1 = new StudentInfo("1", "小明", "男", "语文", "99");
        StudentInfo studentInfo2 = new StudentInfo("1", "小明", "男", "数学", "98");
        studentList.add(studentInfo1);
        studentList.add(studentInfo2);
        int index = 0;
        // StudentList.remove(index);
        StudentList.getStudentList().remove(0);
        System.out.println(studentList.toString());
    }
}