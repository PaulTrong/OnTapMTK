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
public  class ShapeFactory {
    protected  Shape createShape(ShapeType type){
            switch(type){
            case rectangle: return new Rectangle("Nhỏ", "A4", "Chữ Nhật");
            case circle: return new Circle("Thư pháp", "A4", "Tròn");
            case triangle: return new Triangle("Lớn", "A3", "Tam giác");
        }
        return null;
    }
    public Shape useShape(ShapeType type){
        Shape shape = createShape(type);
        shape.draw();
        return shape;
    }
}
