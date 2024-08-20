package page.Blib.Obj;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListNhaXuatBanUI;
import page.Blib.UI.ListNoiXuatBanUI;

import static core.BasePage.getElementXpath;

public class ListNoiXuatBanObj {
    WebDriver driver;

    public ListNoiXuatBanObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListNoiXbPage(){
        String expected = "DANH SÁCH NƠI XUẤT BẢN";
        String actual = getElementXpath(driver, ListNoiXuatBanUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach Noi Xuat Ban");
    }
}
