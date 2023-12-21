/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


/**
 *
 * @author TUF
 */
public class xInsert {
    
    public void InsertCategory(String category){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            
            String sql = "INSERT INTO category (category_name) VALUES (?)";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
            statement.setString(1, category);
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
    
    public void insertProduct(String category_id, String product_name, String expire_date){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            
            String sql = "INSERT INTO products(category_id, product, qty, expire_date, created_date) VALUES (?, ?, 0, ?, NOW())";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
            statement.setString(1, category_id);
            statement.setString(2, product_name);
            statement.setString(3, expire_date);
            
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
    
    public void InsertImport(String product_id, String qty, String price, String total){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");     
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            String sql_supplies = "INSERT INTO carts(product_id, qty, price, total) VALUES(?, ?, ?, ?);";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql_supplies);
            statement.setString(1, product_id);
            statement.setString(2, qty);
            statement.setString(3, price);
            statement.setString(4, total);
            
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
    public void InsertSession( String total){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");     
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            String sql_supplies = "INSERT INTO sessions(total, session_date) VALUES(?, now());";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql_supplies);
            statement.setString(1, total);
            
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
    
    public void InsertSale(String product_id, String qty, String price, String total){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");     
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            String sql_supplies = "INSERT INTO order_cart(product_id, qty, price, amount) VALUES(?, ?, ?, ?);";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql_supplies);
            statement.setString(1, product_id);
            statement.setString(2, qty);
            statement.setString(3, price);
            statement.setString(4, total);
            
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
    public void InsertOrderTotal( String total){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");     
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            String sql_supplies = "INSERT INTO order_detail_cart(total, order_date) VALUES(?, now());";
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql_supplies);
            statement.setString(1, total);
            
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

