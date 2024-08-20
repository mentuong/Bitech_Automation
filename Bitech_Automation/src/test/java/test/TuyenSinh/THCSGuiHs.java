package test.TuyenSinh;

import core.BaseTest;

import core.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import page.Blib.Obj.DashboardPageObj;
import page.Blib.Obj.LoginPageObj;
import page.TuyenSinh.Obj.THCS_OBJ;
import test.Blib.DataProviderTest;

public class THCSGuiHs extends BaseTest {
    THCS_OBJ thcs_obj;
    @BeforeTest
    @Parameters ("browser")
    public void initBrowser(String browser) {
        super.initBrowser(browser);
        thcs_obj = new THCS_OBJ(driver);
    }
    @Parameters ("url")
    @BeforeClass
    @Override
    public void openBrowser(String url) {
        super.openBrowser(url);
    }

    @BeforeMethod
    public void beforeMethod(){

    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }
    @Test (dataProvider = "TS_Login", dataProviderClass = DataProviderTest.class)
    public void test(String userName, String passWord){
        thcs_obj.sendUsername(userName);
        thcs_obj.sendPassword(passWord);
        thcs_obj.clickLoginBtn();
        thcs_obj.clickVaoUngDung();
        thcs_obj.clickGuiHsMenu();
        thcs_obj.clickChiTietDTS_Tester02();
        thcs_obj.clickNhapTuExcel();
        thcs_obj.sendFileExcel();
        thcs_obj.clickGuiHs();
    }
}
