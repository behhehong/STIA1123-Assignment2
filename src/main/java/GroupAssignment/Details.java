package GroupAssignment;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Details extends JFrame implements GroupAssignment.Implementation {
    List<GroupAssignment.Country> countryList;
    String header[] = new String[]{"New Cases", "New Deaths", "Country Name"};
    DefaultTableModel dtm;
    int row,col;
    String[] country = new String[] {"Malaysia", "USA", "Brazil", "India", "China"};

    public Details() {
        initComponents();
        countryList = new ArrayList<>();
        dtm = new DefaultTableModel(header,0);
        jTable2.setModel(dtm);
        this.setLocationRelativeTo(null);
        loadData();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\Worldometer.png");
        setIconImage(icon);
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jTextNewCases = new JTextField();
        jLabel3 = new JLabel();
        jTextNewDeaths = new JTextField();
        jLabel4 = new JLabel();
        jCountryName = new JComboBox<>();
        jPanel2 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jScrollPane4 = new JScrollPane();
        jTable2 = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Worldometer");
        setResizable(false);

        jPanel1.setBorder(BorderFactory.createEtchedBorder());

        jLabel2.setText("New Cases");

        jLabel3.setText("New Deaths");

        jLabel4.setText("Country Name");


        jCountryName.setModel(new DefaultComboBoxModel<>(country));
        jCountryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCountryNameActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextNewCases)
                                                        .addComponent(jTextNewDeaths, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCountryName, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextNewCases, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextNewDeaths, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jCountryName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(BorderFactory.createEtchedBorder());

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jButton1, jButton2, jButton3, jButton4, jButton5});

        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3)
                                        .addComponent(jButton4)
                                        .addComponent(jButton5))
                                .addContainerGap())
        );

        jPanel2Layout.linkSize(SwingConstants.VERTICAL, new Component[] {jButton1, jButton2, jButton3, jButton4, jButton5});

        jTable2.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
                }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane4)
                                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
        );

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        int newCases = Integer.parseInt(jTextNewCases.getText());
        int newDeaths = Integer.parseInt(jTextNewDeaths.getText());
        String countryName = jCountryName.getSelectedItem().toString();
        countryList.add(new GroupAssignment.Country(newCases, newDeaths, countryName));

        String getItem = (String) jCountryName.getSelectedItem();

        if(getItem.equals(country[0])){
            summery1 = jTextNewCases.getText();
            summery2 = jTextNewDeaths.getText();

            try{
                BufferedWriter writer1 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\Malaysia New Case.txt"), true));
                writer1.write(summery1);
                writer1.newLine();
                writer1.close();

                BufferedWriter writer2 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\Malaysia New Death.txt"), true));
                writer2.write(summery2);
                writer2.newLine();
                writer2.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

            TotalCase += Integer.parseInt(summery1);
            TotalDeath += Integer.parseInt(summery2);
            String Data1 = String.valueOf(TotalCase);
            String Data2 = String.valueOf(TotalDeath);
            try {
                BufferedWriter writer3 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\Malaysia TotalCase.txt"), true));
                writer3.write(Data1);
                writer3.newLine();
                writer3.close();

                BufferedWriter writer4 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\Malaysia TotalDeath.txt"), true));
                writer4.write(Data2);
                writer4.newLine();
                writer4.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try{
                BufferedReader totalCase = new BufferedReader(new FileReader("Malaysia TotalCase.txt"));
                BufferedReader totalDeath = new BufferedReader(new FileReader("Malaysia TotalDeath.txt"));
                String read1 = "";
                String read2 = "";

                while((read1 = totalCase.readLine()) != null){
                    TotalCase = Integer.parseInt(read1);
                }
                totalCase.close();

                while((read2 = totalDeath.readLine()) != null){
                    TotalDeath = Integer.parseInt(read2);
                }
                totalDeath.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        else if(getItem.equals(country[1])){
            summery1 = jTextNewCases.getText();
            summery2 = jTextNewDeaths.getText();

            try{
                BufferedReader totalCase = new BufferedReader(new FileReader("USA TotalCase.txt"));
                BufferedReader totalDeath = new BufferedReader(new FileReader("USA TotalDeath.txt"));
                String read1 = "";
                String read2 = "";

                while((read1 = totalCase.readLine()) != null){
                    TotalCase = Integer.parseInt(read1);
                }
                totalCase.close();

                while((read2 = totalDeath.readLine()) != null){
                    TotalDeath = Integer.parseInt(read2);
                }
                totalDeath.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try{
                BufferedWriter writer1 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\USA TotalDeath.txt"), true));
                writer1.write(summery1);
                writer1.newLine();
                writer1.close();

                BufferedWriter writer2 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\USA New Death.txt"), true));
                writer2.write(summery2);
                writer2.newLine();
                writer2.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

            TotalCase += Integer.parseInt(summery1);
            TotalDeath += Integer.parseInt(summery2);
            String Data1 = String.valueOf(TotalCase);
            String Data2 = String.valueOf(TotalDeath);
            try {
                BufferedWriter writer3 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\USA TotalCase.txt"), true));
                writer3.write(Data1);
                writer3.newLine();
                writer3.close();

                BufferedWriter writer4 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\USA TotalDeath.txt"), true));
                writer4.write(Data2);
                writer4.newLine();
                writer4.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        else if(getItem.equals(country[2])){
            summery1 = jTextNewCases.getText();
            summery2 = jTextNewDeaths.getText();

            File file1 = new File("Brazil New Case.txt");
            File file2 = new File("Brazil New Death.txt");
            File file3 = new File("Brazil TotalCase.txt");
            File file4 = new File("Brazil TotalDeath.txt");

            try {
                file1.createNewFile();
                file2.createNewFile();
                file3.createNewFile();
                file4.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try{
                BufferedReader totalCase = new BufferedReader(new FileReader("Brazil TotalCase.txt"));
                BufferedReader totalDeath = new BufferedReader(new FileReader("Brazil TotalDeath.txt"));
                String read1 = "";
                String read2 = "";

                while((read1 = totalCase.readLine()) != null){
                    TotalCase = Integer.parseInt(read1);
                }
                totalCase.close();

                while((read2 = totalDeath.readLine()) != null){
                    TotalDeath = Integer.parseInt(read2);
                }
                totalDeath.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try{
                BufferedWriter writer1 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\Brazil New Case.txt"), true));
                writer1.write(summery1);
                writer1.newLine();
                writer1.close();

                BufferedWriter writer2 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\Brazil New Death.txt"), true));
                writer2.write(summery2);
                writer2.newLine();
                writer2.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

            TotalCase += Integer.parseInt(summery1);
            TotalDeath += Integer.parseInt(summery2);
            String Data1 = String.valueOf(TotalCase);
            String Data2 = String.valueOf(TotalDeath);
            try {
                BufferedWriter writer3 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\Brazil TotalCase.txt"), true));
                writer3.write(Data1);
                writer3.newLine();
                writer3.close();

                BufferedWriter writer4 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\Brazil TotalDeath.txt"), true));
                writer4.write(Data2);
                writer4.newLine();
                writer4.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        else if(getItem.equals(country[3])){
            summery1 = jTextNewCases.getText();
            summery2 = jTextNewDeaths.getText();

            File file1 = new File("India New Case.txt");
            File file2 = new File("India New Death.txt");
            File file3 = new File("India TotalCase.txt");
            File file4 = new File("India TotalDeath.txt");

            try {
                file1.createNewFile();
                file2.createNewFile();
                file3.createNewFile();
                file4.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try{
                BufferedReader totalCase = new BufferedReader(new FileReader("India TotalCase.txt"));
                BufferedReader totalDeath = new BufferedReader(new FileReader("India TotalDeath.txt"));
                String read1 = "";
                String read2 = "";

                while((read1 = totalCase.readLine()) != null){
                    TotalCase = Integer.parseInt(read1);
                }
                totalCase.close();

                while((read2 = totalDeath.readLine()) != null){
                    TotalDeath = Integer.parseInt(read2);
                }
                totalDeath.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try{
                BufferedWriter writer1 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\India New Case.txt"), true));
                writer1.write(summery1);
                writer1.newLine();
                writer1.close();

                BufferedWriter writer2 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\India New Death.txt"), true));
                writer2.write(summery2);
                writer2.newLine();
                writer2.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

            TotalCase += Integer.parseInt(summery1);
            TotalDeath += Integer.parseInt(summery2);
            String Data1 = String.valueOf(TotalCase);
            String Data2 = String.valueOf(TotalDeath);
            try {
                BufferedWriter writer3 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\India TotalCase.txt"), true));
                writer3.write(Data1);
                writer3.newLine();
                writer3.close();

                BufferedWriter writer4 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\India TotalDeath.txt"), true));
                writer4.write(Data2);
                writer4.newLine();
                writer4.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            summery1 = jTextNewCases.getText();
            summery2 = jTextNewDeaths.getText();

            File file1 = new File("China New Case.txt");
            File file2 = new File("China New Death.txt");
            File file3 = new File("China TotalCase.txt");
            File file4 = new File("China TotalDeath.txt");

            try {
                file1.createNewFile();
                file2.createNewFile();
                file3.createNewFile();
                file4.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try{
                BufferedReader totalCase = new BufferedReader(new FileReader("China TotalCase.txt"));
                BufferedReader totalDeath = new BufferedReader(new FileReader("China TotalDeath.txt"));
                String read1 = "";
                String read2 = "";

                while((read1 = totalCase.readLine()) != null){
                    TotalCase = Integer.parseInt(read1);
                }
                totalCase.close();

                while((read2 = totalDeath.readLine()) != null){
                    TotalDeath = Integer.parseInt(read2);
                }
                totalDeath.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try{
                BufferedWriter writer1 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\China New Case.txt"), true));
                writer1.write(summery1);
                writer1.newLine();
                writer1.close();

                BufferedWriter writer2 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\China New Death.txt"), true));
                writer2.write(summery2);
                writer2.newLine();
                writer2.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

            TotalCase += Integer.parseInt(summery1);
            TotalDeath += Integer.parseInt(summery2);
            String Data1 = String.valueOf(TotalCase);
            String Data2 = String.valueOf(TotalDeath);
            try {
                BufferedWriter writer3 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\China TotalCase.txt"), true));
                writer3.write(Data1);
                writer3.newLine();
                writer3.close();

                BufferedWriter writer4 = new BufferedWriter(new FileWriter(new File("C:\\Users\\USER\\Documents\\Assignment & Homework\\Sem 2\\Programming 2\\GroupAssignment\\China TotalDeath.txt"), true));
                writer4.write(Data2);
                writer4.newLine();
                writer4.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        writeData();
        clearField();
    }

    private void clearField(){
        jTextNewCases.requestFocus();
        jTextNewCases.setText("");
        jTextNewDeaths.setText("");
        jCountryName.setSelectedIndex(0);
    }
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {
        row = jTable2.getSelectedRow();
        col = jTable2.getColumnCount();
        System.out.println(row+","+col);
        jTextNewCases.setText(dtm.getValueAt(row, 0).toString());
        jTextNewDeaths.setText(dtm.getValueAt(row, 1).toString());
        String location = dtm.getValueAt(row, 2).toString();
        for (int i = 0; i<(jCountryName.getItemCount());i++){
            if (jCountryName.getItemAt(i).equalsIgnoreCase(location)){
                jCountryName.setSelectedIndex(i);
            }
        }
    }

    private void jCountryNameActionPerformed(ActionEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", dialogButton);
        if(dialogResult == 0) {
            countryList.remove(row);

            clearField();
            writeData();
        }
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        int updatednewCases = Integer.parseInt(String.valueOf(jTextNewCases));
        int updatednewDeaths = Integer.parseInt(String.valueOf(jTextNewDeaths));
        String updatedcountryName = jCountryName.getSelectedItem().toString();
        countryList.get(row).newCases = updatednewCases;
        countryList.get(row).newDeaths = updatednewDeaths;
        countryList.get(row).countryName = updatedcountryName;

        writeData();
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        String input = JOptionPane.showInputDialog(this,"Search Country Name:");

        if(input.equalsIgnoreCase("Malaysia")){
            new GroupAssignment.Malaysia();
            dispose();
        }

        else if(input.equalsIgnoreCase("USA")){
            new USA();
            dispose();
        }

        else if(input.equalsIgnoreCase("Brazil")){
            new Brazil();
            dispose();
        }

        else if(input.equalsIgnoreCase("India")){
            new India();
            dispose();
        }

        else if(input.equalsIgnoreCase("China")){
            new China();
            dispose();
        }
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        new GroupAssignment.MainMenu();
        dispose();
    }

    public void loadData(){
        try {
            File file = new File("Covid19.txt");
            file.createNewFile();
            FileReader f = new FileReader("Covid19.txt");
            StringBuffer sb = new StringBuffer();
            while (f.ready()) {
                char c = (char) f.read();
                if (c == '-') {
                    String countryarray[] = sb.toString().split(",");
                    countryList.add(new GroupAssignment.Country(Integer.parseInt(countryarray[0]), Integer.parseInt(countryarray[1]), countryarray[2]));
                    sb = new StringBuffer();
                }else{
                    sb.append(c);
                }
            }
        }catch(IOException e){
            return;
        }
        dtm.setRowCount(0);
        for (int i = 0; i < countryList.size(); i++) {
            Object[] objs = {countryList.get(i).newCases,countryList.get(i).newDeaths,countryList.get(i).countryName,};
            dtm.addRow(objs);
        }
    }

    private void writeData(){
        try (FileWriter f = new FileWriter("Covid19.txt")) {
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<countryList.size();i++){
                sb.append(countryList.get(i).newCases+","+countryList.get(i).newDeaths+","+countryList.get(i).countryName+"-");
            }
            f.write(sb.toString());

        }catch(IOException e){
            return;
        }
        dtm.setRowCount(0);
        for (int i = 0; i < countryList.size(); i++) {
            Object[] objs = {countryList.get(i).newCases,countryList.get(i).newDeaths,countryList.get(i).countryName};
            dtm.addRow(objs);
        }
    }

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JComboBox<String> jCountryName;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane4;
    private JTable jTable2;
    private JTextField jTextNewCases;
    private JTextField jTextNewDeaths;
    static String summery1;
    static String summery2;
    public int TotalCase;
    public int TotalDeath;
}
