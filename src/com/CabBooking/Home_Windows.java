package com.CabBooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home_Windows implements ActionListener {
    JFrame frame = new JFrame("Home Screen");
    JButton AdminButton = new JButton("Login as Admin");
    JButton UserButton = new JButton("Login as User");
    JButton DriverButton = new JButton("Login as Driver ");

    Home_Windows() {

        AdminButton.setBounds(100, 110, 200, 40);
        AdminButton.setFocusable(false);
        AdminButton.addActionListener(this);

        UserButton.setBounds(100, 160, 200, 40);
        UserButton.setFocusable(false);
        UserButton.addActionListener(this);

        DriverButton.setBounds(100, 210, 200, 40);
        DriverButton.setFocusable(false);
        DriverButton.addActionListener(this);

        frame.add(AdminButton);
        frame.add(UserButton);
        frame.add(DriverButton);


        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == AdminButton) {
            frame.dispose();
            Admin_Login adminLogin = new Admin_Login();

        } else if (actionEvent.getSource() == UserButton) {
            frame.dispose();
            Passenger_Login userLogin = new Passenger_Login();
        } else if (actionEvent.getSource() == DriverButton) {
            frame.dispose();
            Cab_Owner_Login driverLogin = new Cab_Owner_Login();
        }
    }
}
