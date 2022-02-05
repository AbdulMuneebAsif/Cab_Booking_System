package com.CabBooking;

import javax.swing.*;
import java.awt.*;

public class Driver_Panel
{
    Driver_Panel()
    {
        JFrame cab_owner_panel_frame = new JFrame("Driver Panel");

        JLabel cab_owner_label = new JLabel("WELCOME Driver");
        cab_owner_label.setBounds(30,30,150,110);
        cab_owner_label.setForeground(Color.magenta);

        cab_owner_panel_frame.add(cab_owner_label);
        cab_owner_panel_frame.setSize(500,500);
        cab_owner_panel_frame.setLayout(null);

        cab_owner_panel_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cab_owner_panel_frame.setVisible(true);

    }

}
