package inventory;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUF
 */
public class xDisplay {
    public void displayTableCatory(JTable table) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");
            String qry = "SELECT * FROM category";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qry);
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Object[] row = new Object[2];
            
            while (rs.next()) {
                row[0] = rs.getObject("category_name");
                row[1] = rs.getObject("category_id");
                model.addRow(row);
            }
            rs.close();
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (SQLException ex) {
            ex.getMessage();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    public void displayTableProduct(JTable table){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");
            String qry = "SELECT p.product_id, p.product, p.expire_date, c.category_name, c.category_id FROM products p JOIN category c ON p.category_id = c.category_id;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qry);
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Object[] row = new Object[5];
            
            while (rs.next()) {
                row[0] = rs.getObject("product_id");
                row[1] = rs.getObject("product");
                row[2] = rs.getObject("expire_date");
                row[3] = rs.getObject("category_name");
                row[4] = rs.getObject("category_id");
                model.addRow(row);
            }
            rs.close();
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (SQLException ex) {
            ex.getMessage();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    
    public void DisplayCategoryInProduct(JComboBox comboBox){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            
            String query = "SELECT * FROM category";
            PreparedStatement statement1 = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = statement1.executeQuery();
            while(rs.next()) {
                String productName = rs.getString("category_name");
                comboBox.addItem(productName);   
            }
            rs.close();
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
    }
    public void displayTableImprot(JTable table){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");
            String qry = "SELECT c.cart_id, p.product, c.qty, c.price, c.total, cat.category_name, p.product_id FROM carts c JOIN products p ON p.product_id = c.product_id JOIN category cat ON cat.category_id = p.category_id;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qry);
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Object[] row = new Object[7];
            
            while (rs.next()){
                row[0] = rs.getObject("cart_id");
                row[1] = rs.getObject("product");
                row[2] = rs.getObject("qty");
                row[3] = rs.getObject("price");
                row[4] = rs.getObject("total");
                row[5] = rs.getObject("category_name");
                row[6] = rs.getObject("product_id");
                
                model.addRow(row);
            }
            rs.close();
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (SQLException ex) {
            ex.getMessage();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    public void DisplayComboProduct(JComboBox comboBox){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            
            String query = "SELECT product FROM products";
            PreparedStatement statement1 = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = statement1.executeQuery();
            while(rs.next()) {
                String productName = rs.getString("product");
                comboBox.addItem(productName);   
            }
            rs.close();
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
    }
    public void DisplayTotalImport(JTextField field, JLabel label){
        Connection con = null;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");

        String query = "SELECT sum(total) FROM carts";
        PreparedStatement statement1 = (PreparedStatement) con.prepareStatement(query);
        ResultSet rs = statement1.executeQuery();
        
        if (rs.next()) {
            String total = rs.getString(1); // Use index 1 to get the first column
            if (total == null) {
                total = "0";
            }
            field.setText(total);
            label.setText(total);
        } else {
            // No data found, set both field and label to "0"
            field.setText("0");
            label.setText("0");
        }
        rs.close();
    } catch (ClassNotFoundException ex) {
        ex.printStackTrace();
    } catch (SQLException ex) {
        ex.printStackTrace();
    } catch (Exception ex) {
        ex.printStackTrace();
    } finally {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }    }
    public void DisplayImportID(JTextField field){
        Connection con = null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");

        String query = "SELECT max(import_id) FROM imports";
        try (PreparedStatement statement1 = (PreparedStatement) con.prepareStatement(query);
             ResultSet rs = statement1.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt(1) + 1;
                String set_id = String.valueOf(id);
                field.setText(set_id);
            }
        }
    } catch (ClassNotFoundException ex) {
        ex.printStackTrace();
    } catch (SQLException ex) {
        ex.printStackTrace();
    } catch (Exception ex) {
        ex.printStackTrace();
    } finally {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    }
    
    public void DisplayInventoryTotalImport(JLabel label){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            
            String query = "SELECT sum(total) FROM imports";
            PreparedStatement statement1 = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = statement1.executeQuery();
            while(rs.next()) {
                String total = rs.getString("sum(total)");
                label.setText(total);
                    
            }
            rs.close();
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
    }
    public void DisplayInventoryStokTable(JTable table){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            
            String query = "SELECT p.product, MIN(p.qty) AS min_qty, c.category_name FROM products p JOIN category c ON p.category_id = c.category_id GROUP BY p.product, c.category_name;";
            PreparedStatement statement1 = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = statement1.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Object[] row = new Object[3];
            
            while (rs.next()){
                row[0] = rs.getObject("category_name");
                row[1] = rs.getObject("product");
                row[2] = rs.getObject("min_qty");
                model.addRow(row);
            }
            rs.close();
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
    }
    public void DisplayInventoryTable(JTable table){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");
            String qry = "SELECT category_name, p.product, c.qty, c.price, c.subtotal, i.import_date FROM supplies c JOIN products p ON c.product_id = p.product_id JOIN category cat ON p.category_id = cat.category_id JOIN imports i ON c.import_id = i.import_id;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qry);
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Object[] row = new Object[6];
            
            while (rs.next()){
                row[0] = rs.getObject("product");
                row[1] = rs.getObject("qty");
                row[2] = rs.getObject("price");
                row[3] = rs.getObject("subtotal");
                row[4] = rs.getObject("category_name");
                row[5] = rs.getObject("import_date");
                
                model.addRow(row);
            }
            rs.close();
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (SQLException ex) {
            ex.getMessage();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    
    public void DisplayOrderMaxID(JTextField field){
        Connection con = null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");

        String query = "SELECT max(order_id) FROM orders";
        try (PreparedStatement statement1 = (PreparedStatement) con.prepareStatement(query);
             ResultSet rs = statement1.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt(1) + 1;
                String set_id = String.valueOf(id);
                field.setText(set_id);
            }
        }
    } catch (ClassNotFoundException ex) {
        ex.printStackTrace();
    } catch (SQLException ex) {
        ex.printStackTrace();
    } catch (Exception ex) {
        ex.printStackTrace();
    } finally {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    }
    public void DisplayTableOrderCart(JTable table){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");
            String qry = "SELECT c.order_cart_id, p.product, c.qty, c.price, c.amount, cat.category_name, p.product_id FROM order_cart c JOIN products p ON p.product_id = c.product_id JOIN category cat ON cat.category_id = p.category_id;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qry);
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Object[] row = new Object[7];
            
            while (rs.next()){
                row[0] = rs.getObject("order_cart_id");
                row[1] = rs.getObject("product");
                row[2] = rs.getObject("qty");
                row[3] = rs.getObject("price");
                row[4] = rs.getObject("amount");
                row[5] = rs.getObject("category_name");
                row[6] = rs.getObject("product_id");
                
                model.addRow(row);
            }
            rs.close();
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (SQLException ex) {
            ex.getMessage();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    public void DisplayTotalOrder(JTextField field, JLabel label){
        Connection con = null;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");

        String query = "SELECT sum(amount) FROM order_cart";
        PreparedStatement statement1 = (PreparedStatement) con.prepareStatement(query);
        ResultSet rs = statement1.executeQuery();
        
        if (rs.next()) {
            String total = rs.getString(1); // Use index 1 to get the first column
            if (total == null) {
                total = "0";
            }
            field.setText(total);
            label.setText(total);
        } else {
            // No data found, set both field and label to "0"
            field.setText("0");
            label.setText("0");
        }
        rs.close();
    } catch (ClassNotFoundException ex) {
        ex.printStackTrace();
    } catch (SQLException ex) {
        ex.printStackTrace();
    } catch (Exception ex) {
        ex.printStackTrace();
    } finally {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }    
    }
    
    public void DisplayIncomeTable(JTable table){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");
            String qry = "SELECT category_name, p.product, c.qty, c.price, c.amount, i.order_date FROM order_detail c JOIN products p ON c.product_id = p.product_id JOIN category cat ON p.category_id = cat.category_id JOIN orders i ON c.order_id = i.order_id;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qry);
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Object[] row = new Object[6];
            
            while (rs.next()){
                row[0] = rs.getObject("product");
                row[1] = rs.getObject("qty");
                row[2] = rs.getObject("price");
                row[3] = rs.getObject("amount");
                row[4] = rs.getObject("category_name");
                row[5] = rs.getObject("order_date");
                
                model.addRow(row);
            }
            rs.close();
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (SQLException ex) {
            ex.getMessage();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    public void DisplayIncomeTotalSale(JLabel label1){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            
            String query = "SELECT sum(total) FROM orders";
            PreparedStatement statement1 = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = statement1.executeQuery();
            while(rs.next()) {
                String total = rs.getString("sum(total)");
                label1.setText(total);
                    
            }
            rs.close();
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
    }
    public void DisplayIncomeTotalExport(JLabel label1){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false","root","");
            
            String query = "SELECT sum(qty) FROM order_detail";
            PreparedStatement statement1 = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = statement1.executeQuery();
            while(rs.next()) {
                String total = rs.getString("sum(qty)");
                label1.setText(total);
                    
            }
            rs.close();
            }catch(ClassNotFoundException ex){
                ex.getMessage();
            }catch (SQLException ex){
                ex.getMessage();
            }catch(Exception ex){
                ex.getMessage();
            }
    }
    
    public void DisplayDashImport(JTable table){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");
            String qry = "SELECT category_name, p.product, c.qty, c.price, c.subtotal, i.import_date FROM supplies c JOIN products p ON c.product_id = p.product_id JOIN category cat ON p.category_id = cat.category_id JOIN imports i ON c.import_id = i.import_id WHERE import_date = CURRENT_DATE();";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qry);
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Object[] row = new Object[6];
            
            while (rs.next()){
                row[0] = rs.getObject("product");
                row[1] = rs.getObject("qty");
                row[2] = rs.getObject("price");
                row[3] = rs.getObject("subtotal");
                row[4] = rs.getObject("category_name");
                row[5] = rs.getObject("import_date");
                
                model.addRow(row);
            }
            rs.close();
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (SQLException ex) {
            ex.getMessage();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    public void DisplayDashExport(JTable table){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");
            String qry = "SELECT category_name, p.product, c.qty, c.price, c.amount, i.order_date FROM order_detail c JOIN products p ON c.product_id = p.product_id JOIN category cat ON p.category_id = cat.category_id JOIN orders i ON c.order_id = i.order_id WHERE order_date = CURRENT_DATE();;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qry);
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Object[] row = new Object[6];
            
            while (rs.next()){
                row[0] = rs.getObject("product");
                row[1] = rs.getObject("qty");
                row[2] = rs.getObject("price");
                row[3] = rs.getObject("amount");
                row[4] = rs.getObject("category_name");
                row[5] = rs.getObject("order_date");
                
                model.addRow(row);
            }
            rs.close();
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (SQLException ex) {
            ex.getMessage();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    
    public void DisplayDashCardExport(JLabel income, JLabel session, JLabel export){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");
            String qry = "SELECT SUM(o.total) AS total_sum, COUNT(DISTINCT o.order_id) AS order_id_count, SUM(d.qty) AS total_qty FROM orders o JOIN order_detail d ON o.order_id = d.order_id WHERE order_date = CURRENT_DATE();";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qry);

            while (rs.next()){
                String totalsum = rs.getString("total_sum");
                income.setText("$ "+totalsum);
                
                String totalses= rs.getString("order_id_count");
                session.setText(totalses);
                
                String totalex= rs.getString("total_qty");
                export.setText(totalex);
            }
            rs.close();
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (SQLException ex) {
            ex.getMessage();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    public void DisplayDashCardImport(JLabel jimport, JLabel expense, JLabel stock){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");
            String qry = "SELECT sum(s.qty) AS qty, sum(i.total) AS total, sum(p.qty) AS stock FROM supplies s JOIN imports i ON s.import_id = i.import_id JOIN products p ON s.product_id = p.product_id WHERE import_date = CURRENT_DATE();";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qry);

            while (rs.next()){
                String totalim = rs.getString("qty");
                jimport.setText(totalim);
                
                String totalexp= rs.getString("total");
                expense.setText("$ "+totalexp);
                
                String totalstock= rs.getString("stock");
                stock.setText(totalstock);
            }
            rs.close();
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (SQLException ex) {
            ex.getMessage();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    
    
    
}
