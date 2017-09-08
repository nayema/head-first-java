package com.nayema;

//FLOW LAYOUT

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Main gui = new Main();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button1 = new JButton("shock me!");
        JButton button2 = new JButton("bliss");
        JButton button3 = new JButton("huh?");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame.setContentPane(panel);
        //frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
