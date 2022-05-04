package cn.zfz;

import java.io.File;
import java.util.ArrayList;
import jxl.*;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class OutputFile {
    private ArrayList<StudentInfo> studentList;
    File fileExcel = new File("data/student.xls");
    // 输出到 excel 文件
    public boolean outputExcel(ArrayList<StudentInfo> studentList) {
        try {
            WritableWorkbook writeBook = Workbook.createWorkbook(new File("data/student.xls"));
            WritableSheet writeSheet = writeBook.createSheet("student", 0);
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
