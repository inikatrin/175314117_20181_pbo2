/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streamtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Personal
 */
public class testStreaming1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileInputStream fis = null;
        try {
            File file = new File("test.txt");
            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;
            while ((dataInt = fis.read()) != -1) {
                hasilBaca = hasilBaca + (char) dataInt;
            }
            System.out.println(hasilBaca);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(testStreaming1.class.getName()).log(Level.SEVERE,null, ex);
        }catch(IOException ex){
            Logger.getLogger(testStreaming1.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
        }
    }

}
