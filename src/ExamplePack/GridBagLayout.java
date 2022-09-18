package ExamplePack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.Objects;

public class GridBagLayout extends JFrame {
    private JComboBox comboBox1;
    private JScrollBar scrollBar1;
    private JTextPane loremIpsumTextPane;
    private JLabel scrollbarValue;
    private JPanel mainGridbagLayoutPanel;
    private JButton showPaneTextButton;
    private JLabel textPaneLabel;
    private JLabel comboBoxValue;

    public GridBagLayout() {

        setContentPane(mainGridbagLayoutPanel);
        scrollBar1.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                scrollbarValue.setText(String.format("Scrollbar value: %s", e.getValue()));
            }
        });

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBoxValue.setText(Objects.requireNonNull(comboBox1.getSelectedItem()).toString());
            }
        });

        showPaneTextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPaneLabel.setText(loremIpsumTextPane.getText());
            }
        });
    }
}
