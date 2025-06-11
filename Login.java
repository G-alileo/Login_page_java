import java.awt.*;
import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        // frame
        JFrame f = new JFrame("Login Page");
        f.getContentPane().setBackground(new Color(0, 123, 167));
        f.setLayout(null);

        // white panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        panel.setBounds(80, 40, 440, 520);

        // BUTTON
        JButton b1 = new JButton("SIGN IN");
        b1.setBounds(45, 300, 350, 40);
        b1.setBackground(new Color(0, 123, 167));
        b1.setForeground(Color.WHITE);

        // labels
        JLabel l1 = new JLabel("Login", SwingConstants.CENTER);
        l1.setFont(new Font("Arial", Font.BOLD, 28));
        l1.setBounds(0, 20, 440, 40);

        JLabel l2 = new JLabel("Email:");
        l2.setBounds(45, 80, 100, 30);

        JLabel l3 = new JLabel("Password:");
        l3.setBounds(45, 160, 100, 30);

        JLabel l4 = new JLabel("Forgot");
        l4.setBounds(45, 370, 60, 30);

        JLabel l5 = new JLabel("Don't have an account?");
        l5.setBounds(45, 400, 200, 30);

        JLabel l6 = new JLabel("Username / Password?");
        l6.setForeground(new Color(0, 123, 167));
        l6.setBounds(85, 370, 150, 30);

        JLabel l7 = new JLabel("Sign up");
        l7.setForeground(new Color(0, 123, 167));
        l7.setBounds(180, 400, 100, 30);

        // textfields
        JTextField tf1 = new JTextField("Enter email");
        JTextField tf2 = new JTextField("Enter password");
        tf1.setBounds(45, 110, 350, 40);
        tf2.setBounds(45, 190, 350, 40);

        // CHECKBOX
        JCheckBox checkBox1 = new JCheckBox("Show password");
        checkBox1.setBounds(45, 240, 200, 30);
        checkBox1.setBackground(Color.WHITE);

        // add to panel
        panel.add(l1);
        panel.add(l2);
        panel.add(tf1);
        panel.add(l3);
        panel.add(tf2);
        panel.add(checkBox1);
        panel.add(b1);
        panel.add(l4);
        panel.add(l5);
        panel.add(l6);
        panel.add(l7);

        // add panel to frame
        f.add(panel);

        f.setSize(600, 650);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
