package Assignments.Assignment2;


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JButton b1, b2, b3, b4, b5;
    private JFrame f;

    public MainFrame() {
        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(8, 6));
        mainContainer.setBackground(Color.WHITE);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.GRAY));

        b1 = new JButton("Next-Day Delivery");
        b1.setBounds(50, 50, 360, 40);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NextDayDelivery();
                dispose();
            }
        });
        add(b1);

        b2 = new JButton("Same-Day Delivery");
        b2.setBounds(50, 100, 360, 40);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SameDayDelivery();
                dispose();
            }
        });
        add(b2);

        b3 = new JButton("Prepaid Box and Envelop");
        b3.setBounds(50, 150, 360, 40);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Prepaid();
                dispose();
            }
        });
        add(b3);

        b4 = new JButton("Pos Ekspress");
        b4.setBounds(50, 200, 360, 40);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PosEkspres();
                dispose();
            }
        });
        add(b4);


        b5 = new JButton("Receipt");
        b5.setBounds(50, 250, 360, 40);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Receipt();
                dispose();
            }
        });
        add(b5);

        setTitle("Pos Laju Malaysia");
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}