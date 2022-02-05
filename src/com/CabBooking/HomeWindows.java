package com.CabBooking;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWindows implements ActionListener
{
    JFrame frame = new JFrame("Home Screen");
    JButton AdminButton = new JButton("Admin");
    JButton UserButton = new JButton("User");
    JButton DriverButton = new JButton("Driver ");

    HomeWindows()
    {
        AdminButton.setBounds(100,110,200,40);
        AdminButton.setFocusable(false);
        AdminButton.addActionListener(this);

        UserButton.setBounds(100,160,200,40);
        UserButton.setFocusable(false);
        UserButton.addActionListener(this);

        DriverButton.setBounds(100,210,200,40);
        DriverButton.setFocusable(false);
        DriverButton.addActionListener(this);

        frame.add(AdminButton);
        frame.add(UserButton);
        frame.add(DriverButton);


        frame.setSize(600,450);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == AdminButton)
        {
            frame.dispose();
            AdminLogin adminLogin = new AdminLogin();

        }
        else if (actionEvent.getSource() == UserButton)
        {
            frame.dispose();
            UserLogin userLogin = new UserLogin();
        }
        else if (actionEvent.getSource() == DriverButton)
        {
            frame.dispose();
            DriverLogin driverLogin = new DriverLogin();
        }
}
}
