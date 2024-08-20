package test.Blib;

import core.BasePage;
import core.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import page.Blib.Obj.*;
import page.Blib.UI.AddHsPageUI;

import java.util.ArrayList;

public class Test02_DashboardPage_HS extends BaseTest {
    DashboardPageObj dashboardPage;
    LoginPageObj loginPage;
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
    ListThuMucTaiLieuObj listThuMucTaiLieu;
    ListTacGiaObj listTacGia;
    ListTinhTrangSachObj listTinhTrangSach;
    AddHsPageObj addHs;
    AddHsExcelPageObj addHsExcelPage;
    UpdateAvatarPageObj updateAvatarPage;
    EditHsPageObj editHsPage;
    ExportCardPageObj exportCardPage;


    @BeforeTest
    @Parameters ("browser")
    public void initBrowser(String browser) {
        super.initBrowser(browser);
        loginPage = new LoginPageObj(driver);
    }

    @Parameters ("url")
    @BeforeClass
    @Override
    public void openBrowser(String url) {
        super.openBrowser(url);
        loginPage.waitForTextBox();

    }

    @Parameters ("url")
    @BeforeMethod
    public void beforeMethod(String url) {
        loginPage.waitForTextBox();
        dashboardPage = loginPage.logIn("demotvs@gmail.com", "Oneadmin@123");
        dashboardPage.verifyDashboardPage();
        dashboardPage.clickQuanLyThanhVien();
        listHs = dashboardPage.clickHocSinhMenu();
    }

    @AfterClass
    public void quitBrowser() {
        driver.close();
    }

    @Test
    public void clickMenuBar_TC01() {
        listHs.verifyListHsPage();
        listGv = dashboardPage.clickGiaoVienMenu();
        listGv.verifyListGvPage();

        listCbtv = dashboardPage.clickCbtvMenu();
        listCbtv.verifyListCbtvPage();

        dashboardPage.clickQuanLyThongTinSach();
        listBst = dashboardPage.clickBstMenu();
        listBst.verifyListBstPage();

        listChuDiem = dashboardPage.clickChuDiemMenu();
        listChuDiem.verifyListChuDiemPage();

        listDdc = dashboardPage.clickDdcMenu();
        listDdc.verifyListDdcPage();

        listKeSach = dashboardPage.clickKeSachMenu();
        listKeSach.verifyListKeSachPage();

        listMaMau = dashboardPage.clickMaMauMenu();
        listMaMau.verifyListMaMauPage();

        listMonHoc = dashboardPage.clickMonHocMenu();
        listMonHoc.verifyListMonHocPage();

        listNgonNgu = dashboardPage.clickNgonNguMenu();
        listNgonNgu.verifyListNgonNguPage();

        listNguonCc = dashboardPage.clickNguonCcMenu();
        listNguonCc.verifyListNguonCcPage();

        listNxb = dashboardPage.clickNxbMenu();
        listNxb.verifyListNxbPage();

        listNoiXb = dashboardPage.clickNoixbMenu();
        listNoiXb.verifyListNoiXbPage();

        listPhanLoai19Day = dashboardPage.clickPhanLoai19DayMenu();
        listPhanLoai19Day.verifyListPhanLoai19DayPage();


        listTacGia = dashboardPage.clickTacGiaMenu();
        listTacGia.verifyListTacGiaPage();


        listTinhTrangSach = dashboardPage.clickTinhTrangSachMenu();
        listTinhTrangSach.verifyListTinhTrangSachPage();

//        dashboardPage.clickThongTinSach();
//
//        listSach = dashboardPage.clickSachMenu();
//        listSach.verifyListSachPage();
//        listThuMucTaiLieu = dashboardPage.clickThuMucTaiLieuMenu();
//        listThuMucTaiLieu.verifyListThuMucTaiLieuPage();
    }

