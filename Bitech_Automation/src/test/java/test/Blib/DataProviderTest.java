package test.Blib;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class DataProviderTest {
    private AtomicInteger integer = new AtomicInteger(0);

    public static class RetryListener implements IRetryAnalyzer {
        @Override
        public boolean retry(ITestResult iTestResult) {
            return iTestResult.getMethod().getCurrentInvocationCount() < 3;
        }
    }
    @DataProvider (name = "Login_Sheet1")
    public Object[][] getDataFromExcelSheet1() throws IOException {
        String path = System.getProperty("user.dir");
        String file = path + "\\src\\test\\resources\\ExcelUnitData_Login.xlsx";
        String sheet = "Login_Sheet1";
        return ExcelUnits.getArray(file, sheet);
    }
    @DataProvider (name = "Login_Sheet2")
    public Object[][] getDataFromExcelSheet2() throws IOException {
        String path = System.getProperty("user.dir");
        String file = path + "\\src\\test\\resources\\ExcelUnitData_Login.xlsx";
        String sheet = "Login_Sheet2";
        return ExcelUnits.getArray(file, sheet);
    }
    @DataProvider (name = "Login_Sheet3")
    public Object[][] getDataFromExcelSheet3() throws IOException {
        String path = System.getProperty("user.dir");
        String file = path + "\\src\\test\\resources\\ExcelUnitData_Login.xlsx";
        String sheet = "Login_Sheet3";
        return ExcelUnits.getArray(file, sheet);
    }
    @DataProvider (name = "AddHs_Sheet1")
    public Object[][] AddHsSheet1() throws IOException {
        String path = System.getProperty("user.dir");
        String file = path + "\\src\\test\\resources\\ExcelUnitData_Login.xlsx";
        String sheet = "AddHs_Sheet1";
        Object dataInput[][] = ExcelUnits.getArray(file, sheet);
        return dataInput;
    }
    @DataProvider (name = "AddHs_Sheet2")
    public Object[][] AddHsSheet2() throws IOException {
        String path = System.getProperty("user.dir");
        String file = path + "\\src\\test\\resources\\ExcelUnitData_Login.xlsx";
        String sheet = "AddHs_Sheet2";
        Object dataInput[][] = ExcelUnits.getArray(file, sheet);
        return dataInput;
    }
    @DataProvider (name = "AddHs_Sheet3")
    public Object[][] AddHsSheet3() throws IOException {
        String path = System.getProperty("user.dir");
        String file = path + "\\src\\test\\resources\\ExcelUnitData_Login.xlsx";
        String sheet = "AddHs_Sheet3";
        Object dataInput[][] = ExcelUnits.getArray(file, sheet);
        return dataInput;
    }
    @DataProvider (name = "AddHs_Sheet4")
    public Object[][] AddHsSheet4() throws IOException {
        String path = System.getProperty("user.dir");
        String file = path + "\\src\\test\\resources\\ExcelUnitData_Login.xlsx";
        String sheet = "AddHs_Sheet4";
        Object dataInput[][] = ExcelUnits.getArray(file, sheet);
        return dataInput;
    }
    @DataProvider (name = "TS_Login")
    public Object[][] TS_Login() throws IOException {
        String path = System.getProperty("user.dir");
        String file = path + "\\src\\test\\resources\\TS_Login.xlsx";
        String sheet = "Sheet1";
        Object dataInput[][] = ExcelUnits.getArray(file, sheet);
        return dataInput;
    }
    @DataProvider (name = "TS_NhapDiemOffline")
    public Object[][] TS_NhapDiemOffline() throws IOException {
        String path = System.getProperty("user.dir");
        String file = path + "\\src\\test\\resources\\TS_Login.xlsx";
        String sheet = "Sheet2";
        Object dataInput[][] = ExcelUnits.getArray(file, sheet);
        return dataInput;
    }
    @DataProvider (name = "TS_NhapDiemOfflineSheet3")
    public Object[][] TS_NhapDiemOfflineSheet3() throws IOException {
        String path = System.getProperty("user.dir");
        String file = path + "\\src\\test\\resources\\TS_Login.xlsx";
        String sheet = "Sheet3";
        Object dataInput[][] = ExcelUnits.getArray(file, sheet);
        return dataInput;
    }
    @DataProvider (name = "TS_NhapDiemOfflineSheet4")
    public Object[][] TS_NhapDiemOfflineSheet4() throws IOException {
        String path = System.getProperty("user.dir");
        String file = path + "\\src\\test\\resources\\TS_Login.xlsx";
        String sheet = "Sheet4";
        Object dataInput[][] = ExcelUnits.getArray(file, sheet);
        return dataInput;
    }
    @DataProvider (name = "TS_NhapDiemOfflineSheet5")
    public Object[][] TS_NhapDiemOfflineSheet5() throws IOException {
        String path = System.getProperty("user.dir");
        String file = path + "\\src\\test\\resources\\TS_Login.xlsx";
        String sheet = "Sheet5";
        Object dataInput[][] = ExcelUnits.getArray(file, sheet);
        return dataInput;
    }
    @DataProvider (name = "TS_NhapDiemOfflineSheet6")
    public Object[][] TS_NhapDiemOfflineSheet6() throws IOException {
        String path = System.getProperty("user.dir");
        String file = path + "\\src\\test\\resources\\TS_Login.xlsx";
        String sheet = "Sheet6";
        Object dataInput[][] = ExcelUnits.getArray(file, sheet);
        return dataInput;
    }
    @DataProvider (name = "AddNxb_Sheet1")
    public Object[][] AddNxbSheet1() throws IOException {
        String path = System.getProperty("user.dir");
        String file = path + "\\src\\test\\resources\\ExcelUnitData_Login.xlsx";
        String sheet = "AddNxb_Sheet1";
        Object dataInput[][] = ExcelUnits.getArray(file, sheet);
        return dataInput;
    }
}