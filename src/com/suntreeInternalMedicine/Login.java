package com.suntreeInternalMedicine;

import javax.swing.*;

public class Login {
    private JPanel pane1;
    private JPasswordField passwordField1;
    private JFormattedTextField formattedTextField1;
    private JButton loginButton;

    public static void test(){
        JFrame frame = new JFrame("Login");
        frame.setSize(500,350);
        frame.setContentPane(new Login().pane1);
        System.out.println("TEST");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

