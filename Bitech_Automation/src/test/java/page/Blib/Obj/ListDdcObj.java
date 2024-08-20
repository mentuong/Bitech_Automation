package page.Blib.Obj;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListChuDiemUI;
import page.Blib.UI.ListDdcUI;

import static core.BasePage.getElementXpath;

public class ListDdcObj {
    WebDriver driver;

    public ListDdcObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListDdcPage(){
        String expected = "DANH SÁCH DDC";
        String actual = getElementXpath(driver, ListDdcUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach DDC");
    }
}
