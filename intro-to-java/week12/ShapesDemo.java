import java.awt.*;         // Use AWT classes
import javax.swing.*;      // Use Swing classes

// Window class extending JFrame
public class ShapesDemo extends JFrame{

    // Constructor of ShapesDemo
    public ShapesDemo(){
        setSize(800,800);                              // Set the window size
        setLocation(50,150);                           // Set the window position
        setTitle("Java Programing ShapesDemo");        // Set the window title
        setDefaultCloseOperation(EXIT_ON_CLOSE);       // Exit when the close button is clicked
        MyJPanel myJPanel = new MyJPanel();            // Create a drawing panel
        Container c = getContentPane();                // Get the frame content pane
        c.add(myJPanel);                               // Add the panel to the frame
        setVisible(true);                              // Display the window
    }

    // Entry point of the program
    public static void main(String[] args){
        new ShapesDemo();   // Create the ShapesDemo window
    }

    // Drawing panel extending JPanel
    public class MyJPanel extends JPanel{

        // Constructor of MyJPanel
        public MyJPanel(){
            // Place for panel initialization
        }

        // Method for drawing on the panel
        public void paintComponent(Graphics g){
            g.drawOval(100,100,200,120);   // Draw an oval
            g.fillOval(420,100,200,120);   // Draw a filled oval
            g.drawLine(100,300,620,300);   // Draw a line
            g.drawRect(100,420,220,160);   // Draw a rectangle
            g.fillRect(420,420,220,160);   // Draw a filled rectangle
        }
    }
}
