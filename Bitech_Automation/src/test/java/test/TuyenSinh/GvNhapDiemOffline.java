package test.TuyenSinh;

import core.BaseTest;

import core.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import page.Blib.Obj.DashboardPageObj;
import page.Blib.Obj.LoginPageObj;
import page.TuyenSinh.Obj.NhapDiem_Obj;
import page.TuyenSinh.Obj.THCS_OBJ;
import test.Blib.DataProviderTest;

public class GvNhapDiemOffline extends BaseTest {
    NhapDiem_Obj nhapDiem_obj;

    @BeforeTest
    @Parameters ("browser")
    public void initBrowser(String browser) {
        super.initBrowser(browser);
        nhapDiem_obj = new NhapDiem_Obj(driver);
    }


    @BeforeClass

    public void beforeClass() {
    }

    @Parameters ("url")
    @Override
    @BeforeMethod
    public void openBrowser(String url) {
        super.openBrowser(url);

    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }

    @Test (dataProvider = "TS_NhapDiemOffline", dataProviderClass = DataProviderTest.class)
    public void test(String userName, String passWord, String phach6So) {
        nhapDiem_obj.clickDTSNam2023();
        nhapDiem_obj.sendKeyTenGvNhapDiem(userName);
        nhapDiem_obj.sendKeyMatKhauGvNhapDiem(passWord);
        nhapDiem_obj.clickGvDangNhap();
        nhapDiem_obj.nhapPhach6so(phach6So);
        nhapDiem_obj.clickGvSeacrhBtn();
        String[] diems = nhapDiem_obj.nhapDiemRandomlan1();
        nhapDiem_obj.clickLuu();
    }

    @Test (dataProvider = "TS_NhapDiemOfflineSheet3", dataProviderClass = DataProviderTest.class)
    public void testNhapTatCaDiem(String userName1, String passWord1, String phach6So, String userName2, String passWord2) throws InterruptedException {
        nhapDiem_obj.clickDTSNam2023();
        nhapDiem_obj.sendKeyTenGvNhapDiem(userName1);
        nhapDiem_obj.sendKeyMatKhauGvNhapDiem(passWord1);
        nhapDiem_obj.clickGvDangNhap();
        nhapDiem_obj.nhapPhach6so(phach6So);
        nhapDiem_obj.clickGvSeacrhBtn();
        Thread.sleep(500);
        String[] diems = nhapDiem_obj.nhapDiemRandomlan1();
        Thread.sleep(500);
        nhapDiem_obj.clickLuu();
        driver.get("http://192.168.1.80:5000/TrangGiaoVienNhapDiem");
        nhapDiem_obj.clickDTSNam2023();
        nhapDiem_obj.sendKeyTenGvNhapDiem(userName2);
        nhapDiem_obj.sendKeyMatKhauGvNhapDiem(passWord2);
        nhapDiem_obj.clickGvDangNhap();
        nhapDiem_obj.nhapPhach6so(phach6So);
        nhapDiem_obj.clickGvSeacrhBtn();
        Thread.sleep(500);
        nhapDiem_obj.nhapDiemLan2(diems);
        Thread.sleep(500);
        nhapDiem_obj.clickLuu();
    }

    @Test (dataProvider = "TS_NhapDiemOfflineSheet4", dataProviderClass = DataProviderTest.class)
    public void testNhapTatCaDiemSheet4(String userName1, String passWord1, String phach6So) {
        nhapDiem_obj.clickDTSNam2023();
        nhapDiem_obj.sendKeyTenGvNhapDiem(userName1);
        nhapDiem_obj.sendKeyMatKhauGvNhapDiem(passWord1);
        nhapDiem_obj.clickGvDangNhap();
        nhapDiem_obj.nhapPhach6so(phach6So);
        nhapDiem_obj.clickGvSeacrhBtn();
        String[] diems = nhapDiem_obj.listDiemNhapLan1();
        nhapDiem_obj.nhapDiemLan2(diems);
        nhapDiem_obj.clickLuu();
    }

    @Test (dataProvider = "TS_NhapDiemOfflineSheet5", dataProviderClass = DataProviderTest.class)
    public void testNhapTatCaDiemSheet5(String userName1, String passWord1, String phach6So, String userName2, String passWord2) {
        nhapDiem_obj.clickDTSNam2023();
        nhapDiem_obj.sendKeyTenGvNhapDiem(userName1);
        nhapDiem_obj.sendKeyMatKhauGvNhapDiem(passWord1);
        nhapDiem_obj.clickGvDangNhap();
        nhapDiem_obj.nhapPhach6so(phach6So);
        nhapDiem_obj.clickGvSeacrhBtn();
        String[] diems = nhapDiem_obj.listDiemNhapLan1();
        nhapDiem_obj.nhapDiemDung(diems);
        nhapDiem_obj.clickLuu();
        driver.get("http://localhost:5000/TrangGiaoVienNhapDiem");
        nhapDiem_obj.clickDTSNam2023();
        nhapDiem_obj.sendKeyTenGvNhapDiem(userName2);
        nhapDiem_obj.sendKeyMatKhauGvNhapDiem(passWord2);
        nhapDiem_obj.clickGvDangNhap();
        nhapDiem_obj.nhapPhach6so(phach6So);
        nhapDiem_obj.clickGvSeacrhBtn();
        nhapDiem_obj.nhapDiemDung(diems);
        nhapDiem_obj.clickLuu();
    }

