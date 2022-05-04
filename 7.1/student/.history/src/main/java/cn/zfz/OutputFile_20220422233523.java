package cn.zfz;

import java.io.File;
import java.util.ArrayList;
import jxl.*;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class OutputFile {
    private ArrayList<StudentInfo> studentList;
    File fileExcel = new File("data/student.xls");

    public OutputFile() {
        this.studentList = new ArrayList<StudentInfo>();
    }

    public OutputFile(ArrayList<StudentInfo> studentList) {
        this.studentList = studentList;
    }

    // 输出到 excel 文件
    public boolean outputExcel(ArrayList<StudentInfo> studentList) {
        try {
            WritableWorkbook writeBook = Workbook.createWorkbook(new File("data/student.xls"));
            WritableSheet writeSheet = writeBook.createSheet("student", 0);
            String[] header = { "学号", "姓名", "性别", "课程", "成绩" };
            for (int i = 0; i < 5; i++) {
                Label label = new Label(0, 0, header[i]);
                writeSheet.addCell(label);
            }
            for (StudentInfo studentInfo : studentList) {
                Label[] labe = {new Label(), };
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // 输出到 txt 文件
    public boolean outputTxt(ArrayList<StudentInfo> studentList) {
        return false;
    }

    // 输出到 xml 文件
    public boolean outputXml(ArrayList<StudentInfo> studentList) {
        return false;
    }

    // 输出到 json 文件
    public boolean outputJson(ArrayList<StudentInfo> studentList) {
        return false;
    }
}
