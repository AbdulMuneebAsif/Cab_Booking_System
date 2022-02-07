package com.CabBooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Booking_Details implements ActionListener
{
    JFrame booking_Details_Panel = new JFrame("Booking Details");
    JButton cancel = new JButton("Cancel");

    JLabel Driver_name = new JLabel("Captain");
    JLabel Driver_Time_To_reach = new JLabel("Estimated Time");
    JLabel Driver_Contact = new JLabel("Contact No.");
    JLabel Cab_Number = new JLabel("Cab Number");

    JTextField name = new JTextField();
    JTextField time = new JTextField();
    JTextField contact = new JTextField();
    JTextField number_plate = new JTextField();


    Booking_Details()
    {
        booking_Details_Panel.setSize(500,500);
        booking_Details_Panel.setLayout(null);


        cancel.setBounds(30, 280, 110, 30);
        cancel.addActionListener(this);
        cancel.setFocusable(false);

        Driver_name.setBounds(110,50,130,30);
        Driver_name.setFont( new Font("Serif",Font.BOLD,14));

        Driver_Contact.setBounds(110,90,130,30);
        Driver_Contact.setFont( new Font("Serif",Font.BOLD,14));

        Driver_Time_To_reach.setBounds(110,130,130,30);
        Driver_Time_To_reach.setFont( new Font("Serif",Font.BOLD,14));

        Cab_Number.setBounds(110,170,130,30);
        Cab_Number.setFont( new Font("Serif",Font.BOLD,14));


        name.setBounds(250,50,130,30);
        name.setFont( new Font("Serif",Font.PLAIN,14));
        name.setText("Hamza");
        name.setEditable(false);

        contact.setBounds(250,90,130,30);
        contact.setFont( new Font("Serif",Font.PLAIN,14));
        contact.setText("03415613786");
        contact.setEditable(false);

        time.setBounds(250,130,130,30);
        time.setFont( new Font("Serif",Font.PLAIN,14));
        time.setText("5 minutes");
        time.setEditable(false);

        number_plate.setBounds(250,170,130,30);
        number_plate.setFont( new Font("Serif",Font.PLAIN,14));
        number_plate.setText("LHR-3854");
        number_plate.setEditable(false);




        booking_Details_Panel.add(cancel);
        booking_Details_Panel.add(Driver_name);
        booking_Details_Panel.add(Driver_Contact);
        booking_Details_Panel.add(Driver_Time_To_reach);
        booking_Details_Panel.add(Cab_Number);

        booking_Details_Panel.add(name);
        booking_Details_Panel.add(contact);
        booking_Details_Panel.add(time);
        booking_Details_Panel.add(number_plate);

        booking_Details_Panel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        booking_Details_Panel.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == cancel)
        {
            booking_Details_Panel.dispose();
            UserPanel Return_to_user_panel = new UserPanel();
        }
    }
}
