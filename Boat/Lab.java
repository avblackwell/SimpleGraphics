import java.awt.Graphics;
import javax.swing.JFrame;

public class Lab {
  public static void main(String[] args) {
    JFrame a = new JFrame(); 
    int width = 600, height = 450; 
    a.setVisible(true); 
    a.setSize(width+20, height+40); 
    // how can you determine 20, 40 dynamically? 
    Boat b = new Boat(width, height); 
    a.add(b);     
  }
}
