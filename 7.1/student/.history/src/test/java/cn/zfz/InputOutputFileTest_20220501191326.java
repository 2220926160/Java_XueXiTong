/*
 * @Author: your name
 * @Date: 2022-04-22 22:35:05
 * @LastEditTime: 2022-05-01 19:13:20
 * @LastEditors: your name
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \student\src\test\java\cn\zfz\InputOutputFileTest.java
 */
package cn.zfz;

import org.junit.Test;

public class InputOutputFileTest {
    @Test
    public void inputOutputExcelTest() {
        InputFile inputFile = new InputFile();
        inputFile.setPathExcel("data/student.xls");
        inputFile.InputExcel();
        System.out.println("Excel 数据：");
        System.out.println(inputFile.toString());

        OutputFile outputFile = new OutputFile(inputFile.getStudentList());
        outputFile.setPathExcel("data/student1.xls");
        outputFile.outputExcel();
    }
    @Test
    public void inputOutputTxtTest() {
        InputFile inputFile = new InputFile();
        inputFile.setPathTxt("data/student.txt");
        inputFile.InputTxt();
        System.out.println("Txt 数据：");
        System.out.println(inputFile.toString());

        OutputFile outputFile = new OutputFile(inputFile.getStudentList());
        outputFile.setPathTxt("data/student1.txt");
        outputFile.outputTxt();
    }
    @Test
    public void inputOutputXmlTest() {
        InputFile inputFile = new InputFile();
        inputFile.setPathXml("data/student.xml");
        inputFile.InputXml();
        System.out.println("xml 数据：");
        System.out.println(inputFile.toString());

        OutputFile outputFile = new OutputFile(inputFile.getStudentList());
        outputFile.setPathXml("data/student.xml");
        outputFile.outputXml();
    }
    @Test
    public void inputOutputJsonTest() {
        InputFile inputFile = new InputFile();
        inputFile.setPathJson("data/student.json");
        inputFile.InputJson();
        System.out.println("json 数据：");
        System.out.println(inputFile.toString());
        // InputFile inputFile = new InputFile();
        // inputFile.setPathXml("data/student.xml");
        // inputFile.InputXml();
        // System.out.println("xml 数据：");
        // System.out.println(inputFile.toString());

        OutputFile outputFile = new OutputFile(inputFile.getStudentList());
        outputFile.setPathJson("data/student.json");
        outputFile.outputJson();
    }
}
