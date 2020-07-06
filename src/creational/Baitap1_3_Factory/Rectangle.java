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
public class Rectangle extends Shape{
    private String brush;
    private String paper;
    private String frame;

    public Rectangle(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }

    @Override
    public String draw() {
         DrawStr +="Vẽ Hình CHỮ NHẬT bằng" +" -- brush= "+ brush+ ", paper= " +paper +", frame= " + frame;
        return DrawStr;
    }

    
}
