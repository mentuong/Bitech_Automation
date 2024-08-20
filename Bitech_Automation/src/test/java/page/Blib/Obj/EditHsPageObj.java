package page.Blib.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.AddHsPageUI;
import page.Blib.UI.EditHsPageUI;

public class EditHsPageObj extends BasePage {
    WebDriver driver;

    public EditHsPageObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyEditHsPage(){
        String expected = "CẬP NHẬT HỌC SINH";
        String actual = getElementXpath(driver, EditHsPageUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh Cap Nhat Hoc Sinh");
    }
    public void waitForEditHsPage(){
        waitForElementVisible(driver, EditHsPageUI.TITLE_TEXT);
    }
}
