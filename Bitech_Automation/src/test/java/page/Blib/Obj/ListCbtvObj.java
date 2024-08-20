package page.Blib.Obj;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListBstUI;
import page.Blib.UI.ListCbtvUI;

import static core.BasePage.getElementXpath;

public class ListCbtvObj {
    WebDriver driver;

    public ListCbtvObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyListCbtvPage(){
        String expected = "DANH SÁCH CÁN BỘ THƯ VIỆN";
        String actual = getElementXpath(driver, ListCbtvUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach CBTV");
    }
}
