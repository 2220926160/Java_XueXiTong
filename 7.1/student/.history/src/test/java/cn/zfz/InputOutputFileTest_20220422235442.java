package cn.zfz;

import org.junit.Test;

public class InputOutputFileTest {
    @Test
    public void inputOutputExcelText() {
        InputFile inputFile = new InputFile();
        inputFile.InputExcel();
        System.out.println("数据：");
        System.out.println(inputFile.toString());

        OutputFile outputFile = new OutputFile(inputFile.getStudentList());
        outputFile.outputExcel(outputFile.getPathExcel());
    }
}
