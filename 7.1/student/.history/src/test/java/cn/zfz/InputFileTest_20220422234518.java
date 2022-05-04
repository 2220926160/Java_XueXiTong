package cn.zfz;

import org.junit.Test;

public class InputFileTest {
    @Test
    public void inputExcelText() {
        InputFile inputFile = new InputFile();
        inputFile.InputExcel();
        System.out.println("数据：");
        System.out.println(inputFile.toString());

        OutputFile outputFile = new OutputFile(inputFile.getStudentList());
        outputFile.outputExcel();
    }
}
