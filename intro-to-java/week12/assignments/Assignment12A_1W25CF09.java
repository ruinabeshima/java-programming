import java.awt.*;       // Use AWT classes
import java.awt.event.*; // Use event-handling classes
import javax.swing.*;    // Use Swing classes

public class Assignment12A_1W25CF09 extends JFrame {

  public Assignment12A_1W25CF09() {
    setSize(500, 300);    
    setLocation(50, 150); 
    setTitle("1W25CF09"); 
    setDefaultCloseOperation(
        EXIT_ON_CLOSE);                
    MyJPanel myJPanel = new MyJPanel(); 
    Container c = getContentPane();   
    c.add(myJPanel);           
    setVisible(true);       
  }

  public static void main(String[] args) { new Assignment12A_1W25CF09(); }

  public class MyJPanel extends JPanel {

    public void paintComponent(Graphics g) {
      Dimension d;
      d = getSize();

      // Draw the x-axis and y-axis with the origin at the center of the panel
      g.setColor(Color.red);
      g.drawLine(0, d.height / 2, d.width, d.height / 2);
      g.drawLine(d.width / 2, 0, d.width / 2, d.height);
      g.drawString("x", d.width - 20, d.height / 2 + 10);
      g.drawString("y", d.width / 2 + 20, 20);

      double x, x1, y1, x2, y2;
      int px1, py1, px2, py2;
      double increment_x = 2.0 / 100.0;

      for (x = -1.0; x < 1.0; x += increment_x) {

        // Calculate two mathematical points (x1,y1) and (x2,y2) for a given x
        x1 = x;
        y1 = -x1 * x1;
        x2 = x + increment_x;
        y2 = -x2 * x2;

        // Convert mathematical coordinates to Java screen coordinates
        px1 = (int)(d.width / 2 + d.width / 2 * x1);
        py1 = (int)(d.height / 2 - d.height / 2 * y1);

        px2 = (int)(d.width / 2 + d.width / 2 * x2);
        py2 = (int)(d.height / 2 - d.height / 2 * y2);

        // Fill the strip between the curve and the x-axis with lightGray
        int axisY = d.height / 2;
        int[] xs = {px1, px2, px2, px1};
        int[] ys = {py1, py2, axisY, axisY};
        g.setColor(Color.lightGray);
        g.fillPolygon(xs, ys, 4);

        g.setColor(Color.blue);
        g.drawLine(px1, py1, px2, py2);
      }
    }
  }
}
