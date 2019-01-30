package seleniumdemo;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import seleniumdemo.excelreader.ExcelReader;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        ExcelReader excelReader = new ExcelReader();
        System.out.println(excelReader.readLoginInfo(new File("src/resources/excel/LoginInfo.xlsx")));
    }
}
