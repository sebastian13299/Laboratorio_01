package ExamplePack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayout extends JFrame{
    private JPanel mainPanel;
    private JPanel btnsPanel;
    private JPanel multipPanel;
    private JButton card1Button;
    private JButton card3Button;
    private JButton card2Button;
    private JPanel Card1Panel;
    private JPanel Card2Panel;
    private JPanel Card3Panel;

    public CardLayout() {
        setContentPane(mainPanel);



        card1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multipPanel.removeAll();
                multipPanel.add(Card1Panel);
                multipPanel.repaint();
                multipPanel.revalidate();

            }
        });
        card2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multipPanel.removeAll();
                multipPanel.add(Card2Panel);
                multipPanel.repaint();
                multipPanel.revalidate();

            }
        });
        card3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multipPanel.removeAll();
                multipPanel.add(Card3Panel);
                multipPanel.repaint();
                multipPanel.revalidate();

            }
        });
    }
}
