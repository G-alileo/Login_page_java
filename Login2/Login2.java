import javax.swing.*;

import java.awt.*;

public class Login2 {

    public static void main(String[] args) {
        JFrame f = new JFrame("Login Page");
        f.getContentPane().setBackground(new Color(245, 245, 240)); // light background

        // Main panel to mimic the card look
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        panel.setBounds(30, 20, 380, 370);

        // Title
        JLabel l1 = new JLabel("Log in");
        l1.setFont(new Font("Arial", Font.BOLD, 28));
        l1.setBounds(30, 20, 200, 40);

        // Subtitle
        JLabel l2 = new JLabel("Need a Mailchimp account?");
        l2.setFont(new Font("Arial", Font.PLAIN, 13));
        l2.setBounds(30, 60, 180, 20);

        JLabel l3 = new JLabel("<html><a href='#'style='color:rgb(0,123,128);'>Create an account</a></html>");
        l3.setFont(new Font("Arial", Font.PLAIN, 13));
        l3.setForeground(new Color(0, 123, 128));
        l3.setBounds(200, 60, 150, 20);

        // Username/email
        JLabel l4 = new JLabel("Username or Email");
        l4.setFont(new Font("Arial", Font.BOLD, 14));
        l4.setBounds(30, 95, 200, 20);

        JTextField tf1 = new JTextField();
        tf1.setBounds(30, 120, 320, 35);

        // Password
        JLabel l5 = new JLabel("Password");
        l5.setFont(new Font("Arial", Font.BOLD, 14));
        l5.setBounds(30, 165, 200, 20);

        JPasswordField pf1 = new JPasswordField();
        pf1.setBounds(30, 190, 320, 35);

        JCheckBox showPassword = new JCheckBox("Show");
        showPassword.setBackground(Color.WHITE);
        showPassword.setFont(new Font("Arial", Font.PLAIN, 13));
        showPassword.setForeground(new Color(0, 123, 128));
        showPassword.setBounds(270, 160, 80, 30);

        // Keep me logged in
        JCheckBox keepLoggedIn = new JCheckBox("Keep me logged in");
        keepLoggedIn.setBackground(Color.WHITE);
        keepLoggedIn.setFont(new Font("Arial", Font.BOLD, 13));
        keepLoggedIn.setBounds(30, 235, 200, 30);

        // Log in button
        JButton b1 = new JButton("Log in");
        b1.setBounds(30, 275, 320, 40);
        b1.setBackground(new Color(0, 123, 128));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Arial", Font.BOLD, 16));
        b1.setFocusPainted(false);

        // Links
        JLabel l6 = new JLabel("<html><a href='#' style='color:rgb(0,123,128);'>Forgot username?</a></html>");
        l6.setFont(new Font("Arial", Font.PLAIN, 13));
        // l6.setForeground(new Color(0, 123, 128));
        l6.setBounds(30, 325, 120, 20);

        JLabel l7 = new JLabel("<html><a href='#' style='color:rgb(0,123,128);'>Forgot password?</a></html>");
        l7.setFont(new Font("Arial", Font.PLAIN, 13));
        // l7.setForeground(new Color(0, 123, 128));
        l7.setBounds(150, 325, 120, 20);

        JLabel l8 = new JLabel("<html><a href='#' style='color:rgb(0,123,128);'>Can't log in?</a></html>");
        l8.setFont(new Font("Arial", Font.PLAIN, 13));
        // l8.setForeground(new Color(0, 123, 128));
        l8.setBounds(30, 345, 100, 20);

        // Add components to panel
        panel.add(l1);
        panel.add(l2);
        panel.add(l3);
        panel.add(l4);
        panel.add(tf1);
        panel.add(l5);
        panel.add(pf1);
        panel.add(showPassword);
        panel.add(keepLoggedIn);
        panel.add(b1);
        panel.add(l6);
        panel.add(l7);
        panel.add(l8);

        // Add panel to frame
        f.setLayout(null);
        f.add(panel);

        f.setSize(450, 450);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}