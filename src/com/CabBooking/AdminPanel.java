package com.CabBooking;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPanel implements ActionListener {
    JFrame frame = new JFrame("Admin Panel");
    JButton cab = new JButton("CAB");
    JButton user = new JButton("USER");

    AdminPanel()
    {

        cab.setBounds(100,110,200,40);
        cab.setFocusable(false);
        cab.addActionListener(this);

        user.setBounds(100,160,200,40);
        user.setFocusable(false);
        user.addActionListener(this);

        frame.add(cab);
        frame.add(user);

        frame.setSize(420,420);
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

    }
}
