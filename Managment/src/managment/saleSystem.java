/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managment;

import java.text.DecimalFormat;
import java.util.Date;

/**
 *
 * @author TUF
 */
public class saleSystem {
    private int id;
    private String pname;
    private int qty;
    private int price;
    private Date saleDate;
    private double total;
    
    public saleSystem(int id, String pname, int qty, int price, double total, Date saleDate){
        this.id = id;
        this.pname = pname;
        this.qty = qty;
        this.price = price;
        this.total = total;
        this.saleDate = saleDate;
    }
    
   
    public int getId() {
        
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}
