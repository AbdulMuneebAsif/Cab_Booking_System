package com.CabBooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogin
{
    JFrame adminFrame = new JFrame("Admin Login");
    JLabel adminLabel1 = new JLabel("Admin");
    JLabel adminLabel2 = new JLabel("Password");
    JTextField adminTextField = new JTextField(25);
    JPasswordField adminPasswordField = new JPasswordField();
    JButton adminLoginButton = new JButton("Login");
    JLabel successfulLogin = new JLabel("login please");


    AdminLogin()
    {

        adminLabel1.setBounds(15, 25, 85, 30);
        adminLabel1.setFont(new Font(null,Font.BOLD,16));

        adminLabel2.setBounds(15, 55, 85, 30);
        adminLabel1.setFont(new Font(null,Font.PLAIN,16));

        adminTextField.setBounds(105, 25, 170, 30);

        adminPasswordField.setBounds(105, 55, 170, 30);

        adminLoginButton.setBounds(105, 120, 85, 30);
        adminLoginButton.setFocusable(false);

        successfulLogin.setBounds(105, 160, 305, 30);

        adminFrame.add(adminLabel1);
        adminFrame.add(adminLabel2);
        adminFrame.add(adminTextField);
        adminFrame.add(adminPasswordField);
        adminFrame.add(adminLoginButton);
        adminFrame.add(successfulLogin);

        adminFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        adminFrame.setSize(420,420);
        adminFrame.setLayout(null);
        adminFrame.setVisible(true);
    }

    public void adminLoginButton(java.awt.event.ActionEvent event) {


        if (adminTextField.getText().equals("Muneeb") && adminPasswordField.getText().equals("Dpdl_29217")) {
            successfulLogin.setText(" Login Successful! ");
        } else {
            successfulLogin.setText("Invalid Login!");
        }
    }
}