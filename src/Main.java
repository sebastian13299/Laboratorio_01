
import ExamplePack.VentanaPrincipal;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new VentanaPrincipal();
                frame.setSize(600,600);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setTitle("ExamplePack");

            }
        });
    }
}
