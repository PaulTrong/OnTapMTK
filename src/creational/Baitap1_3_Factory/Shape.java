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
public abstract class Shape {
    public  String  brush;
    public  String paper;
    public  String frame;
    protected String DrawStr ="";

    public abstract String draw();
    @Override       
    public String toString(){
        return DrawStr;
    }
}
