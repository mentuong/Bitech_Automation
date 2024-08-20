package page.Blib.Obj;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListCbtvUI;
import page.Blib.UI.ListChuDiemUI;

import static core.BasePage.getElementXpath;

public class ListChuDiemObj {
    WebDriver driver;

    public ListChuDiemObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListChuDiemPage(){
        String expected = "DANH SÁCH CHỦ ĐIỂM";
        String actual = getElementXpath(driver, ListChuDiemUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach Chu Diem");
    }
}
