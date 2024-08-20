package page.TuyenSinh.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import page.TuyenSinh.UI.THCS_UI;

public class THCS_OBJ extends BasePage {
    WebDriver driver;
    THCS_UI uI = new THCS_UI();

    public THCS_OBJ(WebDriver driver) {
        this.driver = driver;
    }
    public void sendFileExcel(){
        waitForElementVisible(driver, uI.NHAPTUEXCEL_BTN);
        sendFile(driver, uI.NHAPTUEXCEL_INPUT, "HoSoDangKyTemplate(10).xlsx");
    }
    public void clickGuiHsMenu(){
        clickToElementXpath(driver, uI.GUIHS_MENU);
    }
    public void clickNhapTuExcel(){
        clickToElementXpath(driver, uI.NHAPTUEXCEL_BTN);
    }
    public void clickChiTietDTS_Tester02(){
        clickToElementXpath(driver, uI.CHITIETDTS_BTN("Clone_1"));
    }
    public void clickGuiHs(){
        clickToElementXpath(driver,uI.GUIHS_BTN);
    }
    public void sendUsername(String value){
        sendKeyToElement(driver, uI.USERNAME_TEXTBOX, value);
    }
    public void sendPassword(String value){
        sendKeyToElement(driver, uI.PASSWORD_TEXTBOX, value);
    }
    public void clickLoginBtn(){
        clickToElementXpath(driver, uI.LOGIN_BTN);
    }
    public void clickVaoUngDung(){
        clickToElementXpath(driver, uI.VAOUNGDUNG_LINK);
    }


}
