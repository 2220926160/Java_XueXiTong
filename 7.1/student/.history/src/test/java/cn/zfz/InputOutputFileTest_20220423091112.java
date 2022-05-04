package cn.zfz;

import org.junit.Test;

public class InputOutputFileTest {
    @Test
    public void inputOutputExcelText() {
        InputFile inputFile = new InputFile();
        inputFile.setPathExcel("data/student.xls");
        inputFile.InputExcel();
        System.out.println("数据：");
        System.out.println(inputFile.toString());

        OutputFile outputFile = new OutputFile(inputFile.getStudentList());
        outputFile.setPathExcel("data/student1.xls");
        outputFile.outputExcel(outputFile.getPathExcel());
    }
}
