package page.Blib.Obj;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListNoiXuatBanUI;
import page.Blib.UI.ListPhanLoai19DayUI;

import static core.BasePage.getElementXpath;

public class ListPhanLoai19DayObj {
    WebDriver driver;

    public ListPhanLoai19DayObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListPhanLoai19DayPage(){
        String expected = "DANH SÁCH PHÂN LOẠI 19 DÃY";
        String actual = getElementXpath(driver, ListPhanLoai19DayUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach Phan Loai 19 Day");
    }
}
