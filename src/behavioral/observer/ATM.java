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
public class ATM 
{
    ATM_Observer observer;
    
    public void thietLapTK(ATM_Observer observer)
    {
        this.observer = observer;
    }
    private boolean KiemTraTienRut(int soTienRut)
    {
        return observer.KiemTraSoDu(soTienRut);
        
    }
    public void rutTien(int soTienRut)
    {
        if(KiemTraTienRut(soTienRut))
            observer.nhanThongBao(soTienRut, "Giao dịch thành công");
        else 
            observer.nhanThongBao(0, "Không đủ số tiền");
    }
    
    //Iobserver
    public static interface ATM_Observer
    {
        boolean KiemTraSoDu(int soTienRut);
        void nhanThongBao(int soTienDaRut, String thongBao);
    }
}
