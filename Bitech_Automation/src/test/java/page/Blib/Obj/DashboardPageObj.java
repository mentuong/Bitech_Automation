package page.Blib.Obj;

import core.BasePage;
//import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import page.Blib.UI.DashboardPageUI;

public class DashboardPageObj extends BasePage {
    static WebDriver driver;


    ListBstObj listBst;
    ListCbtvObj listCbtv;
    ListChuDiemObj listChuDiem;
    ListDdcObj listDdc;
    ListGvPageObj listGv;
    ListHsPageObj listHs;
    ListKeSachObj listKeSach;
    ListMaMauObj listMaMau;
    ListMonHocObj listMonHoc;
    ListNgonNguObj listNgonNgu;
    ListNguonCcObj listNguonCc;
    ListNhaXuatBanObj listNxb;
    ListNoiXuatBanObj listNoiXb;
    ListPhanLoai19DayObj listPhanLoai19Day;
    ListSachObj listSach;
    ListTacGiaObj listTacGia;
    ListThuMucTaiLieuObj listThuMucTaiLieu;
    ListTinhTrangSachObj listTinhTrangSach;

    public DashboardPageObj(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyDashboardPage() {
        waitForDashBoardLogo();
        String actualTitle = getTitle(driver);
        Assert.assertEquals(actualTitle, "Trang chủ - Thư viện số", "TitleWindowHandle chưa đúng");
        boolean expected = true;
        boolean actual = isDisplayedElement(driver, DashboardPageUI.DASHBOARD_TEXT_XPATH);
        Assert.assertEquals(actual, expected, "Không hiển thị trang Dashboard");
    }
    public void logOut() {
        clickToElementXpath(driver, DashboardPageUI.USERNAMETITLE_IMAGE);
        WebElement e = getElementCss(driver, DashboardPageUI.LOGOUT_LINK);
        e.sendKeys(Keys.ENTER);
    }
    public void waitForDashBoardLogo(){
        waitForElementVisible(driver, DashboardPageUI.DASHBOARD_TEXT_XPATH);
    }
    public void waitForHsMenu(){
        waitForElementVisible(driver, DashboardPageUI.HOCSINH_MENU_XPATH);
    }
    public void waitForGvMenu(){
        waitForElementVisible(driver, DashboardPageUI.GIAOVIEN_MENU_XPATH);
    }
    public void waitForCbtvMenu(){
        waitForElementVisible(driver, DashboardPageUI.CBTV_MENU_XPATH);
    }
    public void waitForMonHocMenu(){
        waitForElementVisible(driver, DashboardPageUI.MONHOC_MENU_XPATH);
    }
    public void waitForChuDiemMenu(){
        waitForElementVisible(driver, DashboardPageUI.CHUDIEM_MENU_XPATH);
    }
    public void waitForBstMenu(){
        waitForElementVisible(driver, DashboardPageUI.BOSUUTAP_MENU_XPATH);
    }
    public void waitForTacGiaMenu(){
        waitForElementVisible(driver, DashboardPageUI.TACGIA_MENU_XPATH);
    }
    public void waitForNxbMenu(){
        waitForElementVisible(driver, DashboardPageUI.NHAXUATBAN_MENU_XPATH);
    }
    public void waitForNoiXbMenu(){
        waitForElementVisible(driver, DashboardPageUI.NOIXUATBAN_MENU_XPATH);
    }
    public void waitForNgonNguMenu(){
        waitForElementVisible(driver, DashboardPageUI.NGONNGU_MENU_XPATH);
    }
    public void waitForKeSachMenu(){
        waitForElementVisible(driver, DashboardPageUI.KESACH_MENU_XPATH);
    }
    public void waitForTinhTrangSachMenu(){
        waitForElementVisible(driver, DashboardPageUI.TINHTRANGSACH_MENU_XPATH);
    }
    public void waitForNguonCcMenu(){
        waitForElementVisible(driver, DashboardPageUI.NGUONCUNGCAP_MENU_XPATH);
    }
    public void waitForDdcMenu(){
        waitForElementVisible(driver, DashboardPageUI.DDC_MENU_XPATH);
    }
    public void waitForPhanLoai19DayMenu(){
        waitForElementVisible(driver, DashboardPageUI.PHANLOAI19DAY_MENU_XPATH);
    }
    public void waitForSachMenu(){
        waitForElementVisible(driver, DashboardPageUI.SACH_MENU_XPATH);
    }
    public void waitForThuMucTaiLieuMenu(){
        waitForElementVisible(driver, DashboardPageUI.THUMUCTAILIEU_MENU_XPATH);
    }
    public void waitForMaMauMenu(){
        waitForElementVisible(driver, DashboardPageUI.MAMAU_MENU_XPATH);
    }
    public ListBstObj clickBstMenu(){
        waitForBstMenu();
        clickToElementXpath(driver, DashboardPageUI.BOSUUTAP_MENU_XPATH);
        listBst =  new ListBstObj(driver);
        return listBst;
    }
    public ListCbtvObj clickCbtvMenu(){
        waitForCbtvMenu();
        clickToElementXpath(driver, DashboardPageUI.CBTV_MENU_XPATH);
        listCbtv =  new ListCbtvObj(driver);
        return listCbtv;
    }
    public ListChuDiemObj clickChuDiemMenu(){
        waitForChuDiemMenu();
        clickToElementXpath(driver, DashboardPageUI.CHUDIEM_MENU_XPATH);
        listChuDiem =  new ListChuDiemObj(driver);
        return listChuDiem;
    }
    public ListDdcObj clickDdcMenu(){
        waitForDdcMenu();
        clickToElementXpath(driver, DashboardPageUI.DDC_MENU_XPATH);
        listDdc =  new ListDdcObj(driver);
        return listDdc;
    }
    public ListGvPageObj clickGiaoVienMenu(){
        waitForGvMenu();
        clickToElementXpath(driver, DashboardPageUI.GIAOVIEN_MENU_XPATH);
        listGv =  new ListGvPageObj(driver);
        return listGv;
    }
    public ListHsPageObj clickHocSinhMenu(){
        waitForHsMenu();
        clickToElementXpath(driver, DashboardPageUI.HOCSINH_MENU_XPATH);
        listHs =  new ListHsPageObj(driver);
        return listHs;
    }
    public ListKeSachObj clickKeSachMenu(){
        waitForKeSachMenu();
        clickToElementXpath(driver, DashboardPageUI.KESACH_MENU_XPATH);
        listKeSach =  new ListKeSachObj(driver);
        return listKeSach;
    }
    public ListMaMauObj clickMaMauMenu(){
        waitForMaMauMenu();
        clickToElementXpath(driver, DashboardPageUI.MAMAU_MENU_XPATH);
        listMaMau =  new ListMaMauObj(driver);
        return listMaMau;
    }
    public ListMonHocObj clickMonHocMenu(){
        waitForMonHocMenu();
        clickToElementXpath(driver, DashboardPageUI.MONHOC_MENU_XPATH);
        listMonHoc =  new ListMonHocObj(driver);
        return listMonHoc;
    }
    public ListNgonNguObj clickNgonNguMenu(){
        waitForNgonNguMenu();
        clickToElementXpath(driver, DashboardPageUI.NGONNGU_MENU_XPATH);
        listNgonNgu =  new ListNgonNguObj(driver);
        return listNgonNgu;
    }
    public ListNguonCcObj clickNguonCcMenu(){
        waitForNguonCcMenu();
        clickToElementXpath(driver, DashboardPageUI.NGUONCUNGCAP_MENU_XPATH);
        listNguonCc =  new ListNguonCcObj(driver);
        return listNguonCc;
    }
    public ListNhaXuatBanObj clickNxbMenu(){
        waitForNxbMenu();
        clickToElementXpath(driver, DashboardPageUI.NHAXUATBAN_MENU_XPATH);
        listNxb =  new ListNhaXuatBanObj(driver);
        return listNxb;
    }
    public ListNoiXuatBanObj clickNoixbMenu(){
        waitForNoiXbMenu();
        clickToElementXpath(driver, DashboardPageUI.NOIXUATBAN_MENU_XPATH);
        listNoiXb =  new ListNoiXuatBanObj(driver);
        return listNoiXb;
    }
    public ListPhanLoai19DayObj clickPhanLoai19DayMenu(){
        waitForPhanLoai19DayMenu();
        clickToElementXpath(driver, DashboardPageUI.PHANLOAI19DAY_MENU_XPATH);
        listPhanLoai19Day =  new ListPhanLoai19DayObj(driver);
        return listPhanLoai19Day;
    }
    public ListSachObj clickSachMenu(){
        waitForSachMenu();
        clickToElementXpath(driver, DashboardPageUI.SACH_MENU_XPATH);
        listSach =  new ListSachObj(driver);
        return listSach;
    }
    public ListThuMucTaiLieuObj clickThuMucTaiLieuMenu(){
        waitForThuMucTaiLieuMenu();
        clickToElementXpath(driver, DashboardPageUI.THUMUCTAILIEU_MENU_XPATH);
        listThuMucTaiLieu =  new ListThuMucTaiLieuObj(driver);
        return listThuMucTaiLieu;
    }
    public ListTacGiaObj clickTacGiaMenu(){
        waitForTacGiaMenu();
        clickToElementXpath(driver, DashboardPageUI.TACGIA_MENU_XPATH);
        listTacGia =  new ListTacGiaObj(driver);
        return listTacGia;
    }
    public ListTinhTrangSachObj clickTinhTrangSachMenu(){
        waitForTinhTrangSachMenu();
        clickToElementXpath(driver, DashboardPageUI.TINHTRANGSACH_MENU_XPATH);
        listTinhTrangSach =  new ListTinhTrangSachObj(driver);
        return listTinhTrangSach;
    }
    public void clickQuanLyThanhVien(){
        clickToElementXpath(driver, DashboardPageUI.QUANLYTHANHVIEN_MENU_XPATH);
    }
    public void clickQuanLyThongTinSach(){
        clickToElementXpath(driver, DashboardPageUI.QUANLYTHONGTINSACH_MENU_XPATH);
    }
    public void clickThongTinSach(){
        clickToElementXpath(driver, DashboardPageUI.THONGTINSACH_MENU_XPATH);
    }

}
