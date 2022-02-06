package com.CabBooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPanel implements ActionListener {
    JFrame frame = new JFrame("Admin Panel");
    JButton cab = new JButton("Modify Cab");
    JButton user = new JButton("Modify Passenger");
    JButton logout = new JButton("Logout");

    AdminPanel()
    {

        cab.setBounds(100,110,200,40);
        cab.setFocusable(false);
        cab.addActionListener(this);

        user.setBounds(100,160,200,40);
        user.setFocusable(false);
        user.addActionListener(this);

        logout.setBounds(100,210,200,40);
        logout.setFocusable(false);
        logout.addActionListener(this);

        frame.add(cab);
        frame.add(user);
        frame.add(logout);

        frame.setSize(400,420);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == cab)
        {
            frame.dispose();
            Modify_cab modify_cab = new Modify_cab();
            modify_cab.call();

        }
        else if (actionEvent.getSource() == user)
        {
            frame.dispose();
            Modify_user modify_user = new Modify_user();
            modify_user.call();
        }
        else if (actionEvent.getSource() == logout)
        {
            frame.dispose();
            HomeWindows return_to_Home_Windows_From_admin_panel = new HomeWindows();
        }

    }
}
