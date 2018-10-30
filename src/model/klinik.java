/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Personal
 */
public class klinik {

    private String idKlinik;//variabel idKlinik bertipe data String dan bersifat private
    private String namaKlinik;//variabel nama bertipe data String dan bersifat private
    public static ArrayList<klinik> daftarKlinik = new ArrayList<klinik>();

    public static ArrayList<klinik> getDaftarKlinik() {
        return daftarKlinik;
    }
    
    public klinik(String idKlinik, String namaKlinik) {
        this.idKlinik = idKlinik;
        this.namaKlinik = namaKlinik;
    }
    
    public klinik() {

    }

    public String getIdKlinik() {//method getIdKlinik bertipe data String yang mengembalikan variabel idKlinik 
        return idKlinik;
    }

    public void setIdKlinik(String idKlinik) {//method void setIdKlinik dengan parameter idKlinik bertipe data String
        this.idKlinik = idKlinik;
    }

    public String getNamaKlinik() {//method getNama bertipe data String yang mengembalikan variabel nama
        return namaKlinik;
    }

    public void setNamaKlinik(String namaKlinik) {//method void setNama dengan parameter nama bertipe data String
        this.namaKlinik = namaKlinik;
    }

    public void printInfo() {
        System.out.println("");
        System.out.println("Klinik" + " " + getNamaKlinik().toUpperCase());
        System.out.println("Nomor ID Klinik : " + getIdKlinik());     
    }

}
