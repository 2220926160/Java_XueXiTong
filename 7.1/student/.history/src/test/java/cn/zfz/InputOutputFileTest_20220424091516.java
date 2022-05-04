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
        inputFile.setPathExcel("data/student.xls");
        inputFile.InputExcel();
        System.out.println("Excel 数据：");
        System.out.println(inputFile.toString());

        OutputFile outputFile = new OutputFile(inputFile.getStudentList());
        outputFile.setPathXml("data/student.xml");
        outputFile.outputXml();
    }
}
