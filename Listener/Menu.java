
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener
{ 
    private JMenuBar mb;
    private JMenu m1;
    private JMenuItem s1, s2, s3;
    private JMenuItem d1;
    
    private Container c;
    public Menu(){
        c = this.getContentPane();
        mb = new JMenuBar();
        
        m1 = new JMenu("File");
        mb.add(m1);
        
        s1 = new JMenuItem("Open");
        s2 = new JMenuItem("Save");
        s3 = new JMenuItem("Save as");        
        m1.add(s1);
        m1.add(s2);
        m1.add(s3);
        
        c.setLayout(new BorderLayout());
        c.add(BorderLayout.NORTH, mb);
        
        s1.addActionListener(this);
        s2.addActionListener(this);
        s3.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==s1){
                JOptionPane.showMessageDialog(this,"Open✅");
        }else if(e.getSource()==s2){
                JOptionPane.showMessageDialog(this,"Save✅");
        }else if(e.getSource()==s3){
                JOptionPane.showMessageDialog(this,"Save As✅");
        }
    
    }
}

