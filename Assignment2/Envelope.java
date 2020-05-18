package Assignments.Assignment2;

import javax.swing.*;
import java.awt.*;

public class Envelope {
    public Envelope(){
        JFrame frame = new JFrame("Envelope");
        frame.setSize(450, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    public static void placeComponents(JPanel panel){
        panel.setLayout(null);

        JLabel label1 = new JLabel("Choose your type of package: ");
        label1.setBounds(10,20,250,25);
        panel.add(label1);
        JCheckBox s = new JCheckBox("S");
        s.setBounds(200,20,50,25);
        panel.add(s);
        JCheckBox l = new JCheckBox("L");
        l.setBounds(250,20,50,25);
        panel.add(l);

        JLabel label2 = new JLabel("Package quantity: ");
        label2.setBounds(10,50,250,25);
        panel.add(label2);
        JTextField textField1 = new JTextField(20);
        textField1.setBounds(200,50,200,25);
        panel.add(textField1);

        JLabel label3 = new JLabel("Package Weight: ");
        label3.setBounds(10,80,250,25);
        panel.add(label3);
        JTextField textField2 = new JTextField(20);
        textField2.setBounds(200,80,200,25);
        panel.add(textField2);

        JButton button = new JButton("Confirm");
        button.setBounds(320,130,80,25);
        panel.add(button);
    }
}
