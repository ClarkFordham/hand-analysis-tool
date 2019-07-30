package com.clarkfordham;

import javax.swing.*;

public class GUI
{

    static void createGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Hand Analysis Tool"); //may need to change name later
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hands");
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);
    }
    public static void main( String[] args )
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }
}
