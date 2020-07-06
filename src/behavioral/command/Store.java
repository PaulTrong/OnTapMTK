package behavioral.command;

/**
 *
 * @author TRONG
 */
public class Store {
    int total = 0;

    Store() 
    {       
    }

    public void MuaHang(String tenMatHang, int soLuong, int donGia  )
    {
        total += soLuong * donGia;
        StringBuilder builder = new StringBuilder();
        builder.append("Tên Mặt Hàng: ")
                .append(tenMatHang)
                .append("\t\t Số Lượng: ")
                .append(soLuong)
                .append("\t\t Đơn Giá: ")
                .append(donGia)
                .append("\t\t Thành Tiền: ")
                .append(soLuong * donGia);
        System.out.println(builder.toString());
    }
    
    public int TongTienGioHang()
    {
        return total;
    }
}
