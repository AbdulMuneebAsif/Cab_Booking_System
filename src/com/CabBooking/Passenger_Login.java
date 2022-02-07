package com.CabBooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Passenger_Login implements ActionListener
{
    JFrame userFrame = new JFrame("User Login");
    JLabel userLabel1 = new JLabel("User");
    JLabel userLabel2 = new JLabel("Password");
    JTextField userTextField = new JTextField(25);
    JPasswordField userPasswordField = new JPasswordField();
    JButton adminLoginButton = new JButton("Login");
    JButton BackButton = new JButton("< BACK");
    JLabel successfulLogin = new JLabel(" ");


    Passenger_Login()
    {

        userLabel1.setBounds(15, 55, 85, 30);
        userLabel1.setFont(new Font(null,Font.BOLD,16));

        userLabel2.setBounds(15, 95, 85, 30);
        userLabel1.setFont(new Font(null,Font.PLAIN,16));

        userTextField.setBounds(105, 55, 170, 30);

        userPasswordField.setBounds(105, 95, 170, 30);

        adminLoginButton.setBounds(105, 160, 85, 30);
        adminLoginButton.setFocusable(false);
        adminLoginButton.addActionListener(this);

        BackButton.setBounds(0,0,100,20);
        BackButton.setFocusable(false);
        BackButton.addActionListener(this);

        successfulLogin.setBounds(105, 200, 305, 30);

        userFrame.add(userLabel1);
        userFrame.add(userLabel2);
        userFrame.add(userTextField);
        userFrame.add(userPasswordField);
        userFrame.add(adminLoginButton);
        userFrame.add(BackButton);
        userFrame.add(successfulLogin);

        userFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        userFrame.setSize(380,300);
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
                Passenger_Panel userPanel = new Passenger_Panel();
            }

        }
        else if (actionEvent.getSource() == BackButton)
        {
            userFrame.dispose();
            Home_Windows User_Login_To_Home_Windows_Button = new Home_Windows();
        }
        else
        {
            successfulLogin.setText("Invalid Login!");
        }
    }
}
