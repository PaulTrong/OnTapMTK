/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer;

/**
 *
 * @author TRONG
 */
public class TaiKhoan implements ATM.ATM_Observer{
    int soDu;

    public TaiKhoan(int soDu) {
        this.soDu = soDu;
    }
    
    @Override
    public boolean KiemTraSoDu(int soTienRut) 
    {
        return soDu>=soTienRut;
    }

    @Override
    public void nhanThongBao(int soTienDaRut, String thongBao) {
        soDu -= soTienDaRut;
        System.out.println(thongBao);
        System.out.println("Bạn đã rút được: " + soTienDaRut);
        System.out.println("Số dư tài khoản: " + soDu);
        
    }
    
}
