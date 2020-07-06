package behavioral.command;

/**
 *
 * @author TRONG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GioHang gioHang = new GioHang();
        gioHang.xacNhanMuaHang("Bánh quy", 2, 5000);
        gioHang.xacNhanMuaHang("Socola", 5, 10000);
        gioHang.xacNhanMuaHang("Kem", 2, 3000);
        
        gioHang.tinhTienGioHang();
    }
    
}
