import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class displayDices2 extends JFrame {
  public displayDices2() {
    setSize(400, 300);
    setLocation(100, 100);
    setTitle("displayDices2");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    MyPanel myPanel = new MyPanel();
    Container c = getContentPane();
    c.add(myPanel);
    setVisible(true);
  }

  public static void main(String[] args) { new displayDices2(); }
}

class MyPanel extends JPanel implements ActionListener {
  JTextField textField1;
  JLabel label1;
  JButton beginButton;
  int face = 1;

  public MyPanel() {
    label1 = new JLabel("Face (1-6): ");
    textField1 = new JTextField("1", 2);
    beginButton = new JButton("Draw");

    add(label1);
    add(textField1);
    add(beginButton);

    beginButton.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == beginButton) {
      face = Integer.parseInt(textField1.getText());
      repaint();
    }
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (face >= 1 && face <= 6) {

      drawDice(g, 100, 100, 120, face);
    }
  }

  public void drawDice(Graphics g, int x, int y, int size, int face) {

    g.setColor(Color.white);
    g.fillRect(x, y, size, size);

    g.setColor(Color.black);
    g.drawRect(x, y, size, size);

    int dotSize = 10;

    int left = x + size / 4;
    int center = x + size / 2;
    int right = x + size * 3 / 4;

    int top = y + size / 4;
    int middle = y + size / 2;
    int bottom = y + size * 3 / 4;

    if (face == 1) {
      drawDot(g, center, middle, dotSize * 2, Color.red);
    } else if (face == 2) {
      drawDot(g, left, top, dotSize, Color.black);
      drawDot(g, right, bottom, dotSize, Color.black);
    } else if (face == 3) {
      drawDot(g, left, top, dotSize, Color.black);
      drawDot(g, center, middle, dotSize, Color.black);
      drawDot(g, right, bottom, dotSize, Color.black);
    } else if (face == 4) {
      drawDot(g, left, top, dotSize, Color.black);
      drawDot(g, left, bottom, dotSize, Color.black);
      drawDot(g, right, top, dotSize, Color.black);
      drawDot(g, right, bottom, dotSize, Color.black);
    } else if (face == 5) {
      drawDot(g, left, top, dotSize, Color.black);
      drawDot(g, left, bottom, dotSize, Color.black);
      drawDot(g, center, middle, dotSize, Color.black);
      drawDot(g, right, top, dotSize, Color.black);
      drawDot(g, right, bottom, dotSize, Color.black);
    } else if (face == 6) {
      drawDot(g, left, top, dotSize, Color.black);
      drawDot(g, left, middle, dotSize, Color.black);
      drawDot(g, left, bottom, dotSize, Color.black);
      drawDot(g, right, top, dotSize, Color.black);
      drawDot(g, right, middle, dotSize, Color.black);
      drawDot(g, right, bottom, dotSize, Color.black);
    }
  }

  public void drawDot(Graphics g, int x, int y, int size, Color color) {
    g.setColor(color);
    g.fillOval(x - size / 2, y - size / 2, size, size);
  }
}