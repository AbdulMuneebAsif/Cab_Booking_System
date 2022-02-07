package com.CabBooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Driver_Panel implements ActionListener
{
    JFrame cab_owner_panel_frame;
    JButton back = new JButton("< Back");
    Driver_Panel()
    {
        cab_owner_panel_frame = new JFrame("Driver Panel");

        JLabel cab_owner_label = new JLabel("WELCOME Driver");
        cab_owner_label.setBounds(30,30,150,110);

        cab_owner_panel_frame.add(cab_owner_label);
        cab_owner_panel_frame.setSize(500,500);
        cab_owner_panel_frame.setLayout(null);

        back.setBounds(0,0,100,20);
        back.addActionListener(this);
        back.setFocusable(false);


        cab_owner_panel_frame.add(back);
        cab_owner_panel_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cab_owner_panel_frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == back)
        {
            cab_owner_panel_frame.dispose();
            DriverLogin driverLogin1 = new DriverLogin();
        }

    }
}
