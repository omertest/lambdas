/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionListener;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author omer.aldur
 */
public class Venster extends JFrame {

    private static final long serialVersionUID = 1L;

    Venster() {
        super("conversie");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField textField = new JTextField();
        JButton buttonHoofdLetters = new JButton("hoofdletters");
        JButton buttonKleineLetters = new JButton("kleine letters");
        buttonHoofdLetters.addActionListener(
                e -> textField.setText(textField.getText().toUpperCase()));
        buttonKleineLetters.addActionListener(
                e -> textField.setText(textField.getText().toLowerCase()));
        add(textField, BorderLayout.NORTH);
        add(buttonHoofdLetters, BorderLayout.WEST);
        add(buttonKleineLetters, BorderLayout.EAST);
        pack();
    }
    
}

 class Main {

        public static void main(String[] args) {new Venster().setVisible(true);}
    }