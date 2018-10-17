/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streamtest;

import java.io.File;
import model.pasien;

/**
 *
 * @author Personal
 */
public class testStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pasien test = new pasien();
        test.setNama("puspa");
        test.setAlamat("klaten");
        
        pasien test1 = new pasien();
        test1.setNama("adi");
        test1.setAlamat("klaten");
        
        System.out.println(test.toString());
        System.out.println(test1.toString());
        
        pasien.tambahPasien(test);
        pasien.tambahPasien(test1);
        
        pasien.simpanDaftarPasien(new File("daftar.txt"));
    }
    }
    

