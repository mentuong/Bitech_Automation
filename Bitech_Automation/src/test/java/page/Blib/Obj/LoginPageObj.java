package page.Blib.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.LoginPageUI;

public class LoginPageObj extends BasePage {
    static WebDriver driver;
    DashboardPageObj dashboardPage;

    public LoginPageObj(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickSubmit() {
        clickToElementXpath(driver, LoginPageUI.SUBMIT_BTN_XPATH);
    }

    public void sendKeyUserName(String value) {
        sendKeyWithNoSpaceToElement(driver, LoginPageUI.USERNAME_TEXTBOX_XPATH, value);
    }

    public void sendKeyPassWord(String value) {
        sendKeyWithNoSpaceToElement(driver, LoginPageUI.PASSWORD_TEXTBOX_XPATH, value);
    }

    public void checkRememberLogin() {
        boolean check = isSelectedElement(driver, LoginPageUI.REMEMBERLOGIN_CHECKBOX_XPATH);
        if (check == false) {
            clickToElementXpath(driver, LoginPageUI.REMEMBERLOGIN_CHECKBOX_XPATH);
        }
    }

    public void uncheckRememberLogin() {
        boolean check = isSelectedElement(driver, LoginPageUI.REMEMBERLOGIN_CHECKBOX_XPATH);
        if (check == true) {
            clickToElementXpath(driver, LoginPageUI.REMEMBERLOGIN_CHECKBOX_XPATH);
        }
    }

    public void clickToLinkResetPassWord() {
        clickToElementXpath(driver, LoginPageUI.RESETPASSWORD_LINK_XPATH);
    }

    public DashboardPageObj logIn(String username, String password) {
        waitForTextBox();
        sendKeyWithNoSpaceToElement(driver, LoginPageUI.USERNAME_TEXTBOX_XPATH, username);
        sendKeyWithNoSpaceToElement(driver, LoginPageUI.PASSWORD_TEXTBOX_XPATH, password);
        clickSubmit();
        dashboardPage = new DashboardPageObj(driver);
        return dashboardPage;
    }

    public String getTextDangerMessage() {
        return getElementXpath(driver, LoginPageUI.DANGER_MESSAGE_XPATH).getText();
    }

    public String getTextDangerMessage2() {
        return getElementXpath(driver, LoginPageUI.DANGER_MESSAGE2_XPATH).getText();
    }

    public void verifyLoginPage() {
        String actualTitle = getTitle(driver);
        Assert.assertEquals(actualTitle, "Trang chủ - Thư viện số", "TitleWindowHandle chưa đúng");
    }

    public void assertTextDanger1(String message) {
        String actual = getElementXpath(driver, LoginPageUI.DANGER_MESSAGE_XPATH).getText();
        Assert.assertEquals(actual, message, "Danger Message 1 chưa đúng");
    }

    public void assertTextDanger2(String message) {
        String actual = getElementXpath(driver, LoginPageUI.DANGER_MESSAGE2_XPATH).getText();
        Assert.assertEquals(actual, message, "Danger Message 2 chưa đúng");
    }
    public void waitForTextBox(){
        waitForElementVisible(driver, LoginPageUI.USERNAME_TEXTBOX_XPATH);
    }

}
