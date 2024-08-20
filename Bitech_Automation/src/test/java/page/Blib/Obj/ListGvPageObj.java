package page.Blib.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListGvPageUI;
import page.Blib.UI.ListHsPageUI;

public class ListGvPageObj extends BasePage {
    WebDriver driver;

    public ListGvPageObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListGvPage(){
        String expected = "DANH SÁCH GIÁO VIÊN";
        String actual = getElementXpath(driver, ListGvPageUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach Giao vien");
    }
}
