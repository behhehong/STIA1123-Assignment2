package Assignments.Assignment2;

import javax.swing.*;

public class PosEkspres2 {
    public PosEkspres2(){
        JFrame frame = new JFrame("Pos Ekspres");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    public static void placeComponents(JPanel panel){
        panel.setLayout(null);

        JLabel label1 = new JLabel("Package Quantity: ");
        label1.setBounds(10,20,150,25);
        panel.add(label1);
        JTextField textField1 = new JTextField(20);
        textField1.setBounds(120,20,250,25);
        panel.add(textField1);

        JLabel label2 = new JLabel("Package Weight: ");
        label2.setBounds(10,50,150,25);
        panel.add(label2);
        JTextField textField2 = new JTextField(20);
        textField2.setBounds(120,50,250,25);
        panel.add(textField2);

        JButton button = new JButton("Confirm");
        button.setBounds(290,100,80,25);
        panel.add(button);
    }

    public static void main(String[] args) {
        new PosEkspres2();
    }
}
