/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managment;

/**
 *
 * @author TUF
 */
public class stockSystem {

    public stockSystem(int id, String pname, int qty, String datein, String dateout) {
        this.id = id;
        this.pname = pname;
        this.qty = qty;
        this.datein = datein;
        this.dateout = dateout;
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

    public String getDatein() {
        return datein;
    }

    public void setDatein(String datein) {
        this.datein = datein;
    }

    public String getDateout() {
        return dateout;
    }

    public void setDateout(String dateout) {
        this.dateout = dateout;
    }
    private int id;
    private String pname;
    private int qty;
    private String datein;
    private String dateout;
}
