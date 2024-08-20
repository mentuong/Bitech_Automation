package page.Blib.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.Blib.UI.ListHsPageUI;

public class ListHsPageObj extends BasePage {
    WebDriver driver;
    AddHsPageObj addHs;
    AddHsExcelPageObj addHsExcel;
    UpdateAvatarPageObj updateAvatarPage;
    EditHsPageObj editHsPage;
    ExportCardPageObj exportCardPage;

    public ListHsPageObj(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyListHsPage() {
        String expected = "DANH SÁCH HỌC SINH";
        waitForElementVisible(driver, ListHsPageUI.TITLE_TEXT);
        String actual = getElementXpath(driver, ListHsPageUI.TITLE_TEXT).getText();
        Assert.assertEquals(actual, expected, "Chua dung man hinh danh sach Hoc Sinh");
    }

    public AddHsPageObj clickThemHocSinh() {
        clickToElementXpath(driver, ListHsPageUI.THEM_BTN);
        addHs = new AddHsPageObj(driver);
        return addHs;
    }

    public AddHsExcelPageObj clickThemTuExcel() {
        clickToElementXpath(driver, ListHsPageUI.THEMTUEXCEL_BTN);
        addHsExcel = new AddHsExcelPageObj(driver);
        return addHsExcel;

    }

    public void clickXuatTheThuVien() {
        clickToElementXpath(driver, ListHsPageUI.XUATTHETV_BTN);
    }

    public UpdateAvatarPageObj clickCapNhatAvatar() {
        clickToElementXpath(driver, ListHsPageUI.CAPNHATAVATAR_BTN);
        updateAvatarPage = new UpdateAvatarPageObj(driver);
        return updateAvatarPage;
    }

    public void clickTaiDsHs() {
        clickToElementXpath(driver, ListHsPageUI.TAIDANHSACHHS_BTN);
    }

    public void clickXoaHs() {
        clickToElementXpath(driver, ListHsPageUI.XOAHS_BTN);
    }
    public void clickLamMoi(){
        clickToElementXpath(driver, ListHsPageUI.LAMMOI_BTN);
    }
    public void clickTimKiem(){
        clickToElementXpath(driver, ListHsPageUI.TIMKIEM_BTN);
    }
    public void selectGioiTinhNam(){
        clickToElementXpath(driver, ListHsPageUI.GIOITINHNAM_OPTIONCLICK);
    }
    public void selectGioiTinhNu() {
        clickToElementXpath(driver, ListHsPageUI.GIOITINHNU_OPTIONCLICK);
    }
    public void selectNamHoc(String value) {
            selectOptionList(driver, ListHsPageUI.NAMHOC_OPTION, value);
    }
    public void selectTrangThaiKhoa() {
        clickToElementXpath(driver, ListHsPageUI.TRANGTHAIKHOA_OPTION);
    }
    public void selectTrangThaiKichHoat() {
        clickToElementXpath(driver, ListHsPageUI.TRANGTHAIKICHHOAT_OPTION);
    }
    public void clickCheck1Hs (int index){
        clickToElementXpath(driver, ListHsPageUI.CHECKBOX(index));
    }
    public void clickCheckAllHs(){
        clickToElementXpath(driver, ListHsPageUI.CHECKBOXALL_INPUT);
    }
    public EditHsPageObj clickIconEditHs (int index){
        clickToElementXpath(driver, ListHsPageUI.EDIT_CELL_ICON(index));
        editHsPage = new EditHsPageObj(driver);
        return editHsPage;
    }
    public ExportCardPageObj clickExportCardCell_Icon(int index){
        clickToElementXpath(driver, ListHsPageUI.EXPORTCARD_CELL_ICON(index));
        exportCardPage = new ExportCardPageObj(driver);
        return exportCardPage;
    }
    public void clickIconDeleteHs(int index){
        clickToElementXpath(driver, ListHsPageUI.DELETE_CELL_ICON(index));
    }
    public void verifyPopupDelete(){
        boolean actual = isDisplayedElement(driver, ListHsPageUI.POPUPDELETE_SPAN);
        Assert.assertTrue(actual, "Khong hien thi Popup");
        String actualText = getElementXpath(driver, ListHsPageUI.POPUPDELETE_SPAN).getText();
        Assert.assertEquals(actualText, "Bạn có chắn chắn muốn xóa học sinh", "Text Popup chua dung");
    }
    public void verifyPopupDeleteHs(){
        boolean actual = isDisplayedElement(driver, ListHsPageUI.POPUPDELETEHS_SPAN);
        Assert.assertTrue(actual, "Khong hien thi Popup");
        String actualText = getElementXpath(driver, ListHsPageUI.POPUPDELETEHS_SPAN).getText();
        Assert.assertEquals(actualText, "Bạn có muốn chắc chắn xóa những học sinh này không?", "Text Popup chua dung");
    }
    public void verifyPopupLock(){
        boolean actual = isDisplayedElement(driver, ListHsPageUI.POPUPLOCK_SPAN);
        Assert.assertTrue(actual, "Khong hien thi Popup");
        String actualText = getElementXpath(driver, ListHsPageUI.POPUPLOCK_SPAN).getText();
        Assert.assertEquals(actualText, "Bạn có chắn chắn muốn khóa học sinh", "Text Popup chua dung");
    }
    public void clickConfirmDelete(){
        clickToElementXpath(driver, ListHsPageUI.CONFIRMDELETE_BTN);
    }
    public void clickCancelDelete(){
        clickToElementXpath(driver, ListHsPageUI.CANCELDELETE_BTN);
        waitForElementInvisible(driver, ListHsPageUI.CANCELDELETE_BTN);
    }
    public void clickCancelLock(){
        clickToElementXpath(driver, ListHsPageUI.CANCELLOCK_BTN);
    }
    public void clickIconLockHs(int index){
        clickToElementXpath(driver, ListHsPageUI.LOCK_CELL_ICON(index));
    }
    public void verifyEnableDeleteBtn(){
        boolean actual = isEnableElement(driver, ListHsPageUI.XOAHS_BTN);
        Assert.assertTrue(actual, "Button Xoa Hs dang disable");
    }
    public void verifyDisableDeleteBtn(){
        boolean actual = isEnableElement(driver, ListHsPageUI.XOAHS_BTN);
        Assert.assertFalse(actual, "Button Xoa Hs dang enable");
    }
    public void verifyEnableExportCardBtn(){
        boolean actual = isEnableElement(driver, ListHsPageUI.XUATTHETV_BTN);
        Assert.assertTrue(actual, "Button Xuat the thu vien dang disable");
    }
    public void verifyDisableExportCardBtn(){
        boolean actual = isEnableElement(driver, ListHsPageUI.XUATTHETV_BTN);
        Assert.assertFalse(actual, "Button Xuat the thu vien dang enable");
    }
    public void waitForListHsPage(){
        waitForElementVisible(driver, ListHsPageUI.TITLE_TEXT);
    }
    public String getInforSttCell(int i){
        return getElementXpath(driver, ListHsPageUI.STT_CELL(i)).getText();
    }
    public String getInforTenHsCell(int i){
        return getElementXpath(driver, ListHsPageUI.TEN_CELL(i)).getText();
    }
    public String getInforGioiTinhCell(int i){
        return getElementXpath(driver, ListHsPageUI.GIOITINH_CELL(i)).getText();
    }
    public String getInforNamHocCell(int i){
        return getElementXpath(driver, ListHsPageUI.NAMHOC_CELL(i)).getText();
    }
    public String getInforMaHsCell(int i){
        return getElementXpath(driver, ListHsPageUI.MAHS_CELL(i)).getText();
    }
    public String getInforLopHocCell(int i){
        return getElementXpath(driver, ListHsPageUI.LOP_CELL(i)).getText();
    }
    public String getInforNgaySinhCell(int i){
        return getElementXpath(driver, ListHsPageUI.NGAYSINH_CELL(i)).getText();
    }
    public String getInforTrangThaiCell(int i){
        return getElementXpath(driver, ListHsPageUI.TRANGTHAI_CELL(i)).getText();
    }

    public String[] getInforHsTableCell(int i){
        String [] infors = new String[8];
        infors[0] = getInforSttCell(i);
        infors[1] = getInforTenHsCell(i);
        infors[2] = getInforMaHsCell(i);
        infors[3] = getInforLopHocCell(i);
        infors[4] = getInforNgaySinhCell(i);
        infors[5] = getInforGioiTinhCell(i);
        infors[6] = getInforNamHocCell(i);
        infors[7] = getInforTrangThaiCell(i);

        return infors;
    }
}
