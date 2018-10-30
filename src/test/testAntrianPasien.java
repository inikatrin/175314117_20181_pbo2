/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.antrianKlinik;
import static model.antrianKlinik.antrianPasien;
import model.klinik;
import model.pasien;

/**
 *
 * @author Personal
 */
public class testAntrianPasien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
           antrianKlinik.buatAntrian(21, 9, 2018, new klinik("001", "Anak"));
           antrianKlinik.buatAntrian(21, 9, 2018, new klinik("002", "Saraf"));
           //AntrianPasien.buatAntrian(21, 9, 2018, new Klinik("001", "Anak"));
           
           for (int i = 0; i < antrianKlinik.antrianPasien.size(); i++) {
               System.out.println(antrianKlinik.antrianPasien.get(i).getKlinik().getNamaKlinik());
           }
           System.out.println("\n");
           
           pasien pas1 = new pasien();
           pas1.setNama("Puspa");
           pas1.setAlamat("Klaten");
           
           pasien pas2 = new pasien();
           pas2.setNama("Adi");
           pas2.setAlamat("Klaten");
           
           int indeksAntrian;
            indeksAntrian = antrianKlinik.cariAntrian(21, 9, 2018, new klinik("001", "Anak"));
           if (indeksAntrian >= 0) {
               antrianKlinik.antrianPasien.get(indeksAntrian).Mendaftar(pas1);
               antrianKlinik.antrianPasien.get(indeksAntrian).Mendaftar(pas2);
           }
           
           for (int i = 0; i < antrianKlinik.antrianPasien.get(indeksAntrian).getDaftarPasien().size(); i++) {
               System.out.println(antrianKlinik.antrianPasien.get(indeksAntrian).getDaftarPasien().get(i).getNama());
           }
       } catch (Exception ex) {
           Logger.getLogger(testAntrianPasien.class.getName()).log(Level.SEVERE, null, ex);
       }

    }
    }
    

