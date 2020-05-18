package Assignments.Assignment2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuItem extends JFrame{

    private JButton button1;
    public MenuItem() {

        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);

        JMenu file = new JMenu("File");
        menubar.add(file);
        JMenuItem open = new JMenuItem("Open");
        JMenuItem settings = new JMenuItem("Settings");
        JMenuItem print = new JMenuItem("Print");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(open);
        file.add(settings);
        file.add(print);
        file.add(exit);

        JMenu edit = new JMenu("Edit");
        menubar.add(edit);
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        JMenuItem delete = new JMenuItem("Delete");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(delete);

        JMenu help = new JMenu("Help");
        menubar.add(help);
        JMenuItem about = new JMenuItem("About");
        help.add(about);

        setTitle("Menu");
        setVisible(true);
        setSize(400, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainFrame().setVisible(true);
                setVisible(false);
            }
        });

        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Identity().setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        new MenuItem();
    }
}