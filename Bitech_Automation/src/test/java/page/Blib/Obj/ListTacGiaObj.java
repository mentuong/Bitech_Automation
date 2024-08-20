package page.Blib.Obj;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListPhanLoai19DayUI;
import page.Blib.UI.ListTacGiaUI;

import static core.BasePage.getElementXpath;

public class ListTacGiaObj {
    WebDriver driver;

    public ListTacGiaObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListTacGiaPage(){
        String expected = "DANH SÁCH TÁC GIẢ";
        String actual = getElementXpath(driver, ListTacGiaUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach Tac Gia");
    }
}
