/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Personal
 */
public class antrianKlinik {

    private int bulanAntrian, tahunAntrian;//variabel tanggalAntrian, bulanAntrina, tahunAntrian bertipe data String dan bersifat private
    private klinik Klinik;//variabel klinik Klinik bertipe data Klinik bersifat private
    private Date tanggalAntrian;
    private ArrayList<pasien> daftarPasien = new ArrayList<pasien>();

    public void mendaftar(pasien Pasien) {
        daftarPasien.add(Pasien);
    }

    public Date getTanggalAntrian() {//method getTanggalAntrian yang mengembalikan variabel tanggalAntrian
        return tanggalAntrian;
    }

    public void setTanggalAntrian(Date tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    public int getBulanAntrian() {//method getBulanAntrian bertipe data integer yang mengembalikan varianel bulanAntrian
        return bulanAntrian;
    }

    public void setBulanAntrian(int bulanAntrian) throws NumberFormatException {//method void setBulanAntrian dengan parameter bulanAntrianr bertipe data integer dengan menambahkan throws NumberFormatException
        if (bulanAntrian > 0 && bulanAntrian < 13) {//dalam langkah ini jika bulanAntrian lebih lebih besar dari 0 dan lebih kecil dari 13 dan benar, maka dia akan berhenti dan mencetaknya
            this.bulanAntrian = bulanAntrian;
        } else {
            throw new NumberFormatException("salah bulannya nih"); //dan jika data BulanAntrian salah maka fungsi dari throw new NumberFormatException tsb akan bekerja dan mencetak bahwa bulanAntrian tsb salah
        }

    }

    public int getTahunAntrian() {//method getTahunAntrian yang mengembalikan variabel tahunAntrian
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) throws NumberFormatException {//method void setTahunAntrian dengan parameter tahunAntrian bertipe data integer dengan menambahkan throws NumberFormatException
        if (tahunAntrian > 0) {//dalam langkah ini jika tahunAntrian lebih lebih besar dari 0 dan benar, maka dia akan berhenti dan mencetaknya
            this.tahunAntrian = tahunAntrian;
        } else {
            throw new NumberFormatException("salah tahunnya nih..");//dan jika data TahunAntrian salah maka fungsi dari throw new NumberFormatException tsb akan bekerja dan mencetak bahwa tahunAntrian tsb salah
        }
    }

    public klinik getKlinik() {//method getKlinik yang mengembalikan variabel Klinik
        return Klinik;
    }

    public void setKlinik(klinik Klinik) {//method void setKlinik dengan parameter Klinik
        this.Klinik = Klinik;
    }

    public ArrayList<pasien> getDaftarPasien() {//method getDaftarPasien yang mengembalikan array variabel Pasien
        return daftarPasien;
    }

    public void setDaftarPasien(ArrayList<pasien> daftarPasien) {
        this.daftarPasien = daftarPasien;
    }

    public void printInfo() {
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Daftar Antrian Pasien");
        System.out.println("------------------------------------");
        for (int i = 0; i < daftarPasien.size(); i++) {
            daftarPasien.get(i).printInfo();

        }

    }
}
