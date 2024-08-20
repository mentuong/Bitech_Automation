package test.Blib;

import core.BaseTest;
import org.testng.annotations.*;
import page.Blib.Obj.DashboardPageObj;
import page.Blib.Obj.LoginPageObj;

public class test01Login extends BaseTest {
    LoginPageObj loginPage;
    DashboardPageObj dashboardPage;

    @Parameters ("browser")
    @BeforeTest
    @Override
    public void initBrowser(String browser) {
        super.initBrowser(browser);
        loginPage = new LoginPageObj(driver);
    }

    @Parameters ("url")
    @BeforeClass
    @Override
    public void openBrowser(String url) {
        super.openBrowser(url);
    }
    @Parameters ("url")
    @BeforeMethod
    public void beforeMethod(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(1500);
    }
    @AfterMethod
    public void aftermethod(){}
    @AfterClass
    public void quitBrowser() {
        driver.close();
    }
    @AfterTest
    public void afterTest(){}

//    @Test (dataProvider = "Login_Sheet1", dataProviderClass = DataProviderTest.class, retryAnalyzer = DataProviderTest.RetryListener.class)
//    public void loginSuccess_TC01(String username, String password) throws InterruptedException {
//        loginPage.waitForTextBox();
//        Thread.sleep(2000);
//        dashboardPage = loginPage.logIn(username, password);
//        dashboardPage.verifyDashboardPage();
//    }

    @Test (priority = 1, dataProvider = "Login_Sheet2", dataProviderClass = DataProviderTest.class, retryAnalyzer = DataProviderTest.RetryListener.class)
    public void loginFail1Message_TC02(String username, String password, String message, String message2) {
        loginPage.logIn(username, password);
        loginPage.assertTextDanger1(message);
    }

    @Test (priority = 2, dataProvider = "Login_Sheet3", dataProviderClass = DataProviderTest.class, retryAnalyzer = DataProviderTest.RetryListener.class)
    public void loginFail2Message_TC03(String username, String password, String message1, String message2) {
        loginPage.logIn(username, password);
        loginPage.assertTextDanger1(message1);
        loginPage.assertTextDanger2(message2);
    }


}
