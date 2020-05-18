package Assignments.Assignment2;

import javax.swing.*;
import java.awt.*;

public class NextDayType extends JFrame{
    public NextDayType(){
        JFrame frame = new JFrame("Next-Day Delivery");
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    public static void placeComponents(JPanel panel){
        panel.setLayout(null);
        JLabel label1 = new JLabel("Type of package(Document/Parcel): ");
        label1.setBounds(10,20,250,25);
        panel.add(label1);
        JTextField textField1 = new JTextField(20);
        textField1.setBounds(220,20,150,25);
        panel.add(textField1);

        JLabel label2 = new JLabel("Package Weight: ");
        label2.setBounds(10, 50,250,25 );
        panel.add(label2);
        JTextField  textField2 = new JTextField(20);
        textField2.setBounds(220,50,150,25);
        panel.add(textField2);

        JButton button = new JButton("Confirm");
        button.setBounds(10,80,80,25);
        panel.add(button);
    }

    public static void main(String[] args) {
        new NextDayType();
    }
}
