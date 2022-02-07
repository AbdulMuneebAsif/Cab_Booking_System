package com.CabBooking;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.BorderLayout.BEFORE_FIRST_LINE;

public class UserPanel implements ActionListener
{

    JFrame cab_owner_panel_frame;
    JButton back = new JButton("< Back");
    JButton book = new JButton("Book");

    JComboBox Pick_Up;
    JComboBox Destination;

    JLabel estimated_rate = new JLabel("Estimated Rate");
    JTextField rate = new JTextField(" ");

    UserPanel() {

        cab_owner_panel_frame = new JFrame("Passenger Panel");
        cab_owner_panel_frame.setSize(500, 500);
        cab_owner_panel_frame.setLayout(null);

        back.setBounds(0, 0, 100, 20);
        back.addActionListener(this);
        back.setFocusable(false);

        book.setBounds(185, 280, 120, 40);
        book.addActionListener(this);
        book.setFocusable(false);

        estimated_rate.setBounds(90,215,130,30);
        estimated_rate.setFont( new Font("Serif",Font.BOLD,14));

        rate.setBounds(240,215,140,30);
        rate.setBackground(Color.ORANGE);

        rate.setText("");
        rate.setEditable(false);


        String[] pick_up = {"PICK UP", "Sadder", "NUML University", "PIMS"};
        Pick_Up = new JComboBox(pick_up);
        Pick_Up.setBounds(90, 100, 140, 30);
        Pick_Up.setBackground(Color.lightGray);
        Pick_Up.addActionListener(this);

        String[] destination = {"Destination", "Sadder", "NUML University", "PIMS"};
        Destination = new JComboBox(destination);
        Destination.setBounds(240, 100, 140, 30);
        Destination.setBackground(Color.lightGray);
        Destination.addActionListener(this);


        cab_owner_panel_frame.add(back);
        cab_owner_panel_frame.add(book);
        cab_owner_panel_frame.add(Pick_Up);
        cab_owner_panel_frame.add(Destination);
        cab_owner_panel_frame.add(estimated_rate);
        cab_owner_panel_frame.add(rate);


        cab_owner_panel_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cab_owner_panel_frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {



            if (Pick_Up.getSelectedIndex() == 0 || Destination.getSelectedIndex() == 0)
            {
                if (actionEvent.getSource() == book)
                {
                    JOptionPane.showMessageDialog(null,"Please select both");
                }

            }
            else if (Pick_Up.getSelectedIndex() == 1 && Destination.getSelectedIndex() == 1)
            {
                if (actionEvent.getSource() == book)
                {
                    JOptionPane.showMessageDialog(null,"Pick up location & Destination cannot be same");
                }
            }
            else if (Pick_Up.getSelectedIndex() == 1 && Destination.getSelectedIndex() == 2)
            {
                rate.setText("450 - 480 Rs");

                if (actionEvent.getSource() == book)
                {
                    cab_owner_panel_frame.dispose();
                    Booking_Details booking_details = new Booking_Details();
                }

            }
            else if (Pick_Up.getSelectedIndex() == 1 && Destination.getSelectedIndex() == 3)
            {
                rate.setText("600 - 650 Rs");

                if (actionEvent.getSource() == book)
                {
                    cab_owner_panel_frame.dispose();
                    Booking_Details booking_details = new Booking_Details();
                }
            }

            else if (Pick_Up.getSelectedIndex() == 2 && Destination.getSelectedIndex() == 1)
            {
                rate.setText("450 - 490 Rs");

                if (actionEvent.getSource() == book)
                {
                    cab_owner_panel_frame.dispose();
                    Booking_Details booking_details = new Booking_Details();
                }
            }
            else if (Pick_Up.getSelectedIndex() == 2 && Destination.getSelectedIndex() == 2)
            {
                if (actionEvent.getSource() == book)
                {
                    JOptionPane.showMessageDialog(null,"Pick up location & Destination cannot be same");
                }
            }
            else if (Pick_Up.getSelectedIndex() == 2 && Destination.getSelectedIndex() == 3)
            {
                rate.setText("400 - 470 Rs");

                if (actionEvent.getSource() == book)
                {
                    cab_owner_panel_frame.dispose();
                    Booking_Details booking_details = new Booking_Details();
                }
            }

            else if (Pick_Up.getSelectedIndex() == 3  && Destination.getSelectedIndex() == 1)
            {
                rate.setText("600 - 660 Rs");

                if (actionEvent.getSource() == book)
                {
                    cab_owner_panel_frame.dispose();
                    Booking_Details booking_details = new Booking_Details();
                }
            }
            else if (Pick_Up.getSelectedIndex() == 3 &&  Destination.getSelectedIndex() == 2)
            {
                rate.setText("400 - 470 Rs");

                if (actionEvent.getSource() == book)
                {
                    cab_owner_panel_frame.dispose();
                    Booking_Details booking_details = new Booking_Details();
                }
            }
            else if (Pick_Up.getSelectedIndex() == 3 && Destination.getSelectedIndex() == 3)
            {
                if (actionEvent.getSource() == book)
                {
                    JOptionPane.showMessageDialog(null,"Pick up location & Destination cannot be same");
                }
            }
            if (actionEvent.getSource() == back)
            {
                cab_owner_panel_frame.dispose();
                UserLogin Return_to_user_login_page = new UserLogin();
            }
    }
}
