/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.File;
import model.RumahSakit;
import model.pasien;

/**
 *
 * @author Personal
 */
public class testRumahSakit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
         pasien pasien1 = new pasien();
        
        pasien1.setNama("Puspa");
        pasien1.setAlamat("klaten");

        pasien pasien2 = new pasien();
       
        pasien2.setNama("Adi");
        pasien2.setAlamat("yogya");

        RumahSakit rs = new RumahSakit("Panti Rapih", "Yogyakarta");

        rs.tambahPasienBaru(pasien1);
        rs.tambahPasienBaru(pasien2);

        rs.simpanObjekRumahSakit(new File("rsku.dat"));
        
    }
    
}
