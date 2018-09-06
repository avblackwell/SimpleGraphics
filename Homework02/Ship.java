
import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Polygon;

import org.w3c.dom.html.HTMLUListElement;

public class Ship {
    int x, y;
    double scale;
    public Ship(int x, int y, double scale) {
        this.x = x;
        this.y = y;
        this.scale = scale;
    }
    private int scale(int size) {
        return (int)(this.scale * size);
    }
    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x + 0, y + 0, scale(500), scale(500));
        g.setColor(Color.BLACK);
        g.drawRect(x + 0, y + 0, scale(500), scale(500));
        
        
        Color brown = new Color(153,102,0); //set color to custom brown
        g.setColor(brown);

        g.drawRect(x + scale(100), y + scale(250), scale(400), scale(100)); //draw body top
        g.fillRect(x + scale(100), y + scale(250), scale(400), scale(100));

        g.fillPolygon (new Polygon
        (   new int[] {x + scale(100), x + scale(200), x + scale(400), x + scale(500)}, //draw upside down trapezoid on bottom 
            new int[]  {y + scale(350), y + scale(450), y + scale(450), y + scale(350)},
            4
        )
        );
        
        g.drawRect(x + scale(250),y + scale(25), scale(10), scale(350)); //draw the flag pole
        g.fillRect(x + scale(250),y + scale(25), scale(10), scale(350));

        Color darkRed = new Color(153,0,0); //new color dark red
        g.setColor(darkRed);

        
        g.fillPolygon (new Polygon
        (   new int[] {x + scale(260), x + scale(450), x + scale(260)}, //draw upside down trapezoid on bottom 
            new int[]  {y + scale(25), y + scale(200), y + scale(200)},
            3
        )
        );
    
    }

}