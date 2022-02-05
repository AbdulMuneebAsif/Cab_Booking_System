package com.CabBooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogin implements ActionListener {
    JFrame adminFrame = new JFrame("Admin Login");

    JLabel userLabel1 = new JLabel("Admin");
    JLabel userLabel2 = new JLabel("Password");
    JLabel successfulLogin = new JLabel(" ");

    JTextField userTextField = new JTextField(25);
    JPasswordField userPasswordField = new JPasswordField();
    JButton adminLoginButton = new JButton("Login");


    AdminLogin() {

        userLabel1.setBounds(15, 25, 85, 30);
        userLabel1.setFont(new Font(null, Font.BOLD, 16));

        userLabel2.setBounds(15, 55, 85, 30);
        userLabel1.setFont(new Font(null, Font.PLAIN, 16));

        userTextField.setBounds(105, 25, 170, 30);

        userPasswordField.setBounds(105, 55, 170, 30);

        adminLoginButton.setBounds(105, 120, 85, 30);
        adminLoginButton.setFocusable(false);
        adminLoginButton.addActionListener(this);

        successfulLogin.setBounds(105, 160, 305, 30);

        adminFrame.add(userLabel1);
        adminFrame.add(userLabel2);
        adminFrame.add(userTextField);
        adminFrame.add(userPasswordField);
        adminFrame.add(adminLoginButton);
        adminFrame.add(successfulLogin);

        adminFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        adminFrame.setSize(420, 420);
        adminFrame.setLayout(null);
        adminFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (userTextField.getText().equals("Muneeb") && userPasswordField.getText().equals("admin"))
        {
            if (actionEvent.getSource() == adminLoginButton)
            {
                adminFrame.dispose();
                AdminPanel adminPanel = new AdminPanel();
            }
        }
        else
        {
            successfulLogin.setText("Invalid Login!");
        }
    }
}
