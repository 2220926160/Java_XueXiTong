package cn.zfz;

import java.io.File;
import java.util.ArrayList;

public class OutputFile {
    private ArrayList<StudentInfo> studentList;
    File fileExcel = new File("data/student.xls");
    // 输出到 excel 文件
    public boolean outputExcel(ArrayList<StudentInfo> studentList) {
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
