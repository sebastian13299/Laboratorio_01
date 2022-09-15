package ExamplePack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Borderlayout extends JFrame {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel panelBorder;

    public Borderlayout(){

        setContentPane(panelBorder);

        setLayout(new BorderLayout());

        add(button1 , BorderLayout.NORTH);
        add(button2 , BorderLayout.SOUTH);
        add(button3 , BorderLayout.WEST);
        add(button4 , BorderLayout.EAST);




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
