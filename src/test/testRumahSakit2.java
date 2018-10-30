/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.File;
import java.util.ArrayList;
import model.RumahSakit;
import model.pasien;

/**
 *
 * @author Personal
 */
public class testRumahSakit2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RumahSakit rs = new RumahSakit();
        
        rs.bacaObjekRumahSakit(new File("rsku.dat"));       
        System.out.println("Nama RS = "+rs.getNama());
        System.out.println("Alamat = "+rs.getAlamat());
        ArrayList<pasien> daftar = rs.getDaftarPasien();
        for (int i = 0; i < daftar.size(); i++) {
            System.out.println("Pasien = "+daftar.get(i).toString());
        }       
    }
    
}
