package cn.zfz;

import org.junit.Test;

public class InputFileTest {
    @Test
    public void inputExcelText() {
        InputFile inputFile = new InputFile();
        inputFile.InputExcel();
        System.out.println(inputFile.toString());
    }
}
