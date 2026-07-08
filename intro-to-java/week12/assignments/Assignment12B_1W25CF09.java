package assignments;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Assignment12B_1W25CF09 extends JFrame {

  public Assignment12B_1W25CF09() {
    setSize(500, 400);
    setLocation(50, 150);
    setTitle("1W25CF09");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    MyJPanel myJPanel = new MyJPanel();
    Container c = getContentPane();
    c.add(myJPanel);
    setVisible(true);
  }

  public static void main(String[] args) { new Assignment12B_1W25CF09(); }

  public class MyJPanel extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);

      int size = 80; // Side length of dice
      int gap = 30;  // Space between dice
      int startX = 60, startY = 40;
      int pip = 14; // Diameter of pip

      for (int row = 0; row < 2; row++) {
        for (int col = 0; col < 3; col++) {
          int x = startX + col * (size + gap);
          int y = startY + row * (size + gap);

          // Draw the die outline
          g.setColor(Color.black);
          g.drawRect(x, y, size, size);

          // Determine which face this is: 1,2,3 on top row; 4,5,6 on bottom
          int face = row * 3 + col + 1;

          // The 7 possible pip positions inside the square (centers of a 3x3
          // grid)
          int cx1 = x + size / 4, cx2 = x + size / 2, cx3 = x + 3 * size / 4;
          int cy1 = y + size / 4, cy2 = y + size / 2, cy3 = y + 3 * size / 4;

          // Draw the pips for this face
          switch (face) {
          case 1:
            g.setColor(Color.red);
            drawPip(g, cx2, cy2, pip);
            break;
          case 2:
            g.setColor(Color.black);
            drawPip(g, cx1, cy1, pip);
            drawPip(g, cx3, cy3, pip);
            break;
          case 3:
            g.setColor(Color.black);
            drawPip(g, cx1, cy1, pip);
            drawPip(g, cx2, cy2, pip);
            drawPip(g, cx3, cy3, pip);
            break;
          case 4:
            g.setColor(Color.black);
            drawPip(g, cx1, cy1, pip);
            drawPip(g, cx3, cy1, pip);
            drawPip(g, cx1, cy3, pip);
            drawPip(g, cx3, cy3, pip);
            break;
          case 5:
            g.setColor(Color.black);
            drawPip(g, cx1, cy1, pip);
            drawPip(g, cx3, cy1, pip);
            drawPip(g, cx2, cy2, pip);
            drawPip(g, cx1, cy3, pip);
            drawPip(g, cx3, cy3, pip);
            break;
          case 6:
            g.setColor(Color.black);
            drawPip(g, cx1, cy1, pip);
            drawPip(g, cx3, cy1, pip);
            drawPip(g, cx1, cy2, pip);
            drawPip(g, cx3, cy2, pip);
            drawPip(g, cx1, cy3, pip);
            drawPip(g, cx3, cy3, pip);
            break;
          }
        }
      }
    }

    // Draw one pip centered at (cx, cy) with the given diameter
    private void drawPip(Graphics g, int cx, int cy, int diameter) {
      g.fillOval(cx - diameter / 2, cy - diameter / 2, diameter, diameter);
    }
  }
}
