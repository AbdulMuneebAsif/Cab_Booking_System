package com.CabBooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin
{

    JFrame adminFrame = new JFrame("User Login");
    JLabel userLabel = new JLabel("hollow");

    UserLogin()
    {

        userLabel.setBounds(0,0,100,50);
        userLabel.setFont(new Font(null,Font.BOLD,30));

        adminFrame.add(userLabel);
        adminFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        adminFrame.setSize(420,420);
        adminFrame.setLayout(null);
        adminFrame.setVisible(true);
    }

}
