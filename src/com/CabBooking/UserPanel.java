package com.CabBooking;

import javax.swing.*;
import java.awt.*;

public class UserPanel
{
    UserPanel()
    {
        JFrame user_panel_frame = new JFrame("User Panel");

        JLabel user_label = new JLabel("WELCOME USER");
        user_label.setBounds(30,30,150,110);
        user_label.setForeground(Color.magenta);

        user_panel_frame.add(user_label);
        user_panel_frame.setSize(500,500);
        user_panel_frame.setLayout(null);

        user_panel_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        user_panel_frame.setVisible(true);

    }

}
