package ExamplePack;

import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class GridBagLayout extends JFrame {
    private JComboBox comboBox1;
    private JScrollBar scrollBar1;
    private JTextPane loremIpsumDolorSitTextPane;
    private JLabel scrollbarValue;
    private JPanel mainGridbagLayoutPanel;

    public GridBagLayout() {

        setContentPane(mainGridbagLayoutPanel);
        scrollBar1.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                scrollbarValue.setText(String.format("Scrollbar value: %s", e.getValue()));
            }
        });
    }
}
