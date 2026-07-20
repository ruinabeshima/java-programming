import java.awt.*;         // Use AWT classes
import javax.swing.*;      // Use Swing classes

// Window class extending JFrame
public class Graph2 extends JFrame{

    // Constructor of Graph2
    public Graph2(){
        setSize(800,800);                              // Set the window size
        setLocation(50,150);                           // Set the window position
        setTitle("Java Programing Graph2");            // Set the window title
        setDefaultCloseOperation(EXIT_ON_CLOSE);       // Exit when the close button is clicked
        MyJPanel myJPanel = new MyJPanel();            // Create a drawing panel
        Container c = getContentPane();                // Get the frame content pane
        c.add(myJPanel);                               // Add the panel to the frame
        setVisible(true);                              // Display the window
    }

    // Entry point of the program
    public static void main(String[] args){
        new Graph2();   // Create the Graph2 window
    }

    // Drawing panel extending JPanel
    public class MyJPanel extends JPanel{

        // Method for drawing on the panel
        public void paintComponent(Graphics g){

            // ----------------------------------------------------------------
            // Draw the graph area
            // ----------------------------------------------------------------
            // Get the current panel size and use it to determine the origin and scale
            Dimension d;                    // Variable for the panel size
            d = getSize();                  // Get the panel size

            // Draw the x-axis and y-axis with the origin at the center of the panel
            g.setColor(Color.red);          // Set the drawing color to red
            g.drawLine(0,d.height/2,d.width,d.height/2);   // Draw the x-axis
            g.drawLine(d.width/2,0,d.width/2,d.height);     // Draw the y-axis
            g.drawString("x",d.width-20,d.height/2+10);     // x-axis label
            g.drawString("y",d.width/2+20,20);              // y-axis label

            // ----------------------------------------------------------------
            // Draw the graph curve
            // ----------------------------------------------------------------
            // Variables for calculating two neighboring points on y=x^2
            double x, x1, y1, x2, y2;

            // Screen coordinates after converting mathematical coordinates to Java coordinates
            int px1, py1, px2, py2;

            // -1 <= x <= 1 the range is divided into 100 parts
            double increment_x = 2.0 / 100.0;

            // Calculate neighboring points on y=x^2 and connect them to form a parabola
            for(x=-1.0; x<1.0; x+=increment_x){

                // Calculate two mathematical points (x1,y1) and (x2,y2) for a given x
                x1 = x;
                y1 = x1*x1;
                x2 = x+increment_x;
                y2 = x2*x2;

                // Convert mathematical coordinates to Java screen coordinates
                px1 = (int)(d.width/2 + d.width/2*x1);       // Map x=-1 to left, x=0 to center, and x=1 to right
                py1 = (int)(d.height/2 - d.height/2*y1);     // Reverse the sign because Java's y-axis points downward
                px2 = (int)(d.width/2 + d.width/2*x2);       // Convert the second x-coordinate in the same way
                py2 = (int)(d.height/2 - d.height/2*y2);     // Convert the second y-coordinate in the same way

                // Connect the converted points and draw one part of y=x^2
                g.setColor(Color.blue);
                g.drawLine(px1,py1,px2,py2);
            }
        }
    }
}
