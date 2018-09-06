import javax.swing.JComponent;
import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Polygon;

public class Boat extends JComponent {
    int width, height;
    public Boat(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void paintComponent(Graphics g) {
        Color brown = new Color(153,102,0); //set color to custom brown
        g.setColor(brown);

        g.drawRect(100,250,400,100); //draw body top
        g.fillRect(100,250,400,100);

        int[] x = {100, 200, 400, 500}; //draw upside down trapezoid on bottom 
        int[] y = {350, 450, 450, 350};
        g.drawPolygon(x, y, 4);
        g.fillPolygon(x, y, 4);

        g.drawRect(250, 25, 10, 350); //draw the flag pole
        g.fillRect(250, 25, 10, 350);

        Color darkRed = new Color(153,0,0); //new color dark red
        g.setColor(darkRed);

        int[] x1 = {260, 450, 260}; //draw flag
        int[] y1 = {25, 200, 200};
        g.drawPolygon(x1, y1, 3);
        g.fillPolygon(x1,y1,3);
    }
}