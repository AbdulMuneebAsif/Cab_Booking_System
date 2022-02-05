package com.CabBooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin implements ActionListener
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
        adminLoginButton.addActionListener(this);

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

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (userTextField.getText().equals("Osama") && userPasswordField.getText().equals("user"))
        {
            if (actionEvent.getSource() == adminLoginButton)
            {
                userFrame.dispose();
                UserPanel userPanel = new UserPanel();
            }
        }
        else
        {
            successfulLogin.setText("Invalid Login!");
        }
    }
}
