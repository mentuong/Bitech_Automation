package page.Blib.Obj;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListTacGiaUI;
import page.Blib.UI.ListThuMucTaiLieuUI;

import static core.BasePage.getElementXpath;

public class ListThuMucTaiLieuObj {
    WebDriver driver;

    public ListThuMucTaiLieuObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListThuMucTaiLieuPage(){
        String expected = "THƯ MỤC TÀI LIỆU";
        String actual = getElementXpath(driver, ListThuMucTaiLieuUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach Thu Muc Tai Lieu");
    }
}
