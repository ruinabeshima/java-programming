import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Class which is a window
public class A1_1W25CF09 extends JFrame {
  // Panel
  private MyJPanel myJPanel;
  // Inputs for a, b and c
  private JTextField fieldA, fieldB, fieldC;

  // Constructor class
  public A1_1W25CF09() {
    // Window size
    setSize(800, 800);

    // Window title
    setTitle("y = ax² + bx + c");

    // Program ends when X button closes window
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    // Create the drawing panel and place it in the center of the window
    myJPanel = new MyJPanel();
    getContentPane().add(myJPanel, BorderLayout.CENTER);

    // Create a panel at the top to hold input fields and the button
    JPanel controls = new JPanel();

    // Add label and text field for coefficient a
    controls.add(new JLabel("a"));
    fieldA = new JTextField(5);
    controls.add(fieldA);

    // Add label and text field for coefficient b
    controls.add(new JLabel("b"));
    fieldB = new JTextField(5);
    controls.add(fieldB);

    // Add label and text field for coefficient c
    controls.add(new JLabel("c"));
    fieldC = new JTextField(5);
    controls.add(fieldC);

    // Create the button to trigger plotting
    JButton drawButton = new JButton("Draw");
    controls.add(drawButton);

    // Anonymous class ActionListener
    drawButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {

          // Read each text box and convert from String to Double
          double a = Double.parseDouble(fieldA.getText());
          double b = Double.parseDouble(fieldB.getText());
          double c = Double.parseDouble(fieldC.getText());

          // Store into the panel's fields
          myJPanel.a = a;
          myJPanel.b = b;
          myJPanel.c = c;

          // Repaint
          myJPanel.repaint();

        } catch (NumberFormatException ex) {
          // Show error message if input is not a valid number
          JOptionPane.showMessageDialog(null, "Please enter valid numbers.");
        }
      }
    });

    // Set default initial values for text fields
    fieldA.setText("1.0");
    fieldB.setText("1.0");
    fieldC.setText("1.0");

    // Add the control panel to the top region of the window
    getContentPane().add(controls, BorderLayout.NORTH);

    // Make the GUI window visible
    setVisible(true);
  }

  // Entry point
  public static void main(String[] args) { new A1_1W25CF09(); }

  // Drawing surface
  public class MyJPanel extends JPanel {

    // Variables for coefficients of graph
    public double a = 1.0;
    public double b = 1.0;
    public double c = 1.0;

    // How many pixels represent one unit on the graph
    public double scale = 50;

    // Method automatically called by Swing to render graphics on the panel
    public void paintComponent(Graphics g) {
      // Clears the panel to skip old drawings
      super.paintComponent(g);

      // Get current panel dimensions
      Dimension d = getSize();

      // Set line color for coordinate axes
      g.setColor(Color.red);

      // x-axis
      g.drawLine(0, d.height / 2, d.width, d.height / 2);
      // y-axis
      g.drawLine(d.width / 2, 0, d.width / 2, d.height);

      // Set line color for the graph curve
      g.setColor(Color.blue);

      // Loop across the window horizontally
      for (int px = 0; px < d.width; px++) {

        // Convert screen columns to maths x
        double x = (px - d.width / 2) / scale;

        // Compute y using quadratic formula
        double y = a * x * x + b * x + c;

        // Convert maths y back into a screen row
        int py = d.height / 2 - (int)(y * scale);

        // One pixel dot
        g.drawLine(px, py, px, py);
      }
    }
  }
}