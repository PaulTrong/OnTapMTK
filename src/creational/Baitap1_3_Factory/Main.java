/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Baitap1_3_Factory;

/**
 *
 * @author TRONG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ShapeFactory hinh = new ShapeFactory();
      Shape ve = hinh.useShape(ShapeType.rectangle);
      System.out.println(ve.toString());
      
      ShapeFactory hinh1 = new ShapeFactory();
      Shape ve1 = hinh1.useShape(ShapeType.rectangle);
      System.out.println(ve1.toString());
    }
    
}
