
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Main extends JFrame implements ActionListener 
{

    private JLabel id,name,gender,score;
    private JTextField txtID, txtName, txtGender, txtScore;
    private JButton btnAdd, btnCancel;
    
    public Main(){
        JFrame f= new JFrame();  
    /*---------------------------------------------------------*/
        id=new JLabel("ID");  
        id.setBounds(50,50, 100,30);
        txtID = new JTextField("");
        txtID.setBounds(50,75, 150,30);
        
        name=new JLabel("Name");  
        name.setBounds(50,100, 100,30);
        txtName = new JTextField("");
        txtName.setBounds(50,125, 150,30);
        
        gender=new JLabel("Gender");  
        gender.setBounds(50,150, 100,30);
        txtGender = new JTextField("");
        txtGender.setBounds(50,175, 150,30);
        
        score=new JLabel("Score");  
        score.setBounds(50,200, 100,30);
        txtScore = new JTextField("");
        txtScore.setBounds(50,225, 150,30);
        
        btnAdd = new JButton("Add");
        btnAdd.setBounds(50,275, 150,30);
        btnCancel = new JButton("Cancel");
        btnCancel.setBounds(50,315, 150,30);
        /*---------------------------------------------------------*/
        f.add(id);
        f.add(name); 
        f.add(gender);
        f.add(score);
        
        f.add(txtID);
        f.add(txtName);
        f.add(txtGender);
        f.add(txtScore);
        
        f.add(btnAdd);
        f.add(btnCancel);
        

        /*---------------------------------------------------------*/
        f.setSize(300,450); 
        f.setLayout(null); 
        f.setVisible(true);
        
        btnAdd.addActionListener(this);
        btnCancel.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnAdd){
            JOptionPane.showMessageDialog(this,"Add✅");
            txtID.setText("");
            txtName.setText("");
            txtGender.setText("");
            txtScore.setText("");
        }else if(e.getSource()==btnCancel){
            txtID.setText("");
            txtName.setText("");
            txtGender.setText("");
            txtScore.setText("");
        }
    }
    public static void main(String[] args){
        Main m = new Main();
    }
}

