package seleniumdemo.excelreader;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class ExcelReader {
    private final static String LOGIN_INFO = "src/resources/excel/LoginInfo.xlsx";

    public HashMap<String, String> readLoginInfo(FileInputStream fileInputStream) throws IOException, InvalidFormatException {
        fileInputStream = new FileInputStream(new File(LOGIN_INFO));
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);
        HashMap<String, String> rowData = new HashMap<>();

        if ((sheet.getRow(0).getCell(0).toString().equals("Login")) && (sheet.getRow(0).getCell(1).toString().equals("Password"))) {
            String login = sheet.getRow(1).getCell(0).toString();
            String password = sheet.getRow(1).getCell(1).toString();
            rowData.put(login, password);
        }
        return rowData;
    }
}