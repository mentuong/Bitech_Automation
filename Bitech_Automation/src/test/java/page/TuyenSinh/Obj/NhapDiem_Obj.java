package page.TuyenSinh.Obj;

import core.BasePage;
import org.openqa.selenium.*;
import page.TuyenSinh.UI.NhapDiem_UI;

import java.util.List;

public class NhapDiem_Obj extends BasePage {
    WebDriver driver;
    NhapDiem_UI nhapDiemUi = new NhapDiem_UI();

    public NhapDiem_Obj(WebDriver driver) {
        this.driver = driver;
    }

    public String randomDiem() {
        String a;
        a = randomizeNumeric(3);
        return a;
    }
    public List<WebElement> inputGvNhapDiem(){
        return driver.findElements(By.xpath(nhapDiemUi.INPUTDIEM_TEXTBOX));
    }
    public String[] listDiemNhapLan1(){
        List<WebElement> list = inputGvNhapDiem();
        String[] diems = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            diems[i] = String.valueOf(Math.random()*999);
        }
        return diems;
    }
    public String[] nhapDiemRandomlan1() {
        String diem;
        List<WebElement> list = inputGvNhapDiem();
        String[] diems = new String[list.size()];
        diems[0] = "0";
        waitForElementVisible(driver, nhapDiemUi.INPUTDIEM_TEXTBOX + "[1]");
        for (int i = 1; i < list.size(); i++) {
            diem = randomDiem();
            list.get(i).clear();
            list.get(i).sendKeys(diem);
            diems[i] = diem;
        }
        return diems;
    }
    public void nhapDiemLan2(String[] diems ) {
        String diem;
        List<WebElement> list = inputGvNhapDiem();
        diems[0] = "0";
        waitForElementVisible(driver, nhapDiemUi.INPUTDIEM_TEXTBOX + "[1]");
        for (int i = 1; i < list.size(); i++) {
            diem = diems[i];
            list.get(i).clear();
            list.get(i).sendKeys(diem);
            diems[i] = diem;
        }
    }
    public void nhapDiemTheoThuTu() {
        List<WebElement> list = inputGvNhapDiem();
        waitForElementVisible(driver, nhapDiemUi.INPUTDIEM_TEXTBOX + "[2]");
        int diem = 0;
        for (int i = 1; i < list.size(); i++) {
            list.get(i).clear();
            String nhap = String.valueOf(diem);
            list.get(i).sendKeys(nhap);
            diem = diem + 25;
        }

    }
    public void nhapDiemDung(String[] diems){
        List<WebElement> list = inputGvNhapDiem();
        waitForElementVisible(driver, nhapDiemUi.INPUTDIEM_TEXTBOX + "[2]");
        String diem;
        for (int i = 1; i < diems.length; i++) {
            diem = diems[i];
            list.get(i).clear();
            list.get(i).sendKeys(diem);
        }
    }
    public void clickLuu(){
        clickToElementXpath(driver, nhapDiemUi.GVLUU_BTN);
    }
    public void nhapPhach6so(String value){
        sendKeyToElement(driver, nhapDiemUi.INPUTDIEM_TEXTBOX, value);
    }
    public void clickGvSeacrhBtn(){
        clickToElementXpath(driver, nhapDiemUi.GVSEACRH_BTN);
    }
    public void clickDTSNam2023(){
        clickToElementXpath(driver, nhapDiemUi.GVDTSNAM_OPTION);
    }
    public void sendKeyTenGvNhapDiem(String value){
        sendKeyToElement(driver, nhapDiemUi.TENGVNHAPDIEM_INPUT, value);
    }
    public void sendKeyMatKhauGvNhapDiem(String value){
        sendKeyToElement(driver, nhapDiemUi.MATKHAUGVNHAPDIEM_INPUT, value);
    }
    public void clickGvDangNhap(){
        clickToElementXpath(driver, nhapDiemUi.GVDANGNHAP_BTN);
    }
    public void adminNhapUsername(String value){
        sendKeyToElement(driver, nhapDiemUi.ADMIN_USERNAME, value);
    }
    public void adminNhapPassword(String value){
        sendKeyToElement(driver, nhapDiemUi.ADMIN_PASSWORD, value);
    }
    public void adminClickDangNhap(){
        clickToElementXpath(driver, nhapDiemUi.ADMIN_LOGINBTN);
    }
    public void adminClickBaiThi(){
        clickToElementXpath(driver, nhapDiemUi.ADMIN_BAITHI_BTN);
    }
    public void adminClickChonMonThi01(){
        clickToElementXpath(driver, nhapDiemUi.ADMIN_MONTHI_01_OPTION);
    }
    public void adminClickChonMonThi02(){
        clickToElementXpath(driver, nhapDiemUi.ADMIN_MONTHI_02_OPTION);
    }
    public void adminClickChonMonThi03(){
        clickToElementXpath(driver, nhapDiemUi.ADMIN_MONTHI_03_OPTION);
    }
    public void adminClickChonMonThi04(){
        clickToElementXpath(driver, nhapDiemUi.ADMIN_MONTHI_04_OPTION);
    }
    public void adminClickChonMonThi05(){
        clickToElementXpath(driver, nhapDiemUi.ADMIN_MONTHI_05_OPTION);
    }
    public void adminClickChonMonThi06(){
        clickToElementXpath(driver, nhapDiemUi.ADMIN_MONTHI_06_OPTION);
    }
    public void adminClickChonMonThi07(){
        clickToElementXpath(driver, nhapDiemUi.ADMIN_MONTHI_07_OPTION);
    }
    public void adminClickChonMonThi08(){
        clickToElementXpath(driver, nhapDiemUi.ADMIN_MONTHI_08_OPTION);
    }
    public void adminClickChonMonThi09(){
        clickToElementXpath(driver, nhapDiemUi.ADMIN_MONTHI_09_OPTION);
    }
    public void adminClickChonMonThi10(){
        clickToElementXpath(driver, nhapDiemUi.ADMIN_MONTHI_10_OPTION);
    }
    public void adminClickChonMonThi11(){
        clickToElementXpath(driver, nhapDiemUi.ADMIN_MONTHI_11_OPTION);
    }
    public void adminClickChonMonThi12(){
        clickToElementXpath(driver, nhapDiemUi.ADMIN_MONTHI_12_OPTION);
    }
    public List<WebElement> inputAdminNhapDiem(){
        return driver.findElements(By.xpath(nhapDiemUi.ADMIN_LISTINPUTDIEMMONTHI));
    }
    public void nhapDiemDoiSoat() throws InterruptedException {
        waitForElementVisible(driver, nhapDiemUi.ADMIN_LISTINPUTDIEMMONTHI);
        List<WebElement> list = inputAdminNhapDiem();
        int i = 0;
        int j = 1;
        while (j < list.size()){
            String diem1 = list.get(i).getAttribute("value");
            String diem2 = list.get(j).getAttribute("value");
            while (diem1.compareToIgnoreCase(diem2) != 0){
//                ((JavascriptExecutor) driver).executeScript(
//                        "arguments[0].removeAttribute('style')", list.get(j));
//                list.get(j).sendKeys(diem1);
                list.get(j).sendKeys(Keys.BACK_SPACE);
                list.get(j).sendKeys(Keys.BACK_SPACE);
                list.get(j).sendKeys(Keys.BACK_SPACE);
                list.get(j).clear();
                list.get(j).sendKeys(diem1);
                diem2 = list.get(j).getAttribute("value");
            }
            i = i + 2;
            j = i + 1;
        }
    }
    public void adminClickLuuNhapDiem(){
        clickToElementXpath(driver, nhapDiemUi.ADMIN_LUUNHAPDIEM_BTN);
    }


}
