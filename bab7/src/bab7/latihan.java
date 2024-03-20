/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab7;

/**
 *
 * @author abaym
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class latihan extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JTextField hasilLabel;
    private JPasswordField passwordField;
    private JButton loginButton, cancelButton;

    public latihan() {
        // Create labels and input fields
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        hasilLabel = new JTextField(" ");
        hasilLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Create buttons
        loginButton = new JButton("Login");
        cancelButton = new JButton("Cancel");

        // Add action listeners
        loginButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // Create layout
        GridLayout layout = new GridLayout(4, 2);
        JPanel panel = new JPanel(layout);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(cancelButton);
        panel.add(hasilLabel);

        // Add panel to frame
        add(panel);

        // Set frame properties
        setTitle("Login Page");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            // Validate username and password
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if ("123220079".equals(username) && password.equals("123220079")) {
                hasilLabel.setText("Berhasil");
            } else {
                hasilLabel.setText("Gagal");
            }
        } else if (e.getSource() == cancelButton) {
            dispose(); // Close the frame
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new latihan().setVisible(true));
    }
}
