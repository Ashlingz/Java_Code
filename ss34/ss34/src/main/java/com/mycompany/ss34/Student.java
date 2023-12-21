/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ss34;
import java.io.Serializable;
/**
 *
 * @author Heng Sovannarith
 */
public class Student implements Serializable{
    private String stname;
    private String stsex;
    private double stscore;
    
    public Student( String stname, String stsex, double stscore)
    {
        this.stname = stname;
        this.stsex = stsex;
        this.stscore = stscore;
    }
                     
    public String getName()
    {
        return stname;
    }
    public void setName(String stname)
    {
        this.stname = stname;
    }
    public String getSex(){
        return stsex;
    }
    public void setSex(String stsex){
        this.stsex = stsex;
    }
    public double getScore(){
        return stscore;
    }
    public void setScore(double stscore){
        this.stscore = stscore;
    }
}
