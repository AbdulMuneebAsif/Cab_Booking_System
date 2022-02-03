package com.CabBooking;

import javax.swing.*;
import java.awt.*;

public class UserLogin
{
    JFrame userFrame = new JFrame("User Login");
    JLabel userLabel1 = new JLabel("User");
    JLabel userLabel2 = new JLabel("Password");
    JTextField userTextField = new JTextField(25);
    JPasswordField userPasswordField = new JPasswordField();
    JButton adminLoginButton = new JButton("Login");
    JLabel successfulLogin = new JLabel(" ");


    UserLogin()
    {

        userLabel1.setBounds(15, 25, 85, 30);
        userLabel1.setFont(new Font(null,Font.BOLD,16));

        userLabel2.setBounds(15, 55, 85, 30);
        userLabel1.setFont(new Font(null,Font.PLAIN,16));

        userTextField.setBounds(105, 25, 170, 30);

        userPasswordField.setBounds(105, 55, 170, 30);

        adminLoginButton.setBounds(105, 120, 85, 30);
        adminLoginButton.setFocusable(false);

        successfulLogin.setBounds(105, 160, 305, 30);

        userFrame.add(userLabel1);
        userFrame.add(userLabel2);
        userFrame.add(userTextField);
        userFrame.add(userPasswordField);
        userFrame.add(adminLoginButton);
        userFrame.add(successfulLogin);

        userFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        userFrame.setSize(420,420);
        userFrame.setLayout(null);
        userFrame.setVisible(true);
    }

    public void adminLoginButton(java.awt.event.ActionEvent event) {


        if (userTextField.getText().equals("Muneeb") && userPasswordField.getText().equals("Dpdl_29217")) {
            successfulLogin.setText(" Login Successful! ");
        } else {
            successfulLogin.setText("Invalid Login!");
        }
    }
}
