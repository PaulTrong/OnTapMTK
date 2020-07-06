
package creational.Baitap1_3_Factory;

/**
 *
 * @author TRONG
 */
public class Circle extends Shape{
    private String brush;
    private String paper;
    private String frame;

    public Circle(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }

    @Override
    public String draw() {
        DrawStr +="Vẽ Hình TRÒN bằng" +" -- brush= "+ brush+ ", paper= " +paper +", frame= " + frame;
        return DrawStr;
    }
}
