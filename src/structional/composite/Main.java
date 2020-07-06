/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structional.composite;

/**
 *
 * @author TRONG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractComposite khoa = new Khoa("Công Nghệ Thông Tin");
        AbstractComposite boMon = new BoMon("Toán");
        AbstractComposite boMon1 = new BoMon("Công nghệ phần mềm");
        
        khoa.add(boMon);
        khoa.add(boMon1);
        
        
        GiangVien giangVien1 = new GiangVien("Nguyễn Viết Trọng");
        
        boMon.add(giangVien1);
        boMon.add(new GiangVien("Ngô Thị Trang"));
        
        boMon1.add(new GiangVien("Hồ Quang Hiếu"));
        
        System.out.println(khoa.show());
    }
    
}
