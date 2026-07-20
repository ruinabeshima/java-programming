import java.awt.*;         // Use AWT classes
import javax.swing.*;      // Use Swing classes

// Window class extending JFrame
public class ColorGradientDemo extends JFrame{

    // Constructor of ColorGradientDemo
    public ColorGradientDemo(){
        setSize(800,800);                                  // Set the window size
        setLocation(50,150);                               // Set the window position
        setTitle("Java Programing ColorGradientDemo");     // Set the window title
        setDefaultCloseOperation(EXIT_ON_CLOSE);           // Exit when the close button is clicked
        MyJPanel myJPanel = new MyJPanel();                // Create a drawing panel
        Container c = getContentPane();                    // Get the frame content pane
        c.add(myJPanel);                                   // Add the panel to the frame
        setVisible(true);                                  // Display the window
    }

    // Entry point of the program
    public static void main(String[] args){
        new ColorGradientDemo();   // Create the ColorGradientDemo window
    }

    // Drawing panel extending JPanel
    public class MyJPanel extends JPanel{

        // Constructor of MyJPanel
        public MyJPanel(){
            // Place for panel initialization
        }

        // Method for drawing on the panel
        public void paintComponent(Graphics g){
            int i;
            for (i=0;i<255;i++) {
                g.setColor(new Color(i,0,255-i));
                g.drawLine(i,0,i,300);
            }
        }
    }
}
