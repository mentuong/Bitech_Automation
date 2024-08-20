package page.Blib.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.AddHsPageUI;
import page.Blib.UI.UpdateAvatarPageUI;

public class UpdateAvatarPageObj extends BasePage {
    WebDriver driver;

    public UpdateAvatarPageObj(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyUpdateAvatarPage(){
        String expected = "CẬP NHẬT ẢNH ĐẠI DIỆN CHO HỌC SINH";
        String actual = getElementXpath(driver, UpdateAvatarPageUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach Cap Nhat Anh Dai Dien Hoc Sinh");
    }
}
