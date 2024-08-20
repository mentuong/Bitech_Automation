package page.Blib.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.EditHsPageUI;
import page.Blib.UI.ExportCardPageUI;

public class ExportCardPageObj extends BasePage {
    WebDriver driver;

    public ExportCardPageObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyExportCardPage(){
        String expected = "XUẤT THẺ THƯ VIỆN";
        String actual = getElementXpath(driver, ExportCardPageUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh Xuat The Thu Vien");
    }

}
