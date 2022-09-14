package ExamplePack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Gridlayout extends JFrame {
    private JPanel panelGrid;
    private JButton button1;
    private JButton button4;
    private JButton button3;
    private JButton button2;



    public Gridlayout(){

        setContentPane(panelGrid);

        setLayout(new GridLayout(2,2));


    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null,"Este es el botón 1");

        }
    });


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,"Este es el botón 2");

            }
        });


        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,"Este es el botón 3");

            }
        });


        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,"Este es el botón 4");

            }
        });
    }

}