    @Test
    public void danhSachHocSinh_TC02() throws InterruptedException {
        addHs = listHs.clickThemHocSinh();
        addHs.verifyAddHsPage();
        driver.navigate().back();
        Thread.sleep(1000);

        addHsExcelPage = listHs.clickThemTuExcel();
        addHsExcelPage.verifyAddHsExcelPage();
        driver.navigate().back();
        Thread.sleep(1000);

        updateAvatarPage = listHs.clickCapNhatAvatar();
        updateAvatarPage.verifyUpdateAvatarPage();
        driver.navigate().back();
        Thread.sleep(1000);

        //click edit random HS 1~30
        int i = (int) (Math.random() * 29 + 1);
//        System.out.println(i);
        editHsPage = listHs.clickIconEditHs(i);
        editHsPage.verifyEditHsPage();
        driver.navigate().back();
        Thread.sleep(1000);
        //delete edit random HS 1~30
        listHs.clickIconDeleteHs(i);
        Thread.sleep(1000);
        listHs.verifyPopupDelete();
        listHs.clickCancelDelete();
        //click Khoa Hs;
        listHs.clickIconLockHs(i);
        Thread.sleep(1000);
        listHs.verifyPopupLock();
        listHs.clickCancelLock();
        //click Xuat the thu vien
        exportCardPage = listHs.clickExportCardCell_Icon(i);
        exportCardPage.verifyExportCardPage();
        driver.navigate().back();
        Thread.sleep(1000);
// verify enable btn Xuat the va Xoa
        listHs.clickXoaHs();
        listHs.verifyListHsPage();
        listHs.clickXuatTheThuVien();
        listHs.verifyListHsPage();

        listHs.clickCheck1Hs(i);
        listHs.verifyEnableDeleteBtn();
        listHs.verifyEnableExportCardBtn();
        listHs.clickXoaHs();
        Thread.sleep(1000);
        listHs.verifyPopupDeleteHs();
        listHs.clickCancelDelete();
        listHs.clickXuatTheThuVien();
        exportCardPage.verifyExportCardPage();
        driver.navigate().back();
        Thread.sleep(1000);

        listHs.clickCheckAllHs();
        listHs.verifyEnableDeleteBtn();
        listHs.verifyEnableExportCardBtn();
        listHs.clickXoaHs();
        Thread.sleep(1000);
        listHs.verifyPopupDeleteHs();
        listHs.clickCancelDelete();
        listHs.clickXuatTheThuVien();
        exportCardPage.verifyExportCardPage();
        driver.navigate().back();
        Thread.sleep(1000);
    }

