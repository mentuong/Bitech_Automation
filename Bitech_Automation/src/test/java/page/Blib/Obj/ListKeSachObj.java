package page.Blib.Obj;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListDdcUI;
import page.Blib.UI.ListKeSachUI;

import static core.BasePage.getElementXpath;

public class ListKeSachObj {
    WebDriver driver;

    public ListKeSachObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListKeSachPage(){
        String expected = "DANH SÁCH KỆ SÁCH";
        String actual = getElementXpath(driver, ListKeSachUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach Ke Sach");
    }
}
