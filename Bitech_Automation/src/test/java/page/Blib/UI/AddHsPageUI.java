package page.Blib.UI;

import org.omg.CORBA.PUBLIC_MEMBER;

public class AddHsPageUI {
    public static final String TITLE_TEXT_BYXPATH = "//div[contains(text(),'Thêm mới học sinh')]";
    public static final String AVATAR_TEXT_BYXPATH = "//span[contains(text(),'Chọn hình ảnh')]";
    public static final String AVATARSRC_TEXT = "//img[@alt='Hình đại diện']";
    public static final String JPGFILEINPUT_RESOURCES = "JPGfile.jpg";
    public static final String PNGFILEINPUT_RESOURCES = "PNGfile.png";
    public static final String AVATAR_INPUT = "//input[@name='HinhChanDung']";
    public static final String TENHS_TEXTBOX = "//input[@name='Ten']";
    public static final String MAHS_TEXTBOX = "//input[@name='MaSoThanhVien']";
    public static final String GIOITINH_BOX = "//select[@name='GioiTinh']//option[1]";
    public static final String GIOITINH_OPTION = "//select[@name='GioiTinh']//option";
    public static final String LOPHOC_TEXTBOX = "//input[@name='LopHoc']";
    public static final String NAMHOC_OPTION = "//select[@name='NienKhoa']//option";
    public static final String NAMHOC_BOX = "//select[@name='NienKhoa']//option[1]";
    public static final String DIACHI_TEXTBOX = "//input[@name='DiaChi']";
    public static final String SDT_TEXTBOX = "//input[@name='SDT']";
    public static final String THOIHANTHE_DATETIME_BYXPATH = "//input[@placeholder = 'Chọn thời hạn thẻ']";
    public static final String NGAYSINH_DATETIME_BYXPATH = "//input[@placeholder = 'Chọn ngày sinh']";
    public static final String THEMMOI_BTN = "//button[contains(text(),'Thêm mới')]";
    public static final String QUAYVE_BTN = "//button[contains(text(),'Quay về')]";
    public static final String TENHS_TITLE = "//label[text() = 'Tên học sinh ']";
    public static final String MAHS_TITLE = "//label[text() = 'Mã học sinh']";
    public static final String LOPHOC_TITLE = "//label[text() = 'Lớp học ']";
    public static final String DIACHI_TITLE = "//label[text() = 'Địa chỉ']";
    public static final String THOIHANTHE_TITLE = "//label[text() = 'Thời hạn thẻ ']";
    public static final String NGAYSINH_TITLE = "//label[text() = 'Ngày sinh ']";
        public static final String GIOITINH_TITLE = "//label[text() = 'Giới tính ']";
    public static final String NAMHOC_TITLE = "//label[text() = 'Năm học ']";
    public static final String SDT_TITLE = "//label[text() = 'Số điện thoại ']";
    public static final String TENHS_MESSAGE_TEXT = TENHS_TEXTBOX + "//following-sibling::p";
    public static final String MAHS_MESSAGE_TEXT = MAHS_TEXTBOX + "//following-sibling::p";
    public static final String LOPHS_MESSAGE_TEXT = LOPHOC_TEXTBOX + "//following-sibling::p";
    public static final String THOIHAN_MESSAGE_TEXT = THOIHANTHE_DATETIME_BYXPATH + "//following-sibling::p";
    public static final String NGAYSINH_MESSAGE_TEXT = NGAYSINH_DATETIME_BYXPATH + "//following-sibling::p";
    public static final String GIOITINH_MESSAGE_TEXT = GIOITINH_OPTION + "//following-sibling::p";
    public static final String NAMHOC_MESSAGE_TEXT = NAMHOC_OPTION + "//following-sibling::p";
    public static final String SDT_MESSAGE_TEXT = SDT_TEXTBOX + "//following-sibling::p";
    public static final String TOASTIFY_TEXT = "//div[@role = 'alert']/div[2]";
    public static final String TOASTIFY_BODY = "//div[@class='Toastify__toast-body']";


}
