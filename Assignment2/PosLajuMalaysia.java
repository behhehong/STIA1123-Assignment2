package Assignments.Assignment2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PosLajuMalaysia{

    public static void main(String[] args) {
        Choice choice = new Choice();
    }
}

class Choice extends MenuItem{
    JButton b1, b2;
    public Choice(){

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        JPanel pTop = new JPanel();
        cp.add(pTop, BorderLayout.NORTH);

        JPanel pCenter = new JPanel();
        cp.add(pCenter, BorderLayout.CENTER);
        pCenter.setBackground(Color.WHITE);

        JLabel jl2 = new JLabel();
        jl2.setText("Welcome To Pos Laju Malaysia");
        pCenter.add(jl2);

        JPanel pBottom = new JPanel();
        cp.add(pBottom, BorderLayout.SOUTH);
        b1 = new JButton("Next");
        b2 = new JButton("Exit");
        pBottom.add(b1);
        pBottom.add(b2);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainFrame().setVisible(true);
                setVisible(false);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setTitle("Pos Laju Malaysia");
        setVisible(true);
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setJMenuBar();
    }

    private void setJMenuBar() {

    }
}