    @Test (dataProvider = "AddHs_Sheet1", dataProviderClass = DataProviderTest.class)
    public void themMoiHocSinh_TC03(String ten, String maHs, String ngaySinh, String gioiTinh, String lopHoc,
                                    String namHoc, String diaChi, String sDT, String thoiHan) throws InterruptedException {
//addhs-1
        addHs = listHs.clickThemHocSinh();
        //upload image
        addHs.waitForAddHsPage();
        Thread.sleep(1000);
        Assert.assertEquals(addHs.getTextAvatar(), "Chọn hình ảnh");
        addHs.sendAvatarFileJPG();
        addHs.sendHsInformations(ten, maHs, ngaySinh, gioiTinh, lopHoc, namHoc, diaChi, sDT, thoiHan);
        addHs.waitForToastifyInvisible();
        Thread.sleep(2000);
        listHs.waitForListHsPage();

//addhs-2
        //verifyAvatarFileName JPG
        editHsPage = listHs.clickIconEditHs(1);
        editHsPage.waitForEditHsPage();
        Thread.sleep(2000);
        Assert.assertNotEquals(addHs.getFileSourceAvatar(),
                "https://thuvienso.bitechco.link/content/default-avatar.jpeg",
                addHs.getFileSourceAvatar());
        driver.navigate().back();
        listHs.waitForListHsPage();

//addhs-3
        //verifyAvatarFileName PNG
        listHs.clickThemHocSinh();
        addHs.waitForAddHsPage();
        Thread.sleep(1000);
        addHs.sendAvatarFilePNG();
        addHs.sendHsInformations(ten, maHs, ngaySinh, gioiTinh, lopHoc, namHoc, diaChi, sDT, thoiHan);
        listHs.waitForListHsPage();
        listHs.clickIconEditHs(1);
        editHsPage.waitForEditHsPage();
        Thread.sleep(1500);
        String fileSource1 = addHs.getFileSourceAvatar();
        Assert.assertNotEquals(fileSource1, "https://thuvienso.bitechco.link/content/default-avatar.jpeg", fileSource1);
        driver.navigate().back();
        listHs.waitForListHsPage();
//addhs-4
        //
        listHs.clickThemHocSinh();
        addHs.waitForAddHsPage();
        addHs.sendHsInformations(ten, maHs, ngaySinh, gioiTinh, lopHoc, namHoc, diaChi, sDT, thoiHan);
        listHs.waitForListHsPage();
        listHs.clickThemHocSinh();
        addHs.waitForAddHsPage();
        addHs.sendAvatarFilePNG();
        addHs.sendHsInformationsNoConfirm(ten, maHs, ngaySinh, gioiTinh, lopHoc, namHoc, diaChi, sDT, thoiHan);
        addHs.clickBtnBack();
        listHs.waitForListHsPage();
        listHs.clickIconEditHs(1);
        editHsPage.waitForEditHsPage();
        String fileSource2 = addHs.getFileSourceAvatar();
        Assert.assertEquals(fileSource2, "https://thuvienso.bitechco.link/content/default-avatar.jpeg", fileSource2);
        driver.navigate().back();
        Thread.sleep(1000);

//addhs-5 - verify title placeholder TenHs
        listHs.clickThemHocSinh();
        String titleHs = addHs.getTitleTenHs();
        Assert.assertEquals(titleHs, "Tên học sinh *", titleHs);
        String placeholderHs = addHs.getTextPlaceholderTenHs();
        Assert.assertEquals(placeholderHs, "Nhập tên học sinh", placeholderHs);

        //verify title placeholder MaHs
        String titleMa = addHs.getTitleMaHs();
        Assert.assertEquals(titleMa, "Mã học sinh", titleMa);

        String placeholderMaHs = addHs.getTextPlaceholderMaHs();
        Assert.assertEquals(placeholderMaHs, "Nhập mã học sinh", placeholderMaHs);

        String titleLop = addHs.getTitleLopHocHs();
        Assert.assertEquals(titleLop, "Lớp học *", titleLop);

        String placeholderLopHs = addHs.getTextPlaceholderLopHocHs();
        Assert.assertEquals(placeholderLopHs, "Nhập lớp học", placeholderLopHs);

        String titleDiaChi = addHs.getTitleDiaChiHs();
        Assert.assertEquals(titleDiaChi, "Địa chỉ", titleDiaChi);

        String placeholderDiaChiHs = addHs.getTextPlaceholderDiaChiHs();
        Assert.assertEquals(placeholderDiaChiHs, "Nhập địa chỉ", placeholderDiaChiHs);

        String titleThoiHanThe = addHs.getTitleThoiHanTheHs();
        Assert.assertEquals(titleThoiHanThe, "Thời hạn thẻ *", titleThoiHanThe);

        String placeholderThoiHanTheHs = addHs.getTextPlaceholderThoiHanTheHs();
        Assert.assertEquals(placeholderThoiHanTheHs, "Chọn thời hạn thẻ", placeholderThoiHanTheHs);

        String titleNgaySinh = addHs.getTitleNgaySinhHs();
        Assert.assertEquals(titleNgaySinh, "Ngày sinh *", titleNgaySinh);

        String placeholderNgaySinhHs = addHs.getTextPlaceholderNgaySinhHs();
        Assert.assertEquals(placeholderNgaySinhHs, "Chọn ngày sinh", placeholderNgaySinhHs);

        String titleGioiTinh = addHs.getTitleGioiTinhHs();
        Assert.assertEquals(titleGioiTinh, "Giới tính *", titleGioiTinh);

        String placeholderGioiTinhHs = addHs.getTextPlaceholderGioiTinhHs();
        Assert.assertEquals(placeholderGioiTinhHs, "Chọn giới tính", placeholderGioiTinhHs);

        String titleNamHoc = addHs.getTitleNamHocHs();
        Assert.assertEquals(titleNamHoc, "Năm học *", titleNamHoc);

        String placeholderNamHocHs = addHs.getTextPlaceholderNamHocHs();
        Assert.assertEquals(placeholderNamHocHs, "Chọn năm học", placeholderNamHocHs);

        String titleSdt = addHs.getTitleSdtHs();
        Assert.assertEquals(titleSdt, "Số điện thoại *", titleSdt);

        String placeholderSdtHs = addHs.getTextPlaceholderSdtHs();
        Assert.assertEquals(placeholderSdtHs, "Nhập số điện thoại", placeholderSdtHs);

        addHs.verifyNgaySinhBox();
    }

