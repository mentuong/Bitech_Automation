package page.Blib.Obj;

import core.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import page.Blib.UI.AddHsPageUI;

import java.util.ArrayList;
import java.util.List;

public class AddHsPageObj extends BasePage {
    WebDriver driver;

    public AddHsPageObj(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyAddHsPage() {
        String expected = "THÊM MỚI HỌC SINH";
        String actual = getElementXpath(driver, AddHsPageUI.TITLE_TEXT_BYXPATH).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach Them Moi Hoc Sinh");
    }

    public String getTitleTenHs() {
        return getElementXpath(driver, AddHsPageUI.TENHS_TITLE).getText();
    }

    public String getTextPlaceholderTenHs() {
        return getElementXpath(driver, AddHsPageUI.TENHS_TEXTBOX).getAttribute("placeholder");
    }

    public String getTitleMaHs() {
        return getElementXpath(driver, AddHsPageUI.MAHS_TITLE).getText();
    }

    public String getTextPlaceholderMaHs() {
        return getElementXpath(driver, AddHsPageUI.MAHS_TEXTBOX).getAttribute("placeholder");
    }

    public String getTitleLopHocHs() {
        return getElementXpath(driver, AddHsPageUI.LOPHOC_TITLE).getText();
    }

    public String getTextPlaceholderLopHocHs() {
        return getElementXpath(driver, AddHsPageUI.LOPHOC_TEXTBOX).getAttribute("placeholder");
    }

    public String getTitleDiaChiHs() {
        return getElementXpath(driver, AddHsPageUI.DIACHI_TITLE).getText();
    }

    public String getTextPlaceholderDiaChiHs() {
        return getElementXpath(driver, AddHsPageUI.DIACHI_TEXTBOX).getAttribute("placeholder");
    }

    public String getTitleThoiHanTheHs() {
        return getElementXpath(driver, AddHsPageUI.THOIHANTHE_TITLE).getText();
    }

    public String getTextPlaceholderThoiHanTheHs() {
        return getElementXpath(driver, AddHsPageUI.THOIHANTHE_DATETIME_BYXPATH).getAttribute("placeholder");
    }

    public String getTitleNgaySinhHs() {
        return getElementXpath(driver, AddHsPageUI.NGAYSINH_TITLE).getText();
    }

    public String getTextPlaceholderNgaySinhHs() {
        return getElementXpath(driver, AddHsPageUI.NGAYSINH_DATETIME_BYXPATH).getAttribute("placeholder");
    }

    public String getTitleGioiTinhHs() {
        return getElementXpath(driver, AddHsPageUI.GIOITINH_TITLE).getText();
    }

    public String getTextPlaceholderGioiTinhHs() {
        return getElementXpath(driver, AddHsPageUI.GIOITINH_BOX).getText();
    }

    public String getTitleNamHocHs() {
        return getElementXpath(driver, AddHsPageUI.NAMHOC_TITLE).getText();
    }

    public String getTextPlaceholderNamHocHs() {
        return getElementXpath(driver, AddHsPageUI.NAMHOC_BOX).getText();
    }

    public String getTitleSdtHs() {
        return getElementXpath(driver, AddHsPageUI.SDT_TITLE).getText();
    }

    public String getTextPlaceholderSdtHs() {
        return getElementXpath(driver, AddHsPageUI.SDT_TEXTBOX).getAttribute("placeholder");
    }

    public String getTextAvatar() {
        WebElement element = getElementXpath(driver, AddHsPageUI.AVATAR_TEXT_BYXPATH);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
        return element.getText();
    }

    public String getFileSourceAvatar() {
        WebElement srcName = getElementXpath(driver, AddHsPageUI.AVATARSRC_TEXT);
        return srcName.getAttribute("src");

    }

    public void sendAvatarFileJPG() {
        sendFile(driver, AddHsPageUI.AVATAR_INPUT, AddHsPageUI.JPGFILEINPUT_RESOURCES);
    }

    public void sendAvatarFilePNG() {
        sendFile(driver, AddHsPageUI.AVATAR_INPUT, AddHsPageUI.PNGFILEINPUT_RESOURCES);
    }

    public void sendTenHs(String value) {
        waitForElementVisible(driver, AddHsPageUI.TENHS_TEXTBOX);
        sendKeyWithSpaceToElement(driver, AddHsPageUI.TENHS_TEXTBOX, value);
    }

    public void sendKeyTextbox(String locator, String value) {
        sendKeyToElement(driver, locator, value);
    }

    public void sendTenHsNoSpace(String value) {
        waitForElementVisible(driver, AddHsPageUI.TENHS_TEXTBOX);
        sendKeyWithNoSpaceToElement(driver, AddHsPageUI.TENHS_TEXTBOX, value);
    }

    public void sendMaHs(String value) {
        sendKeyWithNoSpaceToElement(driver, AddHsPageUI.MAHS_TEXTBOX, value);
    }

    public void sendMaHsSpace(String value) {
        sendKeyWithSpaceToElement(driver, AddHsPageUI.MAHS_TEXTBOX, value);
    }

    public void sendNgaySinh(String value) {
        sendKeyNgaySinh(driver, AddHsPageUI.NGAYSINH_DATETIME_BYXPATH, value);
    }

    public void sendThoiHanThe(String value) {
        sendKeyNgayTuongLai(driver, AddHsPageUI.THOIHANTHE_DATETIME_BYXPATH, value);
    }

    public void sendLopHoc(String value) {
        sendKeyWithSpaceToElement(driver, AddHsPageUI.LOPHOC_TEXTBOX, value);
    }

    public void sendLopHocNoSpace(String value) {
        sendKeyWithNoSpaceToElement(driver, AddHsPageUI.LOPHOC_TEXTBOX, value);
    }

    public void selectNamHoc(String value) {
        selectOptionList(driver, AddHsPageUI.NAMHOC_OPTION, value);
    }

    public void selectGioiTinh(String value) {
        waitForElementVisible(driver, AddHsPageUI.GIOITINH_BOX);
        selectOptionList(driver, AddHsPageUI.GIOITINH_OPTION, value);
    }

    public void sendDiaChi(String value) {
        sendKeyWithSpaceToElement(driver, AddHsPageUI.DIACHI_TEXTBOX, value);
    }

    public void sendDiaChiNoSpace(String value) {
        sendKeyWithNoSpaceToElement(driver, AddHsPageUI.DIACHI_TEXTBOX, value);
    }

    public void sendSDT(String value) {
        sendKeyPhoneNo(driver, AddHsPageUI.SDT_TEXTBOX, value);
    }

    public void sendHsInformations(String ten, String maHs, String ngaySinh, String gioiTinh, String lopHoc,
                                   String namHoc, String diaChi, String sDT, String thoiHan) {
        sendTenHs(ten);
        selectGioiTinh(gioiTinh);
        sendNgaySinh(ngaySinh);
        sendLopHoc(lopHoc);
        sendThoiHanThe(thoiHan);
        selectNamHoc(namHoc);
        sendDiaChi(diaChi);
        sendSDT(sDT);
        clickBtnAdd();
    }

    public void sendHsInformationsNoSpace(String ten, String maHs, String ngaySinh, String gioiTinh, String lopHoc,
                                          String namHoc, String diaChi, String sDT, String thoiHan) {
        sendTenHsNoSpace(ten);
        selectGioiTinh(gioiTinh);
        sendNgaySinh(ngaySinh);
        sendMaHs(maHs);
        sendLopHocNoSpace(lopHoc);
        sendThoiHanThe(thoiHan);
        selectNamHoc(namHoc);
        sendDiaChiNoSpace(diaChi);
        sendSDT(sDT);
        clickBtnAdd();
    }

    public void sendHsInformationsNoSpaceNoConfirm(String ten, String maHs, String ngaySinh, String gioiTinh, String lopHoc,
                                                   String namHoc, String diaChi, String sDT, String thoiHan) {
        sendTenHsNoSpace(ten);
        selectGioiTinh(gioiTinh);
        sendNgaySinh(ngaySinh);
        sendMaHs(maHs);
        sendLopHocNoSpace(lopHoc);
        sendThoiHanThe(thoiHan);
        selectNamHoc(namHoc);
        sendDiaChiNoSpace(diaChi);
        sendSDT(sDT);
    }

    public void sendHsInformationsNoConfirm(String ten, String maHs, String ngaySinh, String gioiTinh, String lopHoc,
                                            String namHoc, String diaChi, String sDT, String thoiHan) {
        sendTenHs(ten);
        sendMaHs(maHs);
        selectGioiTinh(gioiTinh);
        sendNgaySinh(ngaySinh);
        sendLopHoc(lopHoc);
        sendThoiHanThe(thoiHan);
        selectNamHoc(namHoc);
        sendDiaChi(diaChi);
        sendSDT(sDT);
    }

    public void clickBtnAdd() {
        clickToElementXpath(driver, AddHsPageUI.THEMMOI_BTN);
    }

    public void clickBtnBack() {
        clickToElementXpath(driver, AddHsPageUI.QUAYVE_BTN);
    }

    public void clickNgaySinhBox() {
        clickToElementXpath(driver, AddHsPageUI.NGAYSINH_DATETIME_BYXPATH);
    }

    public void clickThoiHanTheBox() {
        clickToElementXpath(driver, AddHsPageUI.THOIHANTHE_DATETIME_BYXPATH);
    }

    public void waitForAddHsPage() {
        waitForElementVisible(driver, AddHsPageUI.TITLE_TEXT_BYXPATH);
    }

    public String getDangerTextTenHs() {
        String message = "";
        if (getElementXpath(driver, AddHsPageUI.TENHS_MESSAGE_TEXT).isDisplayed()) {
            message = getElementXpath(driver, AddHsPageUI.TENHS_MESSAGE_TEXT).getText();
        }
        return message;
    }

    public String getDangerTextMaHs() {
        String message = "";
        if (getElementXpath(driver, AddHsPageUI.MAHS_MESSAGE_TEXT).isDisplayed()) {
            message = getElementXpath(driver, AddHsPageUI.MAHS_MESSAGE_TEXT).getText();
        }
        return message;
    }

    public String getDangerTextLopHocHs() {
        String message = "";

        if (getElementXpath(driver, AddHsPageUI.LOPHS_MESSAGE_TEXT).isDisplayed()) {
            message = getElementXpath(driver, AddHsPageUI.LOPHS_MESSAGE_TEXT).getText();
        }
        return message;
    }

    public String getDangerTextThoiHanHs() {
        String message = "";

        if (getElementXpath(driver, AddHsPageUI.THOIHAN_MESSAGE_TEXT).isDisplayed()) {
            message = getElementXpath(driver, AddHsPageUI.THOIHAN_MESSAGE_TEXT).getText();
        }
        return message;
    }

    public String getDangerTextNgaySinhHs() {
        String message = "";

        if (getElementXpath(driver, AddHsPageUI.NGAYSINH_MESSAGE_TEXT).isDisplayed()) {
            message = getElementXpath(driver, AddHsPageUI.NGAYSINH_MESSAGE_TEXT).getText();
        }
        return message;
    }

    public String getDangerTextGioiTinhHs() {
        String message = "";

        if (getElementXpath(driver, AddHsPageUI.GIOITINH_MESSAGE_TEXT).isDisplayed()) {
            message = getElementXpath(driver, AddHsPageUI.GIOITINH_MESSAGE_TEXT).getText();
        }
        return message;
    }

    public String getDangerTextNamHocHs() {
        String message = "";

        if (getElementXpath(driver, AddHsPageUI.NAMHOC_MESSAGE_TEXT).isDisplayed()) {
            message = getElementXpath(driver, AddHsPageUI.NAMHOC_MESSAGE_TEXT).getText();
        }
        return message;
    }

    public String getDangerTextSdtHs() {
        String message = "";

        if (getElementXpath(driver, AddHsPageUI.SDT_MESSAGE_TEXT).isDisplayed()) {
            message = getElementXpath(driver, AddHsPageUI.SDT_MESSAGE_TEXT).getText();
        }
        return message;
    }


    public void assertDangerMessageAddHs(String message) {
        List<WebElement> list = driver.findElements(By.xpath("//p"));
        int i = 0;
        String actualText = "";
        String text = "";
        while (i < list.size()) {
            actualText = list.get(i).getText();
            if (actualText.equals(message)) {
                text = actualText;
            }
            i++;
        }
        Assert.assertEquals(text, message, actualText);
        System.out.println(text);
    }

//    public String presentDay() {
//        LocalDate startDate = LocalDate.now();
//        long start = startDate.toEpochDay();
//        return LocalDate.ofEpochDay(start).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//    }
//
//    public String presentDayTitle() {
//        LocalDate startDate = LocalDate.now();
//        long start = startDate.toEpochDay();
//        return LocalDate.ofEpochDay(start).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//    }
//
//    public String passDay() {
//        LocalDate startDate = LocalDate.now();
//        long start = startDate.toEpochDay() - 1;
//        return LocalDate.ofEpochDay(start).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//    }
//
//    public String futureDay() {
//        LocalDate startDate = LocalDate.now();
//        long start = startDate.toEpochDay() + 1;
//        return LocalDate.ofEpochDay(start).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//    }
//
//    public String passDayTitle() {
//        LocalDate startDate = LocalDate.now();
//        long start = startDate.toEpochDay() - 1;
//        return LocalDate.ofEpochDay(start).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//    }
//
//    public String futureDayTitle() {
//        LocalDate startDate = LocalDate.now();
//        long start = startDate.toEpochDay() + 1;
//        return LocalDate.ofEpochDay(start).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//    }

    public void verifyNgaySinhBox() {
        clickNgaySinhBox();
        WebElement todays = driver.findElement(By.xpath("//td[@title='" + presentDayTitle()
                + "' and @class='ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today']"));
        WebElement passDays = driver.findElement(By.xpath("//td[@title='" + passDayTitle()
                + "' and @class='ant-picker-cell ant-picker-cell-in-view']"));
        WebElement futureDays = driver.findElement(By.xpath("//td[@title='" + futureDayTitle()
                + "' and @class='ant-picker-cell ant-picker-cell-disabled ant-picker-cell-in-view']"));

        String passClass = passDays.getAttribute("class");
        String present = todays.getAttribute("class");
        String futureClass = futureDays.getAttribute("class");
        todays.click();
        Assert.assertEquals(passClass, "ant-picker-cell ant-picker-cell-in-view", passClass);
        Assert.assertEquals(present, "ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today", present);
        Assert.assertEquals(futureClass, "ant-picker-cell ant-picker-cell-disabled ant-picker-cell-in-view", futureClass);
    }

    public void verifyThoiHanTheBox() {

        sendThoiHanThe(presentDay());
//        WebElement todays = driver.findElement(By.xpath("//td[@title='" + presentDayTitle()
//                + "' and @class='ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today']']"));
        WebElement passDays = driver.findElement(By.xpath("//td[@title='" + passDayTitle()
                + "' and @class='ant-picker-cell ant-picker-cell-disabled ant-picker-cell-in-view']"));
        WebElement futureDays = driver.findElement(By.xpath("//td[@title='" + futureDayTitle()
                + "' and @class='ant-picker-cell ant-picker-cell-in-view']"));

        String passClass = passDays.getAttribute("class");
//        String present = todays.getAttribute("class");
        String futureClass = futureDays.getAttribute("class");
        Assert.assertEquals(passClass, "ant-picker-cell ant-picker-cell-disabled ant-picker-cell-in-view", passClass);
//        Assert.assertEquals(present, "ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today ant-picker-cell-selected", present);
        Assert.assertEquals(futureClass, "ant-picker-cell ant-picker-cell-in-view", futureClass);
//    }
//    public void verifyDayBoxNgaySinh() {
//        List<WebElement> todays = driver.findElements(By.xpath("//td[@title='" + presentDayTitle() + "']"));
//        List<WebElement> passDays = driver.findElements(By.xpath("//td[@title='" + passDayTitle() + "']"));
//        List<WebElement> futureDays = driver.findElements(By.xpath("//td[@title='" + futureDayTitle() + "']"));

    }

    public void assertToastify(String message) {
        waitForElementVisible(driver, AddHsPageUI.TOASTIFY_BODY);
        String actual = getElementXpath(driver, AddHsPageUI.TOASTIFY_TEXT).getText();
        Assert.assertEquals(actual, message, actual);
    }

    public void waitForToastifyInvisible() {
        waitForElementInvisible(driver, AddHsPageUI.TOASTIFY_BODY);
    }

    public String getValueTenHs() {
        return value(driver, getElementXpath(driver, AddHsPageUI.TENHS_TEXTBOX));
    }

    public String getValueMaHs() {
        return value(driver, getElementXpath(driver, AddHsPageUI.MAHS_TEXTBOX));
    }

    public String getValueLopHoc() {
        return value(driver, getElementXpath(driver, AddHsPageUI.LOPHOC_TEXTBOX));
    }

    public String getValueDiaChi() {
        return value(driver, getElementXpath(driver, AddHsPageUI.DIACHI_TEXTBOX));
    }

    public String getValueSdt() {
        return value(driver, getElementXpath(driver, AddHsPageUI.SDT_TEXTBOX));
    }

    public String getValueThoiHanThe() {
        return value(driver, getElementXpath(driver, AddHsPageUI.THOIHANTHE_DATETIME_BYXPATH));
    }


    public String getValueNgaySinh() {
        return getElementXpath(driver, AddHsPageUI.NGAYSINH_DATETIME_BYXPATH).getText();
    }

    public String getValueGioiTinh() {
        return getElementXpath(driver, AddHsPageUI.GIOITINH_BOX).getText();
    }

    public String getValueNamHoc() {
        return getElementXpath(driver, AddHsPageUI.NAMHOC_BOX).getText();
    }

    public ArrayList<String> getInforAddHs() {
        ArrayList<String> infors = new ArrayList<String>();
        infors.add(0, getValueSdt());
        infors.add(1, getValueTenHs());
        infors.add(2, getValueMaHs());
        infors.add(3, getValueLopHoc());
        infors.add(4, getValueNgaySinh());
        infors.add(5, getValueGioiTinh());
        infors.add(6, getValueNamHoc());
        infors.add(7, getValueDiaChi());
        infors.add(8, getValueThoiHanThe());
        return infors;
    }

    public String randTenHs(int num) {
        return randomizeAlpha(num) + randomizeSpecChar(num);
    }

    public String randMaHs(int num) {
        return randomizeAlpha(num) + randomizeNumeric(num);
    }

    public String randLopHs(int num) {
        return randomizeAlpha(num) + randomizeSpecChar(num) + randomizeNumeric(num);
    }

    public String randDiaChiHs(int num) {
        return randomizeAlpha(num) + randomizeSpecChar(num) + randomizeNumeric(num);
    }


}
