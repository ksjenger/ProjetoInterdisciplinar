/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kauan
 */
public class FuncionarioBean {
        private static String path;
        private Integer id = 0;
        
        public static void tempWriterUser(Integer id) {
        try {
            File tempFile = File.createTempFile("user", ".tmp");
            path = tempFile.getAbsolutePath();
            System.out.println("Temp file On Default Location: " + tempFile.getAbsolutePath());
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {
                bw.write("" + id);
            }
            String pathFile = tempFile.getAbsolutePath();
            tempFile.deleteOnExit();
        } catch (IOException e) {
        }
    }
    
    public String tempReadOrder(){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            id = reader.readLine();
            reader.close();
            return id;
        } catch (IOException ex) {
            ex.printStackTrace();
        }   
        return null;
    }
}
