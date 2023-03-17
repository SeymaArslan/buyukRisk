/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buyukrisk1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Buyukrisk1 extends JFrame implements ActionListener{
    
   
  private  JButton formac = new JButton ("OYUNA GEÇ"); 
  
    /**
     * @param args the command line arguments
     */
     public Buyukrisk1()
    {   
       
         JPanel buton = new JPanel();
        buton.setLayout(new FlowLayout());
       buton.add(formac);
       formac = new JButton("FormAC");
       formac.addActionListener(new ActionListener(){
               @Override
    public void actionPerformed(ActionEvent e) {
        risk1 yeni = new risk1();
        yeni.setVisible(true);
        yeni.parent(this);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
       );
    }
  
    public static void main(String[] args) {
        // TODO code application logic here

         JFrame f = new JFrame();
         JButton b = new JButton("Büyük Risk'e Hoş Geldiniz..");
         b.setBackground(Color.white);
         b.setFont(new Font("verdana", Font.BOLD+Font.ITALIC, 20));
    
         f.setTitle("Bilgi Yarışması");
         f.setSize(400, 400);
         f.setLocationRelativeTo(f);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setVisible(true);
         f.add(b);
         b.addActionListener(new ActionListener(){
               @Override
    public void actionPerformed(ActionEvent e) {
        yarismacilar1 yeni = new yarismacilar1();
        yeni.setVisible(true);
       // yeni.parent(this);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
       );
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   

    
   
  

    
    

