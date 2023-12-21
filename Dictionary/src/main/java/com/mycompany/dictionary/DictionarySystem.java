/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dictionary;

import java.io.Serializable;

/**
 *
 * @author TUF
 */
public class DictionarySystem implements Serializable {
    private String word;
    
    public DictionarySystem(String word){
        this.word = word;
    }
    
    public String getWord(){
        return word;
    }
}
