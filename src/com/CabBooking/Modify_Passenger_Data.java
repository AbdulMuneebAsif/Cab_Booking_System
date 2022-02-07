package com.CabBooking;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;

public class Modify_Passenger_Data implements ActionListener
{
    DefaultTableModel tableModel;
    JTable table;
    JScrollPane scrollPane;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JLabel label;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JPanel panel;
    JButton button1;
    JButton button2;
    JButton button3;
    JFrame frame;

    public void call()
    {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Number");
        tableModel.addColumn("Name");
        tableModel.addColumn("Address");

        table = new JTable(tableModel);

        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(40,40,400,70);

        textField1 = new JTextField();
        textField1.setLocation(200,115);
        textField1.setSize(150,25);

        textField2 = new JTextField();
        textField2.setLocation(200,155);
        textField2.setSize(150,25);

        textField3 = new JTextField();
        textField3.setLocation(200,195);
        textField3.setSize(150,25);

        label = new JLabel("Passenger Data");
        label.setBounds(170,0,115,35);

        label1 = new JLabel("Number");
        label1.setBounds(100,110,150,40);

        label2 = new JLabel("Name");
        label2.setBounds(100,150,150,40);

        label3 = new JLabel("Address");
        label3.setBounds(100,190,150,40);

        panel =new JPanel();
        panel.setLayout(null);
        panel.setSize(750,600);
        panel.setBackground(Color.lightGray);

        button1 = new JButton("ADD");
        button1.setBounds(105,300,70,30);
        button1.setBackground(Color.green);
        button1.setForeground(Color.WHITE);
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2 = new JButton("DELETE");
        button2.setBounds(220,300,100,30);
        button2.setBackground(Color.red);
        button2.setForeground(Color.WHITE);
        button2.setFocusable(false);
        button2.addActionListener(this);

        button3 = new JButton("< BACK");
        button3.setBounds(0,0,100,20);
        button3.setBackground(Color.DARK_GRAY);
        button3.setForeground(Color.WHITE);
        button3.setFocusable(false);
        button3.addActionListener(this);

        panel.add(scrollPane);
        panel.add(label);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(textField3);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame = new JFrame("Passenger Data Modification");
        frame.setBounds(800,250,panel.getWidth(),panel.getHeight());
        frame.setLayout(null);
        frame.add(panel);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == button1) {
            if (!textField1.getText().equals("") && !textField2.getText().equals("") && !textField3.getText().equals("")) {
                String s1 = textField1.getText();
                String s2 = textField2.getText();
                String s3 = textField3.getText();

                String[] strings = {s1, s2, s3};
                tableModel.addRow(strings);
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "please fill all details");
            }
        }
        else if (actionEvent.getSource() == button2)
        {
//            DefaultTableModel model = (DefaultTableModel) table.getModel();
            if (table.getRowCount() >= 1) {
                tableModel.removeRow(table.getSelectedRow());
            }
            else
            {
                return;
            }
        }
        else if (actionEvent.getSource() == button3)
        {

            frame.dispose();
            Admin_Panel return_to_adminPanel_from_user_modification_class = new Admin_Panel();
        }
    }
}
