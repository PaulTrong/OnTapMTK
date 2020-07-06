/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chainOfResponsibility;

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
        ChoVay chuTich = new ChoVay("Chủ Tịch", 10000000);
        chuTich.setNext(new ChoVay("Giam Đốc", 8000000))
                .setNext(new ChoVay("Trưởng Phòng", 5000000))
                .setNext(new ChoVay("Phó Trưởng Phòng", 0));
        
        System.out.println(chuTich.duyetChoVay(13000000, "Xây dựng khu vui chơi giải trí"));
        System.out.println(chuTich.duyetChoVay(9000000, "Xây dựng khu vui chơi giải trí"));
        System.out.println(chuTich.duyetChoVay(7000000, "Xây dựng khu vui chơi giải trí"));
        System.out.println(chuTich.duyetChoVay(3000000, "Xây dựng khu vui chơi giải trí"));
        System.out.println(chuTich.duyetChoVay(-1, "Xây dựng khu vui chơi giải trí"));
        
    }
    
}
