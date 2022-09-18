package ExamplePack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {

    //prueba
    private JPanel panel1;
    private JButton salirButton;
    private JButton borderLayoutButton;
    private JLabel tittle;
    private JButton gridLayoutButton;
    private JButton flowLayoutButton;
    private JButton gridBagLayoutButton;
    private JButton cardLayoutButton;
    private JButton acercaDeButton;


    public VentanaPrincipal(){
        setContentPane(panel1);

        //SETEAR ACCIONES AL BOTON borderLayout


        borderLayoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JFrame frame = new Borderlayout();
                        frame.setSize(500,500);
                        frame.setVisible(true);
                        frame.setLocationRelativeTo(null);
                        frame.setTitle("Border layout example");

                    }
                });


            }
        });

        //SETEAR ACCIONES AL BOTON gridLayout
        gridLayoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JFrame frame = new Gridlayout();
                        frame.setSize(500,500);
                        frame.setVisible(true);
                        frame.setLocationRelativeTo(null);
                        frame.setTitle("Grid layout example");

                    }
                });


            }
        });

        //SETEAR ACCIONES AL BOTON flowLayout
        flowLayoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JFrame layoutFrame = new FlowLayout();
                        layoutFrame.setSize(600, 600);
                        layoutFrame.setTitle("Flow Layout Example");
                        layoutFrame.setVisible(true);
                    }
                });
            }
        });

        //SETEAR ACCIONES AL BOTON gridBabLayout
        gridBagLayoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JFrame gridBagLayout = new GridBagLayout();
                        gridBagLayout.setSize(600, 600);
                        gridBagLayout.setTitle("Grid Bag Layout Example");
                        gridBagLayout.setVisible(true);
                    }
                });
            }
        });

        //SETEAR ACCIONES AL BOTON cardLayout
        cardLayoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame cardFrame = new CardLayout();
                cardFrame.setSize(600,600);
                cardFrame.setLocationRelativeTo(null);
                cardFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                cardFrame.setTitle("Card Layout Example");
                cardFrame.setVisible(true);


            }
        });






        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });


        acercaDeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Estos son los Integrantes del Grupor \n Sebastian Barahona Valverde \n Leonardo Sanchez \n Jose Pablo Diaz");
            }
        });
    }


}
