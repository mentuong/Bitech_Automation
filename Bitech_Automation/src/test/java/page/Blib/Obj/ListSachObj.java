package page.Blib.Obj;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListBstUI;
import page.Blib.UI.ListSachUI;

import static core.BasePage.getElementXpath;

public class ListSachObj {
    WebDriver driver;

    public ListSachObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListSachPage(){
        String expected = "DANH SÁCH ẤN PHẨM";
        String actual = getElementXpath(driver, ListSachUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach An Pham");
    }
}
