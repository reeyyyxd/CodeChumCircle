import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfRadius;
    private JTextField tfArea;
    private JTextField tfCircumference;
    private JButton btnClear;
    private JButton btnCompute;

        public CircleGUI() {
        btnCompute.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    double rad = Double.parseDouble(tfRadius.getText());
                    final double pi = 3.14159;
                    double area = pi*(rad*rad);
                    double circumference = 2*pi*rad;

                tfArea.setText(String.format("%.2f", area));
                tfCircumference.setText(String.format("%.2f", circumference));
            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfRadius.setText("");
                tfArea.setText("");
                tfCircumference.setText("");
            }
        });
    }

    public static void main(String[] args) {
        CircleGUI app = new CircleGUI();
        app.setContentPane(app.pnlMain);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
