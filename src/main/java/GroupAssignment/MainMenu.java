package GroupAssignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainMenu extends JFrame {
    private JButton b1, b2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private int total1;
    private int total2;
    private int total3 = 6537765;
    private int case1 = 0;
    private int case2 = 0;
    private int case3 = 0;
    private int case4 = 0;
    private int case5 = 0;
    private int death1 = 0;
    private int death2 = 0;
    private int death3 = 0;
    private int death4 = 0;
    private int death5 = 0;

    public MainMenu(){
        b1 = new JButton("Next");
        b1.setBounds(108,430,100,50);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }

                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Details().setVisible(true);
                    }
                });
                dispose();
            }
        });
        add(b1);

        b2 = new JButton("Exit");
        b2.setBounds(292,430,100,50);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(b2);

        File file1 = new File("Malaysia New Case.txt");
        File file2 = new File("Malaysia New Death.txt");
        File file3 = new File("Malaysia TotalCase.txt");
        File file4 = new File("Malaysia TotalDeath.txt");
        File file5 = new File("USA New Case.txt");
        File file6 = new File("USA New Death.txt");
        File file7 = new File("USA TotalCase.txt");
        File file8 = new File("USA TotalDeath.txt");
        File file9 = new File("Brazil New Case.txt");
        File file10 = new File("Brazil New Death.txt");
        File file11 = new File("Brazil TotalCase.txt");
        File file12 = new File("Brazil TotalDeath.txt");
        File file13 = new File("India New Case.txt");
        File file14 = new File("India New Death.txt");
        File file15 = new File("India TotalCase.txt");
        File file16 = new File("India TotalDeath.txt");
        File file17 = new File("China New Case.txt");
        File file18 = new File("China New Death.txt");
        File file19 = new File("China TotalCase.txt");
        File file20 = new File("China TotalDeath.txt");


        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
            file4.createNewFile();
            file5.createNewFile();
            file6.createNewFile();
            file7.createNewFile();
            file8.createNewFile();
            file9.createNewFile();
            file10.createNewFile();
            file11.createNewFile();
            file12.createNewFile();
            file13.createNewFile();
            file14.createNewFile();
            file15.createNewFile();
            file16.createNewFile();
            file17.createNewFile();
            file18.createNewFile();
            file19.createNewFile();
            file20.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader newCase1 = new BufferedReader(new FileReader("Malaysia New Case.txt"));
            BufferedReader newCase2 = new BufferedReader(new FileReader("USA New Case.txt"));
            BufferedReader newCase3 = new BufferedReader(new FileReader("Brazil New Case.txt"));
            BufferedReader newCase4 = new BufferedReader(new FileReader("India New Case.txt"));
            BufferedReader newCase5 = new BufferedReader(new FileReader("China New Case.txt"));

            String read1 = "";
            String read2 = "";
            String read3 = "";
            String read4 = "";
            String read5 = "";

            while((read1 = newCase1.readLine()) != null){
                case1 = Integer.parseInt(read1);
            }
            newCase1.close();

            while((read2 = newCase2.readLine()) != null){
                case2 = Integer.parseInt(read2);
            }
            newCase2.close();

            while((read3 = newCase3.readLine()) != null){
                case3 = Integer.parseInt(read3);
            }
            newCase3.close();

            while((read4 = newCase4.readLine()) != null){
                case4 = Integer.parseInt(read4);
            }
            newCase4.close();

            while((read5 = newCase5.readLine()) != null){
                case5 = Integer.parseInt(read5);
            }
            newCase5.close();

        }catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader newDeath1 = new BufferedReader(new FileReader("Malaysia New Death.txt"));
            BufferedReader newDeath2 = new BufferedReader(new FileReader("USA New Death.txt"));
            BufferedReader newDeath3 = new BufferedReader(new FileReader("Brazil New Death.txt"));
            BufferedReader newDeath4 = new BufferedReader(new FileReader("India New Death.txt"));
            BufferedReader newDeath5 = new BufferedReader(new FileReader("China New Death.txt"));

            String read1 = "";
            String read2 = "";
            String read3 = "";
            String read4 = "";
            String read5 = "";

            while((read1 = newDeath1.readLine()) != null){
                death1 = Integer.parseInt(read1);
            }
            newDeath1.close();

            while((read2 = newDeath2.readLine()) != null){
                death2 = Integer.parseInt(read2);
            }
            newDeath2.close();

            while((read3 = newDeath3.readLine()) != null){
                death3 = Integer.parseInt(read3);
            }
            newDeath3.close();

            while((read4 = newDeath4.readLine()) != null){
                death4 = Integer.parseInt(read4);
            }
            newDeath4.close();

            while((read5 = newDeath5.readLine()) != null){
                death5 = Integer.parseInt(read5);
            }
            newDeath5.close();


        }catch (IOException e) {
            e.printStackTrace();
        }

        total1 = 12276058 + case1 + case2 + case3 + case4 + case5;
        total2 = 554472 + death1 + death2 + death3 + death4 + death5;

        BigInteger totalCase = BigInteger.valueOf(total1);
        BigInteger totalDeath = BigInteger.valueOf(total2);
        BigInteger totalRecover = BigInteger.valueOf(total3);

        String result1 = NumberFormat.getNumberInstance(Locale.US).format(totalCase);
        String result2 = NumberFormat.getNumberInstance(Locale.US).format(totalDeath);
        String result3 = NumberFormat.getNumberInstance(Locale.US).format(totalRecover);

        label1 = new JLabel("Coronavirus Cases", SwingConstants.CENTER);
        label1.setBounds(108,85,283,30);
        label1.setFont(new Font("Times New Roman", Font.BOLD,35));
        add(label1);

        label2 = new JLabel(result1, SwingConstants.CENTER);
        label2.setBounds(108,125,283,30);
        label2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        label2.setForeground(Color.GRAY);
        add(label2);

        label3 = new JLabel("Deaths", SwingConstants.CENTER);
        label3.setBounds(108,200,283,30);
        label3.setFont(new Font("Times New Roman", Font.BOLD, 35));
        add(label3);

        JLabel label4 = new JLabel(result2, SwingConstants.CENTER);
        label4.setBounds(108,240,283,30);
        label4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        label4.setForeground(Color.RED);
        add(label4);

        label5 = new JLabel("Recovered", SwingConstants.CENTER);
        label5.setBounds(108,315,283,30);
        label5.setFont(new Font("Times New Roman", Font.BOLD, 35));
        add(label5);

        label6 = new JLabel(result3, SwingConstants.CENTER);
        label6.setBounds(108,355,283,30);
        label6.setFont(new Font("Times New Roman", Font.PLAIN,30));
        label6.setForeground(Color.GREEN);
        add(label6);

        String time = new SimpleDateFormat("yyyy-MM-dd, HH:mm:ss").format(new Date());
        label7 = new JLabel(time, SwingConstants.CENTER);
        label7.setBounds(108,10,283,30);
        add(label7);

        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\Worldometer.png");

        setTitle("Worldometer");
        setLayout(null);
        setIconImage(icon);
        setVisible(true);
        setSize(500,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new GroupAssignment.MainMenu();
    }
}
