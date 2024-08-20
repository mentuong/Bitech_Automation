package test.Blib;
import org.testng.annotations.*;
import core.BaseTest;
import page.Blib.Obj.DashboardPageObj;
import page.Blib.Obj.ListGvPageObj;
import page.Blib.Obj.ListNhaXuatBanObj;
import page.Blib.Obj.LoginPageObj;

public class Test03_GiaoVien extends BaseTest {
    ListGvPageObj listGv;
    LoginPageObj loginPage;
    DashboardPageObj dashboardPage;
    ListNhaXuatBanObj listNXBObj;
    @BeforeTest
    @Parameters ("browser")
    public void initBrowser(String browser) {
        super.initBrowser(browser);
        loginPage = new LoginPageObj(driver);
    }
    @Parameters ("url")
    @BeforeClass
    @Override
    public void openBrowser(String url) {
        super.openBrowser(url);
        loginPage.waitForTextBox();
        dashboardPage = loginPage.logIn("demotvs@gmail.com", "Oneadmin@123");
        listNXBObj = new ListNhaXuatBanObj(driver);
    }

    @BeforeMethod
    public void beforeMethod(){
        driver.get("https://thuvienso.bitechco.link/NhaXuatBan/Them");
    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }
    @Test (dataProvider = "AddNxb_Sheet1", dataProviderClass = DataProviderTest.class)
    public void ThemNXB(String ten, String ghiChu){
        listNXBObj.nhapTenNXB(ten);
        listNXBObj.nhapGhiChuNXB(ghiChu);
        listNXBObj.clickThemMoi();
    }



}
