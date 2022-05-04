package cn.zfz;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import jxl.*;

public class InputFile {
    private ArrayList<StudentInfo> studentList;
    File fileExcel = new File("data/student.xls");

    public InputFile() {
        this.studentList = new ArrayList<StudentInfo>();
    }

    // 从 excel 中加载数据
    public boolean InputExcel() {
        if (fileExcel.exists()) {
            System.out.println("存在");
        }
        else {
            System.out.println("不存在");
        }
        try {
            Workbook workbook = Workbook.getWorkbook(new File("../../../../../data", "student.xls"));
            System.out.println("从 excel 中加载数据成功");
            return true;
        } catch (Exception e) {
            System.out.println("从 excel 中加载数据失败");
            e.printStackTrace();
        }
        return false;
    }

    // 从 txt 中加载数据
    public boolean InputTxt() {
        return false;
    }

    // 从 xml 中加载数据
    public boolean InputXml() {
        return false;
    }

    // 从 json 中加载数据
    public boolean InputJson() {
        return false;
    }
}
