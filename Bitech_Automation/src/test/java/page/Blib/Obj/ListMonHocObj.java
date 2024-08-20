package page.Blib.Obj;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListMaMauUI;
import page.Blib.UI.ListMonHocUI;

import static core.BasePage.getElementXpath;

public class ListMonHocObj {
    WebDriver driver;

    public ListMonHocObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListMonHocPage(){
        String expected = "DANH SÁCH MÔN HỌC";
        String actual = getElementXpath(driver, ListMonHocUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach Mon Hoc");
    }
}
