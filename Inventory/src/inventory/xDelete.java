/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author TUF
 */
public class xDelete {
    public void DeleteCategory(String id){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            
            String sql = "DELETE FROM category WHERE category_id = ?";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
            statement.setString(1, id);
            int affectedRows = statement.executeUpdate();

//            if (affectedRows > 0) {
//                JOptionPane.showMessageDialog(this, "Deleted Successed");
//            } else {
//                JOptionPane.showMessageDialog(this, "Error");
//            }
            
            
            statement.close();
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
    }
    
    public void DeleteProduct(String product_id){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            
            String sql = "DELETE FROM products WHERE product_id = ?";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
            statement.setString(1, product_id);
            int affectedRows = statement.executeUpdate();

//            if (affectedRows > 0) {
//                JOptionPane.showMessageDialog(this, "Deleted Successed");
//            } else {
//                JOptionPane.showMessageDialog(this, "Error");
//            }
            
            
            statement.close();
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
    }
    public void DeleteSupply(String supply_id){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            
            String sql = "DELETE FROM carts WHERE cart_id = ?";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
            statement.setString(1, supply_id);
            int affectedRows = statement.executeUpdate();

//            if (affectedRows > 0) {
//                JOptionPane.showMessageDialog(optionPane, "Deleted Successed");
//            } else {
//                JOptionPane.showMessageDialog(optionPane, "Error");
//            }
            
            
            statement.close();
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
    }
    public void DeleteSale(String supply_id){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            
            String sql = "DELETE FROM order_cart WHERE order_cart_id = ?";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
            statement.setString(1, supply_id);
            int affectedRows = statement.executeUpdate();

//            if (affectedRows > 0) {
//                JOptionPane.showMessageDialog(optionPane, "Deleted Successed");
//            } else {
//                JOptionPane.showMessageDialog(optionPane, "Error");
//            }
            
            
            statement.close();
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
    }
}


