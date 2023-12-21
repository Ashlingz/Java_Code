/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.convertbinary;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author TUF
 */
public class ConvertBinary {

    public static void main(String[] args) throws IOException {
        //private ArrayList<dictionarySystem> SS34;
        System.out.println("Hello World!");
        FileWriter writer = new FileWriter("Dictonary.txt");
 
        FileOutputStream fos = new FileOutputStream("student.dat");
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(SS34);
        out.close();
        fos.close();
        
        
        
        
    }
}
