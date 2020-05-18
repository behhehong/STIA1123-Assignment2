package Assignments.Assignment2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PosEkspres extends JFrame implements ActionListener {
   private JButton button;
   private JLabel label;
   private JRadioButton[]type = new JRadioButton[4];

   public PosEkspres(){
       label = new JLabel("Please choose type of package");
       label.setBounds(50,0,300,20);
       add(label);

       type[0] = new JRadioButton("LG");
       type[0].setBounds(100,50,150,20);
       type[1] = new JRadioButton("LE(C5)");
       type[1].setBounds(100,100,150,20);
       type[2] = new JRadioButton("LD(B4");
       type[2].setBounds(100,150,150,20);
       type[3] = new JRadioButton("LK");
       type[3].setBounds(100,200,150,20);

       for(int i=0; i<4; i++){
           add(type[i]);
           type[i].addActionListener(this);
       }

       button = new JButton("Confirm");
       button.setBounds(100,250,80,30);
       button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               for(JRadioButton button: type){
                   if(button.isSelected()){
                       new PosEkspres2();
                       dispose();
                   }
               }
           }
       });

       add(button);

       setSize(400,400);
       setLayout(null);
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setTitle("Pos Ekspres");
       setLocationRelativeTo(null);
   }

   public void actionPerformed(ActionEvent e){
       int max = 0;

       for(int i=0; i<4; i++){
           if(type[i].isSelected()){
               max++;
           }
       }

       for(JRadioButton button: type){
           if (max == 1){
               if(!button.isSelected()){
                   button.setEnabled(false);
               }
           }
           else{
               if(max < 1){
                   button.setEnabled(true);
               }
           }
       }
   }

    public static void main(String[] args) {
        new PosEkspres();
    }

}
