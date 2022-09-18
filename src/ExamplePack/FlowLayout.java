package ExamplePack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

 class  menuItemActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event){
        JDialog dialog = new JDialog(new JFrame("Option Dialog Frame"), "Menu Dialog Box");
        JLabel label = new JLabel(String.format("Option '%s' chosen!", event.getActionCommand()));
        dialog.add(label);
        dialog.setSize(300, 200);
        dialog.setVisible(true);
    }
};

public class FlowLayout extends JFrame{
    private JTextField defaultTextFieldTextField;
    private JTextArea defaultTextAreaTextArea;
    private JList list1;
    private JButton openJDialogButton;
    private JPanel mainFlowLayoutPanel;
    private JButton showFieldTextButton;
    private JButton showAreaTextButton;
    private JButton showSelectedItemsButton;
    private JLabel areaTextLabel;
    private JLabel selectedItemsLabel;
    private JLabel fieldTextLabel;
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
                JDialog dialog = new JDialog(new JFrame("Dialog Frame"), "Dialog Box");
                JLabel label = new JLabel("Default Dialog Box");
                dialog.add(label);
                dialog.setSize(300, 200);
                dialog.setVisible(true);
            }
        });

        showFieldTextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldTextLabel.setText(defaultTextFieldTextField.getText());
            }
        });

        showAreaTextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTextLabel.setText(defaultTextAreaTextArea.getText());
            }
        });

        showSelectedItemsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedItemsLabel.setText("");
                List values = list1.getSelectedValuesList();
                for (Object value : values) {
                    selectedItemsLabel.setText(selectedItemsLabel.getText() + "\n" + (String) value);
                }
            }
        });

        menuItem1.addActionListener(new menuItemActionListener());
        menuItem2.addActionListener(new menuItemActionListener());
        menuItem3.addActionListener(new menuItemActionListener());
    }
}
