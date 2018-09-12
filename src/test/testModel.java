/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.antrianKlinik;
import model.dokter;
import model.klinik;
import model.pasien;

/**
 *
 * @author Personal
 */
public class testModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        klinik Klinik = new klinik();
        dokter Dokter = new dokter();
        pasien Pasien = new pasien();
        antrianKlinik antrian = new antrianKlinik();
        
        //klinik
        Klinik.setIdKlinik("9875FG65E");
        Klinik.setNama("Lentera Kasih");
        
        try{
            Dokter.setNama("Maria");
            Dokter.setNomorPegawai("4453TH90");
            Dokter.setTanggalLahir(12);
            Dokter.setBulanLahir(5);
            Dokter.setTahunLahir(1994);          
        }catch(Exception ex){
            System.out.println(ex);
        }Dokter.setAlamat("Denpasar");
        try{
            Pasien.setNik("134567890865");
            Pasien.setNama("Katrina Ni Luh Ariyantini");
            Pasien.setAlamat("Yogyakarta");
            Pasien.setTempatLahir("Denpasar");
            Pasien.setTanggalLahir(18);
            Pasien.setBulanLahir(3);
            Pasien.setTahunLahir(1999);
        }
    }

}
