package org.example;

import javax.swing.*;
import com.formdev.flatlaf.FlatLightLaf;


public class Questionnaire {
    private JFrame frame;

    public static void main(String[] args) {
        // Define o tema do panel
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        NewJPanel newJPanel = new NewJPanel();

        JFrame jFrame = new JFrame();

        jFrame.add(newJPanel);

        jFrame.setVisible(true);

        jFrame.setSize(600,800);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    }




