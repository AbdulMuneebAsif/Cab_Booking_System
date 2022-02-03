package com.CabBooking;

import javax.swing.*;
import java.awt.*;

public class AdminLogin
{
    JFrame adminFrame = new JFrame("Admin Login");
    JLabel adminLabel = new JLabel("hi");

    AdminLogin()
    {

        adminLabel.setBounds(0,0,100,50);
        adminLabel.setFont(new Font(null,Font.BOLD,30));

        adminFrame.add(adminLabel);
        adminFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        adminFrame.setSize(420,420);
        adminFrame.setLayout(null);
        adminFrame.setVisible(true);
    }

}