    @Test (dataProvider = "AddHs_Sheet2", dataProviderClass = DataProviderTest.class)
    public void unvalidAddHs_TC04(String ten, String maHs, String ngaySinh, String gioiTinh, String lopHoc,
                                  String namHoc, String diaChi, String sDT, String thoiHan, String message) {
        addHs = listHs.clickThemHocSinh();
        addHs.waitForAddHsPage();
        addHs.sendHsInformationsNoSpace(ten, maHs, ngaySinh, gioiTinh, lopHoc, namHoc, diaChi, sDT, thoiHan);
        addHs.assertDangerMessageAddHs(message);
    }


    @Test (dataProvider = "AddHs_Sheet3", dataProviderClass = DataProviderTest.class)
    public void validHs_TC05(String ten, String maHs, String ngaySinh, String gioiTinh, String lopHoc,
                             String namHoc, String diaChi, String sDT, String thoiHan, String message) {
        addHs = listHs.clickThemHocSinh();
        addHs.sendHsInformationsNoSpace(ten, maHs, ngaySinh, gioiTinh, lopHoc, namHoc, diaChi, sDT, thoiHan);
        addHs.assertToastify(message);
    }

    @Test (dataProvider = "AddHs_Sheet1", dataProviderClass = DataProviderTest.class)
    public void validExistInforHs_TC06(String ten, String maHs, String ngaySinh, String gioiTinh, String lopHoc,
                                       String namHoc, String diaChi, String sDT, String thoiHan) {
        addHs = listHs.clickThemHocSinh();
        addHs.sendHsInformationsNoConfirm(ten, maHs, ngaySinh, gioiTinh, lopHoc, namHoc, diaChi, sDT, thoiHan);

        sDT = addHs.getValueSdt();
        ten = addHs.getValueTenHs();
        maHs = addHs.getValueMaHs();
        lopHoc = addHs.getValueLopHoc();
        diaChi = addHs.getValueDiaChi();
        thoiHan = addHs.getValueThoiHanThe();
        addHs.clickBtnAdd();
        addHs.assertToastify("Thêm học sinh thành công");
        addHs.waitForToastifyInvisible();
        listHs.waitForListHsPage();
        listHs.clickThemHocSinh();
        addHs.sendHsInformationsNoConfirm(ten, maHs, ngaySinh, gioiTinh, lopHoc, namHoc, diaChi, sDT, thoiHan);
        addHs.clickBtnAdd();
        addHs.assertToastify("Mã số thành viên bị trùng");
        addHs.waitForToastifyInvisible();
        addHs.sendMaHs("randomAlphaNumeric 3");
        addHs.clickBtnAdd();
        addHs.assertToastify("Thêm học sinh thành công");
    }

