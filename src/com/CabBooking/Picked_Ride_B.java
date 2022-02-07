package com.CabBooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Picked_Ride_B implements ActionListener
{
    JFrame booking_Details_Panel = new JFrame("Ride Details");
    JButton cancel_ride = new JButton("Cancel");
    JButton complete_ride = new JButton("Completed");

    JLabel Passenger_name = new JLabel("Passenger");
    JLabel Passenger_Contact = new JLabel("Contact No.");
    JLabel Pick_up_location = new JLabel("From");
    JLabel Destination_location = new JLabel("To");

    JTextField name = new JTextField();
    JTextField contact = new JTextField();
    JTextField pick_up_location_of_passenger = new JTextField();
    JTextField Destination_of_passenger = new JTextField();


    Picked_Ride_B()
    {
        booking_Details_Panel.setSize(500,450);
        booking_Details_Panel.setLayout(null);


        cancel_ride.setBounds(100, 280, 110, 30);
        cancel_ride.addActionListener(this);
        cancel_ride.setFocusable(false);

        complete_ride.setBounds(280, 280, 110, 30);
        complete_ride.addActionListener(this);
        complete_ride.setFocusable(false);

        Passenger_name.setBounds(110,90,130,30);
        Passenger_name.setFont( new Font("Serif",Font.BOLD,14));

        Passenger_Contact.setBounds(110,130,130,30);
        Passenger_Contact.setFont( new Font("Serif",Font.BOLD,14));

        Pick_up_location.setBounds(110,170,130,30);
        Pick_up_location.setFont( new Font("Serif",Font.BOLD,14));

        Destination_location.setBounds(110,210,130,30);
        Destination_location.setFont( new Font("Serif",Font.BOLD,16));


        name.setBounds(250,90,140,30);
        name.setFont( new Font("Serif",Font.PLAIN,14));
        name.setText("Mubashir");
        name.setEditable(false);
        name.setBackground(Color.lightGray);

        contact.setBounds(250,130,140,30);
        contact.setFont( new Font("Serif",Font.PLAIN,14));
        contact.setText("03334672459");
        contact.setEditable(false);
        contact.setBackground(Color.lightGray);

        pick_up_location_of_passenger.setBounds(250,170,140,30);
        pick_up_location_of_passenger.setFont( new Font("Serif",Font.PLAIN,14));
        pick_up_location_of_passenger.setText("Faizabad");
        pick_up_location_of_passenger.setEditable(false);
        pick_up_location_of_passenger.setBackground(Color.lightGray);

        Destination_of_passenger.setBounds(250,210,140,30);
        Destination_of_passenger.setFont( new Font("Serif",Font.PLAIN,14));
        Destination_of_passenger.setText("PIMS");
        Destination_of_passenger.setEditable(false);
        Destination_of_passenger.setBackground(Color.lightGray);


        booking_Details_Panel.add(cancel_ride);
        booking_Details_Panel.add(complete_ride);
        booking_Details_Panel.add(Passenger_name);
        booking_Details_Panel.add(Passenger_Contact);
        booking_Details_Panel.add(Pick_up_location);
        booking_Details_Panel.add(Destination_location);

        booking_Details_Panel.add(name);
        booking_Details_Panel.add(contact);
        booking_Details_Panel.add(pick_up_location_of_passenger);
        booking_Details_Panel.add(Destination_of_passenger);

        booking_Details_Panel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        booking_Details_Panel.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == cancel_ride)
        {
            booking_Details_Panel.dispose();
            Cancel_Ride_B cancelRideB = new Cancel_Ride_B();
        }

        else if (actionEvent.getSource() == complete_ride)
        {
            JOptionPane.showMessageDialog(null,"You have completed the ride");
            booking_Details_Panel.dispose();
            Cab_Owner_Panel_C cab_owner_panel_b = new Cab_Owner_Panel_C();
        }
    }
}
