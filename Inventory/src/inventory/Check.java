/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

/**
 *
 * @author TUF
 */
import javax.swing.*;
import java.awt.*;

public class Check {
    public void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    public void createAndShowGUI() {
        JFrame frame = new JFrame("Custom JOptionPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton showButton = new JButton("Show Custom JOptionPane");
        showButton.addActionListener(e -> showCustomOptionPane(""));

        frame.getContentPane().add(showButton);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void showCustomOptionPane(String msg) {
        JFrame parentFrame = new JFrame();
        // Create a custom JPanel to set font, background color, and foreground color
        JPanel customPanel = new JPanel();
        
        JLabel messageLabel = new JLabel(msg);
        messageLabel.setForeground(new Color(102, 102, 102));
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        customPanel.add(messageLabel);
        
        // Create the JOptionPane with custom panel
        JOptionPane optionPane = new JOptionPane(customPanel, JOptionPane.INFORMATION_MESSAGE);
        
        // Set UIManager properties to customize button appearance
        UIManager.put("OptionPane.background", new Color(240, 240, 240));
        UIManager.put("Panel.background", new Color(240, 240, 240));
        UIManager.put("Button.background", new Color(102,255,102));
        UIManager.put("Button.foreground", new Color(102,102,102));
        
        
        // Create the JOptionPane with custom panel
        JOptionPane.showMessageDialog(parentFrame, customPanel, "Error",
                JOptionPane.INFORMATION_MESSAGE);
    }
}