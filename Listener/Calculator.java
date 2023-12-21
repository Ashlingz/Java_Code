

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Calculator extends JFrame implements ActionListener
{;
    private JTextField txtBox;
    private JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, btnJaek, btnKon, btnBuk, btnDok, btnEqual, btnDot;
    
    public Calculator(){
        JFrame f= new JFrame(); 
        //1------------------------------------------------------------
        txtBox = new JTextField("");
        txtBox.setBounds(20,50, 245,50);
        //2------------------------------------------------------------
        num7 = new JButton("7");
        num7.setBounds(20, 110, 50, 50);
        
        num8 = new JButton("8");
        num8.setBounds(85, 110, 50, 50);
        
        num9 = new JButton("9");
        num9.setBounds(150, 110, 50, 50);
        
        btnJaek = new JButton("÷");
        btnJaek.setBounds(215, 110, 50, 50);
        //3------------------------------------------------------------
        num4 = new JButton("4");
        num4.setBounds(20, 170, 50, 50);
        
        num5 = new JButton("5");
        num5.setBounds(85, 170, 50, 50);
        
        num6 = new JButton("6");
        num6.setBounds(150, 170, 50, 50);
        
        btnKon = new JButton("×");
        btnKon.setBounds(215, 170, 50, 50);
        //4------------------------------------------------------------
        num1 = new JButton("1");
        num1.setBounds(20, 230, 50, 50);
        
        num2 = new JButton("2");
        num2.setBounds(85, 230, 50, 50);
        
        num3 = new JButton("3");
        num3.setBounds(150, 230, 50, 50);
        
        btnBuk = new JButton("+");
        btnBuk.setBounds(215, 230, 50, 50);
        //5------------------------------------------------------------
        num0 = new JButton("0");
        num0.setBounds(20, 290, 50, 50);
        
        btnDot = new JButton(".");
        btnDot.setBounds(85, 290, 50, 50);
        
        btnEqual = new JButton("=");
        btnEqual.setBounds(150, 290, 50, 50);
        
        btnDok = new JButton("-");
        btnDok.setBounds(215, 290, 50, 50);
        //-------------------------------------------------------------
        f.add(txtBox);
        f.add(num8);
        f.add(num7);
        f.add(num9);
        f.add(btnJaek);
        
        f.add(num4);
        f.add(num5);
        f.add(num6);
        f.add(btnKon);
        
        f.add(num1);
        f.add(num2);
        f.add(num3);
        f.add(btnBuk);
        
        f.add(num0);
        f.add(btnDot);
        f.add(btnEqual);
        f.add(btnDok);
        //-------------------------------------------------------------
        f.setSize(300,450); 
        f.setLayout(null); 
        f.setVisible(true);
        //-------------------------------------------------------------
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        num0.addActionListener(this);
        
        btnBuk.addActionListener(this);
        btnDot.addActionListener(this);
        btnDok.addActionListener(this);
        btnJaek.addActionListener(this);
        btnKon.addActionListener(this);
        btnEqual.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        
        
        if(e.getSource()==num1){
            //JOptionPane.showMessageDialog(this,"1");
            txtBox.setText("1");
        }else if(e.getSource()==num2){
            //JOptionPane.showMessageDialog(this,"2");
        }else if(e.getSource()==num3){
            //JOptionPane.showMessageDialog(this,"3");
        }else if(e.getSource()==num4){
            //JOptionPane.showMessageDialog(this,"4");
        }else if(e.getSource()==num5){
            //JOptionPane.showMessageDialog(this,"5");
        }else if(e.getSource()==num6){
            //JOptionPane.showMessageDialog(this,"6");
        }else if(e.getSource()==num7){
            //JOptionPane.showMessageDialog(this,"7");
        }else if(e.getSource()==num8){
            //JOptionPane.showMessageDialog(this,"8");
        }else if(e.getSource()==num9){
            //JOptionPane.showMessageDialog(this,"9");
        }else if(e.getSource()==num0){
            //JOptionPane.showMessageDialog(this,"0");
            
            
        }else if(e.getSource()==btnJaek){
            //JOptionPane.showMessageDialog(this,"÷");
        }else if(e.getSource()==btnKon){
            //JOptionPane.showMessageDialog(this,"×");
        }else if(e.getSource()==btnBuk){
            //JOptionPane.showMessageDialog(this,"+");
        }else if(e.getSource()==btnDok){
            //JOptionPane.showMessageDialog(this,"-");
        }else if(e.getSource()==btnEqual){
            //JOptionPane.showMessageDialog(this,"=");
        }else if(e.getSource()==btnDot){
            //JOptionPane.showMessageDialog(this,".");
        }
    }
}