
/**
 * Write a description of class JTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.JPanel;
public class JTest extends JFrame implements ActionListener
{  
    private JTextArea textArea;
    private JPasswordField passwordField;
    private JCheckBox checkBox;
    private JComboBox<String> comboBox;
    private JTable table;
    private JMenu menu;
    private JMenuItem menuItem;
    private JPopupMenu popupMenu;
    private JCheckBoxMenuItem checkBoxMenuItem;
    private JProgressBar progressBar;
    private JTree tree;
    private JButton btnChoser;
    private JPanel txt; 
    JFrame frame= new JFrame(); 
    JRootPane root = frame.getRootPane(); 
    public JTest() {
        // set frame properties
        this.setTitle("My GUI Project");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JOptionPane.showMessageDialog(frame, "Eggs are not supposed to be green.");
        // create components
        textArea = new JTextArea("Write here");
        textArea.setPreferredSize(new DimensionUIResource(200, 200));
        passwordField = new JPasswordField(10);
        checkBox = new JCheckBox("Check me");
        String[] items = {"Item 1", "Item 2", "Item 3"};
        comboBox = new JComboBox<>(items);
        Object[][] data = {{"Singly", "Leom"}, {"Leom", "Singly"}, {"Lysing", "Lim"}};
        String[] columns = {"First Name", "Last Name"};
        table = new JTable(data, columns);
        String[] listItems = {"Item 1", "Item 2", "Item 3"};
        menu = new JMenu("File");
        menuItem = new JMenuItem("Open");
        menu.add(menuItem);
        popupMenu = new JPopupMenu();
        checkBoxMenuItem = new JCheckBoxMenuItem("Check me");
        popupMenu.add(checkBoxMenuItem);
        progressBar = new JProgressBar();
        tree = new JTree();
        txt = new JPanel();
        
        final JFrame f= new JFrame("PopupMenu Example");  
        final JPopupMenu popupmenu = new JPopupMenu("Edit");   
        JMenuItem cut = new JMenuItem("Cut");  
        JMenuItem copy = new JMenuItem("Copy");  
        JMenuItem paste = new JMenuItem("Paste"); 
        popupmenu.add(cut); popupmenu.add(copy); popupmenu.add(paste);
        
        btnChoser=new JButton("color"); 
        btnChoser.addActionListener(this);
        
        JMenuBar bar = new JMenuBar();  
            JMenu menu1 = new JMenu("RootPane");  
            bar.add(menu);  
            menu1.add("Open");  
            menu1.add("Close");  
            root.setJMenuBar(bar); 
        
        // add components to frame
        JPanel panel = new JPanel();
        panel.add(textArea);
        panel.add(popupmenu);
        panel.add(passwordField);
        panel.add(checkBox);
        panel.add(comboBox);
        panel.add(new JScrollPane(table));
        panel.add(progressBar);
        panel.add(tree);
        panel.add(btnChoser);
        this.setContentPane(panel);
        
        // add menu items
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        this.setJMenuBar(menuBar);
        
        // add popup menu
        panel.setComponentPopupMenu(popupMenu);
        frame.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                popupmenu.show(f , e.getX(), e.getY());  
            }                 
         });
          frame.add(popupmenu); 
        
        // show frame
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {    
        Color initialcolor=Color.RED;    
        Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);    
        frame.setBackground(color);    
    }

    
   
   public static void main(String[] args) {
        new JTest();
    }
    
}

