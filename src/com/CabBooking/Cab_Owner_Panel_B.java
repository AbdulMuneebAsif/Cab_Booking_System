package com.CabBooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cab_Owner_Panel_B implements ActionListener
{
    JFrame booking_Details_Panel = new JFrame("Cab Owner Panel");
    JButton pick_ride = new JButton("PICK");
    JButton decline_ride = new JButton("Decline");
    JButton logout = new JButton("Logout");
    JButton back = new JButton("< BACK");

    JLabel distance = new JLabel("Distance");
    JLabel Time_To_reach = new JLabel("Estimated Time");
    JLabel Pick_up_location = new JLabel("From");
    JLabel Destination_location = new JLabel("To");

    JTextField time = new JTextField();
    JTextField distance_TO_and_from = new JTextField();
    JTextField pick_up_location_of_passenger = new JTextField();
    JTextField Destination_of_passenger = new JTextField();


    Cab_Owner_Panel_B()
    {
        booking_Details_Panel.setSize(500,450);
        booking_Details_Panel.setLayout(null);


        pick_ride.setBounds(30, 280, 110, 30);
        pick_ride.addActionListener(this);
        pick_ride.setFocusable(false);

        decline_ride.setBounds(200, 280, 110, 30);
        decline_ride.addActionListener(this);
        decline_ride.setFocusable(false);

        logout.setBounds(370, 280, 110, 30);
        logout.addActionListener(this);
        logout.setFocusable(false);

        back.setBounds(0, 0, 100, 20);
        back.addActionListener(this);
        back.setFocusable(false);

        Time_To_reach.setBounds(110,90,130,30);
        Time_To_reach.setFont( new Font("Serif",Font.BOLD,14));

        distance.setBounds(110,130,130,30);
        distance.setFont( new Font("Serif",Font.BOLD,14));

        Pick_up_location.setBounds(110,170,130,30);
        Pick_up_location.setFont( new Font("Serif",Font.BOLD,14));

        Destination_location.setBounds(110,210,130,30);
        Destination_location.setFont( new Font("Serif",Font.BOLD,16));


        time.setBounds(250,90,140,30);
        time.setFont( new Font("Serif",Font.PLAIN,14));
        time.setText("7 minutes");
        time.setEditable(false);
        time.setBackground(Color.lightGray);

        distance_TO_and_from.setBounds(250,130,140,30);
        distance_TO_and_from.setFont( new Font("Serif",Font.PLAIN,14));
        distance_TO_and_from.setText("7.2 KM");
        distance_TO_and_from.setEditable(false);
        distance_TO_and_from.setBackground(Color.lightGray);

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


        booking_Details_Panel.add(pick_ride);
        booking_Details_Panel.add(decline_ride);
        booking_Details_Panel.add(logout);
        booking_Details_Panel.add(back);
        booking_Details_Panel.add(distance);
        booking_Details_Panel.add(Time_To_reach);
        booking_Details_Panel.add(Pick_up_location);
        booking_Details_Panel.add(Destination_location);

        booking_Details_Panel.add(distance_TO_and_from);
        booking_Details_Panel.add(time);
        booking_Details_Panel.add(pick_up_location_of_passenger);
        booking_Details_Panel.add(Destination_of_passenger);

        booking_Details_Panel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        booking_Details_Panel.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == pick_ride)
        {
            booking_Details_Panel.dispose();
            Picked_Ride_B picked_ride_a = new Picked_Ride_B();
        }

        else if (actionEvent.getSource() == decline_ride)
        {
            booking_Details_Panel.dispose();
            Cab_Owner_Panel_C cab_owner_panel_b = new Cab_Owner_Panel_C();
        }
        else if (actionEvent.getSource() == logout)
        {
            booking_Details_Panel.dispose();
            Home_Windows return_to_home_windows_from_cab_owner_panel_A = new Home_Windows();
        }
        else if (actionEvent.getSource() == back)
        {
            booking_Details_Panel.dispose();
            Cab_Owner_Login cab_owner_login_a = new Cab_Owner_Login();
        }
    }
}
