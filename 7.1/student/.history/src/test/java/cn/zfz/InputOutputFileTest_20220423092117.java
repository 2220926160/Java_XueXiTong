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
        outputFile.outputExcel(outputFile.getPathExcel());
    }
    @Test
    public void inputOutputTxtTest() {
        InputFile inputFile = new InputFile();
        inputFile.setPathTxt("data/student.txts");
        inputFile.InputTxt();
        System.out.println("Txt 数据：");
        System.out.println(inputFile.toString());

    }
}
