/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.fileRead;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Admin
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try{
            String fileName="C:/Users/Admin/Desktop/abc.txt";
       URL url = new URL("http://www.jobsnepal.com");
            URLConnection conn=url.openConnection();
            
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }   // TODO code application logic here
    }
    
}
