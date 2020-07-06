package behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TRONG
 */
public class GioHang 
{
    List<Command> gioHang = new ArrayList<>();
    Store store = new Store();
    public void xacNhanMuaHang(String tenMatHang, int soLuong, int donGia){
        Command ctgh = new ChiTietGioHang(tenMatHang, soLuong, donGia, store);
        ctgh.datHang();
        gioHang.add(ctgh);
    }
    
    public void tinhTienGioHang()
    {
        System.out.println("Tổng tiền hàng: " + store.TongTienGioHang());
    }
}