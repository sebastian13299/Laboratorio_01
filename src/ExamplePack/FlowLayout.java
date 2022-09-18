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
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem1, menuItem2, menuItem3;

    public FlowLayout() {

        setContentPane(mainFlowLayoutPanel);
        menuBar = new JMenuBar();
        menu = new JMenu("Options Menu");
        menuItem1 = new JMenuItem("Option 1");
        menuItem2 = new JMenuItem("Option 2");
        menuItem3 = new JMenuItem("Option 3");

        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        menuBar.add(menu);
        this.setJMenuBar(menuBar);
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
