package ExamplePack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contenedores extends JFrame {


    private JPanel panel1;
    private JButton salirButton;
    private JButton borderLayoutButton;
    private JLabel tittle;
    private JButton gridLayoutButton;
    private JButton flowLayoutButton;
    private JButton gridBabLayoutButton;
    private JButton cardLayoutButton;


    public Contenedores(){
        setContentPane(panel1);

        //SETEAR ACCIONES AL BOTON borderLayout

        borderLayoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {




            }
        });

        //SETEAR ACCIONES AL BOTON gridLayout
        gridLayoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //DESARROLLAR


            }
        });

        //SETEAR ACCIONES AL BOTON flowLayout
        flowLayoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //DESARROLLAR


            }
        });

        //SETEAR ACCIONES AL BOTON gridBabLayout
        gridBabLayoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //DESARROLLAR


            }
        });

        //SETEAR ACCIONES AL BOTON cardLayout
        cardLayoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //DESARROLLAR


            }
        });






        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });





    }


}
