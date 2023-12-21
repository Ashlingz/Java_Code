/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.read;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author TUF
 */
public class Read {

    public static void main(String[] args) {
        //Count Word
        String filePath = "file.txt";
        Map<String, Integer> wordCountMap = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");

                for (String word : words) {
                    if (wordCountMap.containsKey(word)) {
                        wordCountMap.put(word, wordCountMap.get(word) + 1);
                    } else {
                        wordCountMap.put(word, 1);
                    }
                }
            }
            
            System.out.println("Count Word");
            System.out.println("---------------");
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                System.out.println(entry.getKey() + " (" + entry.getValue() +")");
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        //Count Line
        List<String> filenames = new ArrayList<>();
        filenames.add("file1.txt");
        filenames.add("file2.txt");
        filenames.add("file3.txt");
        int totalLineCount = countLinesInMultipleFiles(filenames);
        
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Count Line");
        System.out.println("---------------");
        System.out.println("Number of lines in the all files: " + totalLineCount);
        
    }
    
    public static int countLines(String filenames) {
        int lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filenames))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineCount;
    }
        
    public static int countLinesInMultipleFiles(List<String> filenames) {
        int totalLineCount = 0;
        for (String filename : filenames) {
            int lineCount = countLines(filename);
            totalLineCount += lineCount;
        }
        return totalLineCount;
    }
}

