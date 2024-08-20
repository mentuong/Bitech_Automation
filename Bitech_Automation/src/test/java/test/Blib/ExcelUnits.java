package test.Blib;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUnits {
    private static XSSFWorkbook excelWBook;
    private static XSSFSheet excelSheet;
    private static XSSFRow excelRow;
    private static XSSFCell excelCell;

    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir");
        String file = path + "\\src\\test\\resources\\ExcelUnitData_Login.xlsx";
        FileInputStream excelFile = new FileInputStream(file);
        excelWBook = new XSSFWorkbook(excelFile);
        excelSheet = excelWBook.getSheet("Login_Sheet1");
    }

    public static String getCell(int row, int col) {
        excelCell = excelSheet.getRow(row).getCell(col);
        String cellData = excelCell.getStringCellValue();
        return cellData;
    }

    public static Object[][] getArray(String filePath, String sheetName) throws IOException {
        FileInputStream excelFile = new FileInputStream(filePath);
        excelWBook = new XSSFWorkbook(excelFile);
        excelSheet = excelWBook.getSheet(sheetName);
        int totalRow = excelSheet.getLastRowNum();
        int totalCol = excelSheet.getRow(1).getLastCellNum() - 1;
        String[][] tableArray = new String[totalRow][totalCol];
        int startRow = 1;
        int startCol = 1;
        int i, j, ci, cj;
        for (i = startRow; i <= totalRow; i++) {
            ci = i - 1;
            for (j = startCol; j <= totalCol; j++) {
                cj = j - 1;
                tableArray[ci][cj] = getCell(i, j);
            }
        }
        return tableArray;
    }
}

