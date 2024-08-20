package page.Blib.Obj;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListBstUI;
import page.Blib.UI.ListGvPageUI;

import static core.BasePage.getElementXpath;

public class ListBstObj {
    WebDriver driver;

    public ListBstObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListBstPage(){
        String expected = "DANH SÁCH BỘ SƯU TẬP";
        String actual = getElementXpath(driver, ListBstUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach BST");
    }
}
