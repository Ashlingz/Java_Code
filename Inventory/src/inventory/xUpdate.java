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
public class xUpdate {
    public void UpdateCatory(String values, String value1){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            
            String sql = "UPDATE category SET category_name = ? WHERE category_id = ?";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
            statement.setString(1, values);
            statement.setString(2, value1);

            
            statement.executeUpdate();
            statement.close();
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
    }
    
    public void UpdateProduct(String product_id, String product_name, String expire_date, String category_id){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            
            String sql = "UPDATE products SET product = ?, expire_date = ?, category_id = ? WHERE product_id = ?";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
            statement.setString(1, product_name);
            statement.setString(2, expire_date);
            statement.setString(3, category_id);
            statement.setString(4, product_id);

            
            statement.executeUpdate();
            statement.close();
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
    }
    
    public void UpdateImport(String supply_id, String product_id, String qty, String price, String total){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            
            String sql = "UPDATE carts SET product_id = ?, qty = ?, price = ?, total = ? WHERE cart_id = ?";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
            statement.setString(1, product_id);
            statement.setString(2, qty);
            statement.setString(3, price);
            statement.setString(4, total);
            statement.setString(5, supply_id);

            
            statement.executeUpdate();
            statement.close();
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
    }
    public void UpdateSale(String supply_id, String product_id, String qty, String price, String total){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            
            String sql = "UPDATE order_cart SET product_id = ?, qty = ?, price = ?, amount = ? WHERE order_cart_id = ?";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
            statement.setString(1, product_id);
            statement.setString(2, qty);
            statement.setString(3, price);
            statement.setString(4, total);
            statement.setString(5, supply_id);

            
            statement.executeUpdate();
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

