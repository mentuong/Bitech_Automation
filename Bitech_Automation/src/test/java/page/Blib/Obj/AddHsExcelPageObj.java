package page.Blib.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.AddHsPageUI;

public class AddHsExcelPageObj extends BasePage {
    WebDriver driver;

    public AddHsExcelPageObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyAddHsExcelPage(){
        String expected = "THÊM MỚI HỌC SINH TỪ FILE EXCEL";
        String actual = getElementXpath(driver, AddHsPageUI.TITLE_TEXT_BYXPATH).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach Them Hoc Sinh Tu Excel");
    }

}
