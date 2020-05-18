package Assignments.Assignment2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prepaid extends JFrame implements ActionListener{
    private JButton button;
    private JLabel label;
    private JRadioButton envelope, prepaid;

    public Prepaid() {
        label = new JLabel("Please select your type of package");
        label.setBounds(50, 50, 300, 20);
        add(label);

        envelope = new JRadioButton("Envelope");
        envelope.setBounds(100, 100, 150, 20);
        envelope.addActionListener(this);
        prepaid = new JRadioButton("Prepaid Box");
        prepaid.setBounds(100, 150, 150, 20);
        prepaid.addActionListener(this);
        add(envelope);
        add(prepaid);

        button = new JButton("Confirm");
        button.setBounds(100, 200, 80, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(envelope.isSelected()){
                    new Envelope();
                    dispose();
                }
                else{
                    new PrepaidBox();
                    dispose();
                }
            }
        });

        add(button);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Prepaid Box and Envelope");
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(envelope.isSelected()){
            prepaid.setEnabled(false);
        }
        else{
            prepaid.setEnabled(true);
        }

        if(prepaid.isSelected()){
            envelope.setEnabled(false);
        }
        else{
            envelope.setEnabled(true);
        }

    }

    public static void main(String[] args) {
        new Prepaid();
    }


}
