package cn.zfz;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import jxl.*;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class OutputFile {
    private ArrayList<StudentInfo> studentList;
    private String pathExcel;
    private String pathTxt;
    private String pathXml;
    private String pathJson;

    public OutputFile() {
        this.studentList = new ArrayList<StudentInfo>();
    }

    public OutputFile(ArrayList<StudentInfo> studentList) {
        this.studentList = studentList;
    }

    public String getPathExcel() {
        return pathExcel;
    }

    public void setPathExcel(String pathExcel) {
        this.pathExcel = pathExcel;
    }

    public ArrayList<StudentInfo> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<StudentInfo> studentList) {
        this.studentList = studentList;
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

    // 输出到 excel 文件
    public boolean outputExcel() {
        try {
            WritableWorkbook writeBook = Workbook.createWorkbook(new File(pathExcel));
            WritableSheet writeSheet = writeBook.createSheet("student", 0);
            String[] header = { "学号", "姓名", "性别", "课程", "成绩" };
            for (int i = 0; i < 5; i++) {
                Label label = new Label(i, 0, header[i]);
                writeSheet.addCell(label);
            }
            int count = 1;
            for (StudentInfo studentInfo : studentList) {
                Label id = new Label(0, count, studentInfo.getId());
                Label name = new Label(1, count, studentInfo.getName());
                Label gender = new Label(2, count, studentInfo.getGender());
                Label course = new Label(3, count, studentInfo.getCourse());
                Label grade = new Label(4, count, studentInfo.getGrade().toString());
                writeSheet.addCell(id);
                writeSheet.addCell(name);
                writeSheet.addCell(gender);
                writeSheet.addCell(course);
                writeSheet.addCell(grade);
                count++;
            }
            writeBook.write();
            writeBook.close();
            System.out.println("输出到 excel 文件成功");
            return true;
        } catch (Exception e) {
            System.out.println("输出到 excel 文件失败");
            e.printStackTrace();
        }
        return false;
    }

    // 输出到 txt 文件
    public boolean outputTxt() {
        String splitSymbol = " ";
        try {
            File file = new File(pathTxt);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            for (StudentInfo studentInfo : studentList) {
                String str = "";
                str += studentInfo.getId() + splitSymbol + studentInfo.getName() + splitSymbol + studentInfo.getGender()
                        + splitSymbol + studentInfo.getCourse() + splitSymbol + studentInfo.getGrade() + "\n";
                fileOutputStream.write(str.getBytes());
            }
            fileOutputStream.close();
            System.out.println("输出到 txt 文件成功");
            return true;
        } catch (Exception e) {
            System.out.println("输出到 txt 文件失败");
            e.printStackTrace();
        }
        return false;
    }

    // 输出到 xml 文件
    public boolean outputXml() {
        try {
            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(new File(pathXml)), format);
            Document document = DocumentHelper.createDocument();
            Element rootElement = document.addElement("list"); // 根节点
            for (StudentInfo studentInfo : studentList) {
                Element stduent = rootElement.addElement("student"); // 子节点
                stduent.addElement("id").addText(studentInfo.getId());
                stduent.addElement("name").addText(studentInfo.getName());
                stduent.addElement("gender").addText(studentInfo.getGender());
                stduent.addElement("course").addText(studentInfo.getCourse());
                stduent.addElement("grade").addText(studentInfo.getGrade().toString());
            }
            xmlWriter.write(document);
            System.out.println("输出到 xml 文件成功");
            return true;
        } catch (Exception e) {
            System.out.println("输出到 xml 文件失败");
            e.printStackTrace();
        }
        return false;
    }

    // 输出到 json 文件
    public boolean outputJson(ArrayList<StudentInfo> studentList) {
        return false;
    }
}
