package page.Blib.UI;

public class ListHsPageUI {
    public static final String TITLE_TEXT = "//div[contains(text(),'Danh sách học sinh')]";
    public static final String THEM_BTN = "//button[contains(text(),'Thêm học sinh')]";
    public static final String THEMTUEXCEL_BTN = "//button[contains(text(),'Thêm từ Excel')]";
    public static final String XUATTHETV_BTN = "//button[contains(text(),'Xuất thẻ thư viện')]";
    public static final String CAPNHATAVATAR_BTN = "//button[contains(text(),'Cập nhật ảnh đại diện')]";
    public static final String TAIDANHSACHHS_BTN = "//button[contains(text(),'Tải danh sách học sinh')]";
    public static final String LAMMOI_BTN = "//button[contains(text(),'Làm mới')]";
    public static final String TIMKIEM_BTN = "//button[contains(text(),'Tìm kiếm')]";
    public static final String XOAHS_BTN = "//button[contains(text(),'Xóa học sinh')]";
    public static final String TIMKIEM_TEXTBOX = "//body/div[@id='root']/section[1]/section[1]/section[1]/div[1]/form[1]/div[1]/input[1]";
    public static final String CHONGIOITINH_SELECT = "//body/div[@id='root']/section[1]/section[1]/section[1]/div[1]/form[1]/div[1]/input[1]";
    public static final String CHONNAMHOC_SELECT = "//body/div[@id='root']/section[1]/section[1]/section[1]/div[1]/form[1]/select[2]";
    public static final String CHONTRANGTHAI_SELECT = "//body/div[@id='root']/section[1]/section[1]/section[1]/div[1]/form[1]/select[3]";
    public static final String CHECKBOXALL_INPUT = "//thead/tr[1]/th[1]/div[1]/label[1]/span[1]";
    public static String CHECKBOX(int index) {return"//tbody/tr[" + (index + 1) + "]/td[1]/label[1]/span[1]";}
    public static String STT_CELL(int index) {return"//tbody/tr[" + (index + 1) + "]/td[2]";}
    public static String TEN_CELL(int index) {return"//tbody/tr[" + (index + 1) + "]/td[3]";}
    public static String MAHS_CELL(int index) {return"//tbody/tr[" + (index + 1) + "]/td[4]";}
    public static String LOP_CELL(int index) {return"//tbody/tr[" + (index + 1) + "]/td[5]";}
    public static String NGAYSINH_CELL(int index) {return"//tbody/tr[" + (index + 1) + "]/td[6]";}
    public static String GIOITINH_CELL(int index) {return"//tbody/tr[" + (index + 1) + "]/td[7]";}
    public static String NAMHOC_CELL(int index) {return"//tbody/tr[" + (index + 1) + "]/td[8]";}
    public static String TRANGTHAI_CELL(int index) {return"//tbody/tr[" + (index + 1) + "]/td[9]";}
    public static String EDIT_CELL_ICON(int index) {return"//tbody/tr[" + (index + 1) + "]/td[10]/button[1]/span[1]/*[1]";}
    public static String EXPORTCARD_CELL_ICON(int index) {return"//tbody/tr[" + (index + 1) + "]/td[10]/button[2]/span[1]/*[1]";}
    public static String LOCK_CELL_ICON(int index) {return"//tbody/tr[" + (index + 1) + "]/td[10]/button[3]/span[1]/*[1]";}
    public static String DELETE_CELL_ICON(int index) {return"//tbody/tr[" + (index + 1) + "]/td[10]/button[4]/span[1]/*[1]";}
    public static final String GIOITINHNAM_OPTIONCLICK = "//option[@value='Nam']";
    public static final String GIOITINHNU_OPTIONCLICK = "//option[@value='Nữ']";
    public static final String NAMHOC_OPTION = "//select[@name='schoolYear']";
    public static final String TRANGTHAIKHOA_OPTION = "//option[@value='Đang bị khóa']";
    public static final String TRANGTHAIKICHHOAT_OPTION = "//option[@value='Đang kích hoạt']";
    public static final String POPUPDELETE_SPAN = "//span[contains(text(),'Bạn có chắn chắn muốn xóa học sinh')]";
    public static final String POPUPDELETEHS_SPAN = "//h3[contains(text(),'Bạn có muốn chắc chắn xóa những học sinh này không')]";
    public static final String CONFIRMDELETE_BTN = "//span[text()= ' Xóa']";
    public static final String CANCELDELETE_BTN = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]";
    public static final String CANCELLOCK_BTN = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]";
    public static final String POPUPLOCK_SPAN = "//span[contains(text(),'Bạn có chắn chắn muốn khóa học sinh')]";
    public static final String CONFIRMLOCK_BTN = "//span[contains(text(),'Khóa')]";

}
