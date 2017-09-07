package com.nayema;

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

        JButton east = new JButton("EAST");
        JButton west = new JButton("WEST");
        JButton north = new JButton("NORTH");
        JButton south = new JButton("SOUTH");
        JButton center = new JButton("CENTER");

        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