    @Test (dataProvider = "TS_NhapDiemOfflineSheet6", dataProviderClass = DataProviderTest.class)
    public void testNhapDiem1Mon(String userName1, String passWord1, String phach6So, String userName2, String passWord2) throws InterruptedException {
        nhapDiem_obj.clickDTSNam2023();
        nhapDiem_obj.sendKeyTenGvNhapDiem(userName1);
        nhapDiem_obj.sendKeyMatKhauGvNhapDiem(passWord1);
        nhapDiem_obj.clickGvDangNhap();
        nhapDiem_obj.nhapPhach6so(phach6So);
        nhapDiem_obj.clickGvSeacrhBtn();
        Thread.sleep(500);
        String[] diems = nhapDiem_obj.nhapDiemRandomlan1();
        Thread.sleep(500);
        nhapDiem_obj.clickLuu();
        driver.get("http://localhost:5000/TrangGiaoVienNhapDiem");
        nhapDiem_obj.clickDTSNam2023();
        nhapDiem_obj.sendKeyTenGvNhapDiem(userName2);
        nhapDiem_obj.sendKeyMatKhauGvNhapDiem(passWord2);
        nhapDiem_obj.clickGvDangNhap();
        nhapDiem_obj.nhapPhach6so(phach6So);
        nhapDiem_obj.clickGvSeacrhBtn();
        Thread.sleep(500);
        nhapDiem_obj.nhapDiemLan2(diems);
        Thread.sleep(500);
        nhapDiem_obj.clickLuu();
    }

    @Test
    public void testAdminSuaDiem() throws InterruptedException {
        nhapDiem_obj.adminNhapUsername("admin");
        nhapDiem_obj.adminNhapPassword("Admin123");
        nhapDiem_obj.adminClickDangNhap();
        nhapDiem_obj.adminClickBaiThi();

        nhapDiem_obj.adminClickChonMonThi01();
        Thread.sleep(600);
        nhapDiem_obj.nhapDiemDoiSoat();
        Thread.sleep(300);
        nhapDiem_obj.adminClickLuuNhapDiem();

        nhapDiem_obj.adminClickChonMonThi02();
        nhapDiem_obj.nhapDiemDoiSoat();
        Thread.sleep(300);
        nhapDiem_obj.adminClickLuuNhapDiem();

        nhapDiem_obj.adminClickChonMonThi03();
        nhapDiem_obj.nhapDiemDoiSoat();
        Thread.sleep(300);
        nhapDiem_obj.adminClickLuuNhapDiem();

        nhapDiem_obj.adminClickChonMonThi04();
        nhapDiem_obj.nhapDiemDoiSoat();
        Thread.sleep(300);
        nhapDiem_obj.adminClickLuuNhapDiem();

        nhapDiem_obj.adminClickChonMonThi05();
        nhapDiem_obj.nhapDiemDoiSoat();
        Thread.sleep(300);
        nhapDiem_obj.adminClickLuuNhapDiem();

        nhapDiem_obj.adminClickChonMonThi06();
        nhapDiem_obj.nhapDiemDoiSoat();
        Thread.sleep(300);
        nhapDiem_obj.adminClickLuuNhapDiem();

        nhapDiem_obj.adminClickChonMonThi07();
        nhapDiem_obj.nhapDiemDoiSoat();
        Thread.sleep(300);
        nhapDiem_obj.adminClickLuuNhapDiem();

        nhapDiem_obj.adminClickChonMonThi08();
        nhapDiem_obj.nhapDiemDoiSoat();
        Thread.sleep(300);
        nhapDiem_obj.adminClickLuuNhapDiem();

        nhapDiem_obj.adminClickChonMonThi09();
        nhapDiem_obj.nhapDiemDoiSoat();
        Thread.sleep(300);
        nhapDiem_obj.adminClickLuuNhapDiem();

        nhapDiem_obj.adminClickChonMonThi10();
        nhapDiem_obj.nhapDiemDoiSoat();
        Thread.sleep(300);
        nhapDiem_obj.adminClickLuuNhapDiem();

        nhapDiem_obj.adminClickChonMonThi11();
        nhapDiem_obj.nhapDiemDoiSoat();
        Thread.sleep(300);
        nhapDiem_obj.adminClickLuuNhapDiem();

        nhapDiem_obj.adminClickChonMonThi12();
        nhapDiem_obj.nhapDiemDoiSoat();
        Thread.sleep(300);
        nhapDiem_obj.adminClickLuuNhapDiem();
    }

}
