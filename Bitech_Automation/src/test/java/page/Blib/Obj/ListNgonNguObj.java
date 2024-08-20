package page.Blib.Obj;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListMonHocUI;
import page.Blib.UI.ListNgonNguUI;

import static core.BasePage.getElementXpath;

public class ListNgonNguObj {
    WebDriver driver;

    public ListNgonNguObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListNgonNguPage(){
        String expected = "DANH SÁCH NGÔN NGỮ";
        String actual = getElementXpath(driver, ListNgonNguUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach Ngon Ngu");
    }
}
