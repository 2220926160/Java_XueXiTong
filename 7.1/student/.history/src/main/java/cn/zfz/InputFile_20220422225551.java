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
        try {
            Workbook workbook = Workbook.getWorkbook(new File("../../../../../data", "student.xls"));
            Sheet sheet = workbook.getSheet(0);
            for (int i = 0; i < sheet.getRows(); i++) {
                
                Cell cell = sheet.getCell(i, 0);
                // StudentInfo studentInfo = 
            }
            System.out.println("从 excel 中加载数据成功");
            workbook.close();
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
