/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author TUF
 */
public class Characters {
    private String name;
    private String element;
    private String bodytype;
    private String country;
    private String weapon;
    
    public Characters(String name, String element, String bodytype, String country, String weapon){
        this.name = name;
        this.element = element;
        this.bodytype = bodytype;
        this.country = country;
        this.weapon = weapon;
    }
    
    public String getName(){
        return name;
    }
    public String getElement(){
        return element;
    }
    public String getBodyType(){
        return bodytype;
    }
    public String getCountry(){
        return country;
    }
    public String getWeapon(){
        return weapon;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setElement(String element){
        this.element = element;
    }
    public void setBodyType(String bodytype){
        this.bodytype = bodytype;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
   
}
