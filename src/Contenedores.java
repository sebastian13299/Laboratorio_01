
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contenedores extends JFrame{


    private JPanel panel1;
    private JButton salirButton;



    public Contenedores(){
        setContentPane(panel1);

        //SETEAR ACCIONES AL BOTON SALIR
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });





    }
}
