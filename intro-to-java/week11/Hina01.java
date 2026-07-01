import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hina01 extends JFrame {

    public Hina01() {
        setSize(800, 500);
        setTitle("Java Programing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        MyJPanel myJPanel = new MyJPanel();
        Container c = getContentPane();
        c.add(myJPanel);
        setVisible(true);
    }

    public static void main(String args[]) {
        new Hina01();
    }

    public class MyJPanel extends JPanel {
        public MyJPanel() {
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval(100, 100, 200, 200);  // 楕円を描く / Draw an oval (outline)
            g.fillOval(300, 100, 400, 200);  // 塗りつぶした楕円を描く / Draw a filled oval
        }
    }
}
