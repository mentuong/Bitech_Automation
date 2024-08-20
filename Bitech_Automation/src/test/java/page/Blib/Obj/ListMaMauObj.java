package page.Blib.Obj;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListKeSachUI;
import page.Blib.UI.ListMaMauUI;

import static core.BasePage.getElementXpath;

public class ListMaMauObj {
    WebDriver driver;

    public ListMaMauObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListMaMauPage(){
        String expected = "DANH SÁCH MÃ MÀU";
        String actual = getElementXpath(driver, ListMaMauUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach Ma Mau");
    }
}
