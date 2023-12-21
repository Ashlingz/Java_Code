/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.iotest;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author TUF
 */
public class IOtest {

    public static void main(String[] args){
             
        try {
            String filePath = "Dictionary.txt";
            String line;
            String letter = "App";
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(letter + ".txt"));
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(letter)) {
                    System.out.println(line);
                    writer.write(line);
                    writer.newLine();  
                } 
            } 
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
       
    }
}
