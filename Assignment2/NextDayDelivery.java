package Assignments.Assignment2;

import javax.swing.*;
import java.awt.event.*;

public class NextDayDelivery extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;
    private JCheckBox[] zone = new JCheckBox[5];

    public NextDayDelivery() {
        label = new JLabel("Please select your zone");
        label.setBounds(50, 0, 300, 20);
        add(label);

        zone[0] = new JCheckBox("Zone 1");
        zone[0].setBounds(100, 50, 150, 20);
        zone[1] = new JCheckBox("Zone 2");
        zone[1].setBounds(100, 100, 150, 20);
        zone[2] = new JCheckBox("Zone 3");
        zone[2].setBounds(100, 150, 150, 20);
        zone[3] = new JCheckBox("Zone 4");
        zone[3].setBounds(100, 200, 150, 20);
        zone[4] = new JCheckBox("Zone 5");
        zone[4].setBounds(100, 250, 150, 20);

        for (int i = 0; i < 5; i++) {
            add(zone[i]);
            zone[i].addActionListener(this);
        }

        button = new JButton("Confirm");
        button.setBounds(100, 300, 80, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(JCheckBox box: zone){
                    if(box.isSelected()){
                        new NextDayType();
                        dispose();
                    }
                }
            }
        });

        add(button);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Next-Day Delivery");
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        int max = 0;

        for (int i = 0; i < 5; i++) {
            if (zone[i].isSelected()) {
                max++;
            }
        }

        for (JCheckBox box : zone) {
            if (max == 1) {
                if (!box.isSelected()) {
                    box.setEnabled(false);
                }
            } else {
                if (max < 1) {
                    box.setEnabled(true);
                }
            }
        }
    }

    public static void main(String[] args) {
        new NextDayDelivery();
    }
}

