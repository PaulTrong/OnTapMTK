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
public class GiangVien extends AbstractComposite{

    public GiangVien(String name) {
        super(name);
    }

    @Override
    public void add(AbstractComposite item) {
        // Không làm gì
    }

    @Override
    public String show() {
     return prefix + name;   
    }
}
