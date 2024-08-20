package page.Blib.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListNguonCcUI;
import page.Blib.UI.ListNhaXuatBanUI;

import static core.BasePage.getElementXpath;

public class ListNhaXuatBanObj extends BasePage {
    WebDriver driver;
    ListNhaXuatBanUI listNXB;

    public ListNhaXuatBanObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListNxbPage(){
        String expected = "DANH SÁCH NHÀ XUẤT BẢN";
        String actual = getElementXpath(driver, ListNhaXuatBanUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach NXB");
    }
    public void nhapTenNXB(String value){
        sendKeyToElement(driver, listNXB.TENNXB_TEXTBOX, value);
    }
    public void nhapGhiChuNXB(String value){
        sendKeyWithSpaceToElement(driver, listNXB.GHICHU_TEXTBOX, value);
    }
    public void clickThemMoi(){
        clickToElementXpath(driver, listNXB.THEMMOI_BTN);
    }
}
