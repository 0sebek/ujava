
/**
 * Write a description of class DrawACrate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawACrate
{
    public static void main(String[] args)
    {
        Rectangle face = new Rectangle(20, 30, 100, 40);
        face.draw();
        Line line1 = new Line(20, 30, 50, 10);
        line1.draw();
        Line line2 = new Line(120, 70, 150, 50);
        line2.draw();
        Line line3 = new Line(120, 30, 150, 10);
        line3.draw();
        Line line4 = new Line(50, 10, 150, 10);
        Line line5 = new Line(150, 50, 150, 10);
        line4.draw();
        line5.draw();
    }
}