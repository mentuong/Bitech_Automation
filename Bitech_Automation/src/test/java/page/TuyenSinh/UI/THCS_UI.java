package page.TuyenSinh.UI;

public class THCS_UI {
    public final String NHAPTUEXCEL_INPUT = "//button[text()='Nhập từ Excel']/following-sibling::input[1]";
    public final String NHAPTUEXCEL_BTN = "//button[text()='Nhập từ Excel']";
    public final String GUIHS_MENU = "//span[text()='Gửi danh sách học sinh']";
    public final String CHITIETDTS_BTN (String TenDts){
        return "//div[text()='" + TenDts + "']/following-sibling::div[2]/a";
    }

    public final String GUIHS_BTN = "//button[text()='Gửi']";
    public final String USERNAME_TEXTBOX = "//input[@id='UserName']";
    public final String PASSWORD_TEXTBOX = "//input[@id='myPassword']";
    public final String LOGIN_BTN = "//input[@value='Đăng nhập']";
    public final String VAOUNGDUNG_LINK = "//a[text()='Vào ứng dụng']";
}
