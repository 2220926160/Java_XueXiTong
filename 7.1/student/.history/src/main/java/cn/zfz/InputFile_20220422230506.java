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
            Workbook workbook = Workbook.getWorkbook(new File("data/student.xls"));
            Sheet sheet = workbook.getSheet(0);
            for (int i = 1; i < sheet.getRows(); i++) {
                
                Cell id = sheet.getCell(i, 0);
                Cell name = sheet.getCell(i, 1);
                Cell gender = sheet.getCell(i, 2);
                Cell course = sheet.getCell(i, 3);
                Cell grade = sheet.getCell(i, 4);
                StudentInfo studentInfo = new StudentInfo(id.getContents(), name.getContents(), gender.getContents(), course.getContents(), Float.parseFloat(grade.getContents()));
                studentList.add(studentInfo);
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
