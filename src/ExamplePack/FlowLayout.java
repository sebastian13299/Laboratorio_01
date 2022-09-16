package ExamplePack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayout extends JFrame{
    private JTextField defaultTextFieldTextField;
    private JTextArea defaultTextAreaTextArea;
    private JList list1;
    private JButton openJDialogButton;
    private JPanel mainFlowLayoutPanel;
    private JFrame dialogFrame;

    public FlowLayout() {

        setContentPane(mainFlowLayoutPanel);
        openJDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogFrame = new JFrame("JDialog Frame");
                dialogFrame.setVisible(true);
                JDialog dialog = new JDialog(dialogFrame, "Dialog Box");
                JLabel label = new JLabel("Default Dialog Box");
                dialog.add(label);
                dialog.setSize(300, 200);
                dialog.setVisible(true);
            }
        });
    }
}
