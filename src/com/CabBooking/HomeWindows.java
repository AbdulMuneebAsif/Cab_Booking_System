package com.CabBooking;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWindows implements ActionListener
{
    JFrame frame = new JFrame("Home Screen");
    JButton AdminButton = new JButton("Admin");
    JButton UserButton = new JButton("User");

    HomeWindows()
    {
        AdminButton.setBounds(100,160,200,40);
        AdminButton.setFocusable(false);
        AdminButton.addActionListener(this);

        UserButton.setBounds(100,200,200,40);
        UserButton.setFocusable(false);
        UserButton.addActionListener(this);

        frame.add(AdminButton);
        frame.add(UserButton);


        frame.setSize(420,420);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == AdminButton  )
        {
            frame.dispose();
            AdminLogin adminLogin = new AdminLogin();

        }
        else if (actionEvent.getSource() == UserButton)
        {
            frame.dispose();
            UserLogin userLogin = new UserLogin();
        }
}
}
