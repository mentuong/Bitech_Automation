package page.Blib.Obj;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListNgonNguUI;
import page.Blib.UI.ListNguonCcUI;

import static core.BasePage.getElementXpath;

public class ListNguonCcObj {
    WebDriver driver;

    public ListNguonCcObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListNguonCcPage(){
        String expected = "DANH SÁCH NGUỒN CUNG CẤP";
        String actual = getElementXpath(driver, ListNguonCcUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach Nguon Cung Cap");
    }
}
