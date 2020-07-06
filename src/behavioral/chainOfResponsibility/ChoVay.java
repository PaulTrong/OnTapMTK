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
public class ChoVay {
    String name;
    int from;
    ChoVay next;

    public ChoVay(String name, int from) {
        this.name = name;
        this.from = from;
    }
    
    public ChoVay setNext(ChoVay next){
        this.next = next;
        return this.next;
    }
    
    public String duyetChoVay(int tienVay, String duAn){
        if(tienVay >=from){
            return "CHỨC DANH: " + name + " --- DỰ ÁN: " + duAn + " --- SỐ TIỀN CHO VAY: " + tienVay ;
            
        }
        if(next != null){
            return next.duyetChoVay(tienVay, duAn);
        }
        return "Không thành công";
    }
}
