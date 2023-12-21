/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorymaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TUF
 */
public class xQuery {
    public void QueryInventoryTable(JTable table, String product_name, String category_name, String dateFrom, String dateTo){
        Connection con = null;
PreparedStatement statement = null;
ResultSet rs = null;

try {
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");

    String qry = "SELECT category_name, p.product, c.qty, c.price, c.subtotal, i.import_date FROM supplies c JOIN products p ON c.product_id = p.product_id JOIN category cat ON p.category_id = cat.category_id JOIN imports i ON c.import_id = i.import_id WHERE 1=1";

    if (!product_name.equals("All")) {
        qry += " AND product = ?";
    }
    if (!category_name.equals("All")) {
        qry += " AND category_name = ?";
    }
    qry += " AND import_date BETWEEN ? AND ?";

    statement = (PreparedStatement) con.prepareStatement(qry);

    int parameterIndex = 1;
    if (!product_name.equals("All")) {
        statement.setString(parameterIndex++, product_name);
    }
    if (!category_name.equals("All")) {
        statement.setString(parameterIndex++, category_name);
    }
    statement.setString(parameterIndex++, dateFrom);
    statement.setString(parameterIndex, dateTo);

    rs = statement.executeQuery();

    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0);
    Object[] row = new Object[6];

    while (rs.next()) {
        row[0] = rs.getObject("product");
        row[1] = rs.getObject("qty");
        row[2] = rs.getObject("price");
        row[3] = rs.getObject("subtotal");
        row[4] = rs.getObject("category_name");
        row[5] = rs.getObject("import_date");

        model.addRow(row);
    }
} catch (ClassNotFoundException | SQLException ex) {
    ex.printStackTrace(); // Handle exceptions properly
} finally {
    try {
        if (rs != null) rs.close();
        if (statement != null) statement.close();
        if (con != null) con.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

    }
    public void QueryInventoryTtoal(JLabel label, String product_name, String category_name, String dateFrom, String dateTo){
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");

            String qry = "SELECT sum(c.subtotal) FROM supplies c JOIN products p ON c.product_id = p.product_id JOIN category cat ON p.category_id = cat.category_id JOIN imports i ON c.import_id = i.import_id WHERE 1=1";

            if (!product_name.equals("All")) {
                qry += " AND product = ?";
            }
            if (!category_name.equals("All")) {
                qry += " AND category_name = ?";
            }
            qry += " AND import_date BETWEEN ? AND ?";

            statement = (PreparedStatement) con.prepareStatement(qry);

            int parameterIndex = 1;
            if (!product_name.equals("All")) {
                statement.setString(parameterIndex++, product_name);
            }
            if (!category_name.equals("All")) {
                statement.setString(parameterIndex++, category_name);
            }
            statement.setString(parameterIndex++, dateFrom);
            statement.setString(parameterIndex, dateTo);

            rs = statement.executeQuery();

            while (rs.next()) {
                String total = rs.getString("sum(c.subtotal)");
                label.setText(total);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(); // Handle exceptions properly
        } finally {
            try {
                if (rs != null) rs.close();
                if (statement != null) statement.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }
    
    public void QueryIncomeTable(JTable table, String product_name, String category_name, String dateFrom, String dateTo){
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");

            String qry = "SELECT category_name, p.product, c.qty, c.price, c.amount, i.order_date FROM order_detail c JOIN products p ON c.product_id = p.product_id JOIN category cat ON p.category_id = cat.category_id JOIN orders i ON c.order_id = i.order_id WHERE 1=1";

            if (!product_name.equals("All")) {
                qry += " AND product = ?";
            }
            if (!category_name.equals("All")) {
                qry += " AND category_name = ?";
            }
            qry += " AND order_date BETWEEN ? AND ?";

            statement = (PreparedStatement) con.prepareStatement(qry);

            int parameterIndex = 1;
            if (!product_name.equals("All")) {
                statement.setString(parameterIndex++, product_name);
            }
            if (!category_name.equals("All")) {
                statement.setString(parameterIndex++, category_name);
            }
            statement.setString(parameterIndex++, dateFrom);
            statement.setString(parameterIndex, dateTo);

            rs = statement.executeQuery();

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Object[] row = new Object[6];

            while (rs.next()) {
                row[0] = rs.getObject("product");
                row[1] = rs.getObject("qty");
                row[2] = rs.getObject("price");
                row[3] = rs.getObject("amount");
                row[4] = rs.getObject("category_name");
                row[5] = rs.getObject("order_date");

                model.addRow(row);
                
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(); // Handle exceptions properly
        } finally {
            try {
                if (rs != null) rs.close();
                if (statement != null) statement.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }
    public void QueryIncomeSale(JLabel label1, JLabel label2, String product_name, String category_name, String dateFrom, String dateTo){
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false", "root", "");

            String qry = "SELECT sum(c.qty), sum(i.total)  FROM order_detail c JOIN products p ON c.product_id = p.product_id JOIN category cat ON p.category_id = cat.category_id JOIN orders i ON c.order_id = i.order_id WHERE 1=1";

            if (!product_name.equals("All")) {
                qry += " AND product = ?";
            }
            if (!category_name.equals("All")) {
                qry += " AND category_name = ?";
            }
            qry += " AND order_date BETWEEN ? AND ?";

            statement = (PreparedStatement) con.prepareStatement(qry);

            int parameterIndex = 1;
            if (!product_name.equals("All")) {
                statement.setString(parameterIndex++, product_name);
            }
            if (!category_name.equals("All")) {
                statement.setString(parameterIndex++, category_name);
            }
            statement.setString(parameterIndex++, dateFrom);
            statement.setString(parameterIndex, dateTo);

            rs = statement.executeQuery();
            while (rs.next()) {
                String totalexport = rs.getString("sum(c.qty)");
                label1.setText(totalexport);
                
                String totalsale = rs.getString("sum(i.total)");
                label2.setText(totalsale);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(); // Handle exceptions properly
        } finally {
            try {
                if (rs != null) rs.close();
                if (statement != null) statement.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }
}
