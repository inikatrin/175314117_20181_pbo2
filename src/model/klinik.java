/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Personal
 */
public class klinik {

    private String idKlinik;//variabel idKlinik bertipe data String dan bersifat private
    private String nama;//variabel nama bertipe data String dan bersifat private

    public klinik(String idKlinik, String nama) {
        this.idKlinik = idKlinik;
        this.nama = nama;
    }
    
    public klinik() {

    }

    public String getIdKlinik() {//method getIdKlinik bertipe data String yang mengembalikan variabel idKlinik 
        return idKlinik;
    }

    public void setIdKlinik(String idKlinik) {//method void setIdKlinik dengan parameter idKlinik bertipe data String
        this.idKlinik = idKlinik;
    }

    public String getNama() {//method getNama bertipe data String yang mengembalikan variabel nama
        return nama;
    }

    public void setNama(String nama) {//method void setNama dengan parameter nama bertipe data String
        this.nama = nama;
    }

    public void printInfo() {
        System.out.println("");
        System.out.println("Klinik" + " " + getNama().toUpperCase());
        System.out.println("Nomor ID Klinik : " + getIdKlinik());     
    }

}
