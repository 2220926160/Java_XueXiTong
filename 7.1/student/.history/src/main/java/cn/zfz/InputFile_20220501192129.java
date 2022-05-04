package cn.zfz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.DOMReader;
import org.dom4j.io.SAXReader;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import jxl.*;

public class InputFile {
    private ArrayList<StudentInfo> studentList;
    private String pathExcel = "";
    private String pathTxt = "";
    private String pathXml = "";
    private String pathJson = "";

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
            System.out.println("【成功导入 " + (sheet.getRows() - 1) + " 个学生】"); // 除去表头
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
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(pathTxt), "UTF-8"));
            String line = bufferedReader.readLine();
            int count = 0;
            while (line != null) {
                // System.out.println(line);
                count++;
                String[] info = line.split(" ");
                StudentInfo studentInfo = new StudentInfo(info[0], info[1], info[2], info[3],
                        Float.parseFloat(info[4]));
                studentList.add(studentInfo);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            System.out.println("从 txt 中加载数据成功");
            System.out.println("【成功导入 " + count + " 个学生】"); 
            return true;
        } catch (Exception e) {
            System.out.println("从 txt 中加载数据失败");
            e.printStackTrace();
        }
        return false;
    }

    // 从 xml 中加载数据
    public boolean InputXml() {
        try {
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(new File(pathXml));
            Element rootElement = document.getRootElement();
            List<Element> elements = rootElement.elements();
            int count = 0;
            for (Element e : elements) {
                Element idElement = e.element("id");
                Element nameElement = e.element("name");
                Element genderElement = e.element("gender");
                Element courseElement = e.element("course");
                Element gradeElement = e.element("grade");
                StudentInfo studentInfo = new StudentInfo(idElement.getText(), nameElement.getText(),
                        genderElement.getText(), courseElement.getText(), Float.parseFloat(gradeElement.getText()));
                studentList.add(studentInfo);
                count++;
            }
            System.out.println("从 xml 中加载数据成功");
            System.out.println("【成功导入 " + count + " 个学生】"); 
        } catch (Exception e) {
            System.out.println("从 xml 中加载数据失败");
            e.printStackTrace();
        }
        return false;
    }

    // 从 json 中加载数据
    public boolean InputJson() {
        try {
            JsonReader jsonReader = new JsonReader(new InputStreamReader(stream, "UTF-8"));

            // FileInputStream fileInputStream = new FileInputStream(pathJson);
            // InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            // BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            // String allInfo = "";
            // String line = "";
            // while ((allInfo = bufferedReader.readLine()) != null) {
            //     allInfo += line;
            // }
            // JSONObject jsonObject = new JSONObject(allInfo);
            // bufferedReader.close();
            return true;
        } catch (Exception e) {
            System.out.println("从 json 中加载数据失败");
            e.printStackTrace();
        }
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
