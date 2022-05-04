package cn.zfz;

import java.util.ArrayList;

import jxl.*;

public class InputFile {
    private ArrayList<StudentInfo> studentList;

    public InputFile(ArrayList<StudentInfo> studentList) {
        this.studentList = studentList;
    }
    // 从 excel 中加载数据
    public boolean InputExcel() {
        return false;
    }
    // 从 txt 中加载数据
    public boolean InputTxt() {
        return false;
    }
    // 从 xml 中加载数据
    public ArrayList<StudentInfo> InputXml() {
        ArrayList<StudentInfo> studentList = new ArrayList<StudentInfo>();
        return studentList;
    }
    // 从 json 中加载数据
    public ArrayList<StudentInfo> InputJson() {
        ArrayList<StudentInfo> studentList = new ArrayList<StudentInfo>();
        return studentList;
    }
}
