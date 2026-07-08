import java.awt.*;         // Use AWT classes
import java.awt.event.*;   // Use event-handling classes
import javax.swing.*;      // Use Swing classes

// Window class extending JFrame
public class Graph1 extends JFrame{

    // Constructor of Graph1
    public Graph1(){
        setSize(800,800);                              // Set the window size
        setLocation(50,150);                           // Set the window position
        setTitle("Java Programing Graph1");            // Set the window title
        setDefaultCloseOperation(EXIT_ON_CLOSE);       // Exit when the close button is clicked
        MyJPanel myJPanel = new MyJPanel();            // Create a drawing panel
        Container c = getContentPane();                // Get the frame content pane
        c.add(myJPanel);                               // Add the panel to the frame
        setVisible(true);                              // Display the window
    }

    // Entry point of the program
    public static void main(String[] args){
        new Graph1();   // Create the Graph1 window
    }

    // Drawing panel extending JPanel
    public class MyJPanel extends JPanel{

        // Constructor of MyJPanel
        public MyJPanel(){
            // Place for panel initialization
        }

        // Method for drawing on the panel
        public void paintComponent(Graphics g){
            Dimension d;                    // Variable for the panel size
            d = getSize();                  // Get the panel size

            g.setColor(Color.red);          // Set the drawing color to red
            g.drawLine(0,d.height/2,d.width,d.height/2);   // Draw the x-axis
            g.drawLine(d.width/2,0,d.width/2,d.height);     // Draw the y-axis
            g.drawString("x",d.width-20,d.height/2+10);     // x-axis label
            g.drawString("y",d.width/2+20,20);              // y-axis label
        }
    }
}
