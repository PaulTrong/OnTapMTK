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
public abstract class AbstractComposite {
    String name;
    String prefix = "";

    public AbstractComposite(String name) {
        this.name = name;
    }
    public abstract void add(AbstractComposite item);
    public abstract String show();
    
}