    // infors.set(0, getValueSdt());
//        infors.set(1, getValueTenHs());
//        infors.set(2, getValueMaHs());
//        infors.set(3, getValueLopHoc());
//        infors.set(4, getValueNgaySinh());
//        infors.set(5, getValueGioiTinh());
//        infors.set(6, getValueNamHoc());
//        infors.set(7, getValueDiaChi());
//        infors.set(8, getValueThoiHanThe());
    @Test (dataProvider = "AddHs_Sheet1", dataProviderClass = DataProviderTest.class)
    public void verifyGenerateMaHs_TC07(String ten, String maHs, String ngaySinh, String gioiTinh, String lopHoc,
                                        String namHoc, String diaChi, String sDT, String thoiHan) {
        addHs = listHs.clickThemHocSinh();
        addHs.sendHsInformations(ten, "", ngaySinh, gioiTinh, lopHoc, namHoc, diaChi, sDT, thoiHan);
        addHs.assertToastify("Thêm học sinh thành công");
        addHs.waitForToastifyInvisible();
        listHs.waitForListHsPage();
        int maHsGenerate = Integer.parseInt(listHs.getInforMaHsCell(1)) + 1;
        String namHocList = listHs.getInforNamHocCell(1);
        listHs.clickThemHocSinh();
        addHs.sendHsInformations(ten, "", ngaySinh, gioiTinh, lopHoc, namHocList, diaChi, sDT, thoiHan);
        addHs.assertToastify("Thêm học sinh thành công");
        addHs.waitForToastifyInvisible();
        listHs.waitForListHsPage();
        int maHsGenerate2 = Integer.parseInt(listHs.getInforMaHsCell(1));
        Assert.assertEquals(maHsGenerate2, maHsGenerate, "Generate Mã HS không đúng thứ tự");
    }


//    infors[0] = getInforSttCell(i);
//    infors[1] = getInforTenHsCell(i);
//    infors[2] = getInforMaHsCell(i);
//    infors[3] = getInforLopHocCell(i);
//    infors[4] = getInforNgaySinhCell(i);
//    infors[5] = getInforGioiTinhCell(i);
//    infors[6] = getInforNamHocCell(i);
//    infors[7] = getInforTrangThaiCell(i);


    @Test
    public void trimSpace_TC08() throws InterruptedException {
        addHs = listHs.clickThemHocSinh();
        String ten = addHs.randTenHs((int) Math.random() * 10 + 2);
        addHs.sendKeyTextbox(AddHsPageUI.TENHS_TEXTBOX, "   " + ten + "   " + ten + "   ");
        String expectedTenHs = ten + " " + ten;

        int numMa = (int) (Math.random() * 10000);
        addHs.sendKeyTextbox(AddHsPageUI.MAHS_TEXTBOX, "   hs" + numMa + "   ");
        String expectedMaHs = "HS" + numMa;

        String lopHs = addHs.randLopHs((int) Math.random() * 4 + 2);
        addHs.sendKeyTextbox(AddHsPageUI.LOPHOC_TEXTBOX, "   " + lopHs + "   " + lopHs + "   ");
        String expectedLopHs = lopHs + "   " + lopHs;

        String diaChiHs = addHs.randDiaChiHs((int) Math.random() * 10 + 2);
        addHs.sendKeyTextbox(AddHsPageUI.DIACHI_TEXTBOX, "   " + diaChiHs + "   " + diaChiHs + "   ");
        String expectedDiaChiHs = diaChiHs + "   " + diaChiHs;

        addHs.sendNgaySinh("random");
        addHs.selectGioiTinh("random");
        addHs.selectNamHoc("random");
        addHs.sendThoiHanThe("random");
        addHs.sendSDT("random 09");
        addHs.clickBtnAdd();
        addHs.waitForToastifyInvisible();
        Thread.sleep(2000);
        listHs.waitForListHsPage();
        editHsPage = listHs.clickIconEditHs(1);
        editHsPage.waitForEditHsPage();
        Thread.sleep(2000);
        Assert.assertEquals(addHs.getValueTenHs(), expectedTenHs);
        Assert.assertEquals(addHs.getValueMaHs(), expectedMaHs);
        Assert.assertEquals(addHs.getValueLopHoc(), expectedLopHs);
        Assert.assertEquals(addHs.getValueDiaChi(), expectedDiaChiHs);
    }

    @Test
    public void localTest() {
        addHs = listHs.clickThemHocSinh();
        addHs.verifyNgaySinhBox();
        addHs.verifyThoiHanTheBox();

    }
}
