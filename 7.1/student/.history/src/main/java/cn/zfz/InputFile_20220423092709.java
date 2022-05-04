package cn.zfz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import jxl.*;

public class InputFile {
    private ArrayList<StudentInfo> studentList;
    String pathExcel = "";
    String pathTxt = "";
    String pathXml = "";
    String pathJson = "";

    public InputFile() {
        this.studentList = new ArrayList<StudentInfo>();
    }

    public ArrayList<StudentInfo> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<StudentInfo> studentList) {
        this.studentList = studentList;
    }

    public String getPathExcel() {
        return pathExcel;
    }

    public void setPathExcel(String pathExcel) {
        this.pathExcel = pathExcel;
    }

    public String getPathTxt() {
        return pathTxt;
    }

    public void setPathTxt(String pathTxt) {
        this.pathTxt = pathTxt;
    }

    public String getPathXml() {
        return pathXml;
    }

    public void setPathXml(String pathXml) {
        this.pathXml = pathXml;
    }

    public String getPathJson() {
        return pathJson;
    }

    public void setPathJson(String pathJson) {
        this.pathJson = pathJson;
    }

    // 从 excel 中加载数据
    public boolean InputExcel() {
        try {
            Workbook workbook = Workbook.getWorkbook(new File(pathExcel));
            Sheet sheet = workbook.getSheet(0);
            for (int i = 1; i < sheet.getRows(); i++) {
                Cell id = sheet.getCell(0, i);
                Cell name = sheet.getCell(1, i);
                Cell gender = sheet.getCell(2, i);
                Cell course = sheet.getCell(3, i);
                Cell grade = sheet.getCell(4, i);
                StudentInfo studentInfo = new StudentInfo(id.getContents(), name.getContents(), gender.getContents(),
                        course.getContents(), Float.parseFloat(grade.getContents()));
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
        try {
            FileReader txtReader = new FileReader(pathTxt);
            BufferedReader bufferedReader = new BufferedReader(txtReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

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

    @Override
    public String toString() {
        String str = "";
        for (StudentInfo student : studentList) {
            str += student.toString() + "\n";
        }
        return str;
    }
}
