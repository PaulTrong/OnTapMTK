package behavioral.command;

/**
 *
 * @author TRONG
 */
public class ChiTietGioHang extends Command{

    String tenMatHang;
    int soLuong, donGia;
    Store store;

    public ChiTietGioHang(String tenMatHang, int soLuong, int donGia, Store store) {
        this.tenMatHang = tenMatHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.store = store;
    }
    
    
    @Override
    public void datHang() {
        store.MuaHang(tenMatHang, soLuong, donGia);
    }
}
