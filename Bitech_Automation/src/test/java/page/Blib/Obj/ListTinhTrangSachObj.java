package page.Blib.Obj;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListTacGiaUI;
import page.Blib.UI.ListTinhTrangSachUI;

import static core.BasePage.getElementXpath;

public class ListTinhTrangSachObj {
    WebDriver driver;

    public ListTinhTrangSachObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListTinhTrangSachPage(){
        String expected = "DANH SÁCH TÌNH TRẠNG SÁCH";
        String actual = getElementXpath(driver, ListTinhTrangSachUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach Tinh Trang Sach");
    }
}
