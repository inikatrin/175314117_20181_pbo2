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
    private int tanggalAntrian;
    private ArrayList<pasien> daftarPasien = new ArrayList<pasien>();
    public static ArrayList<antrianKlinik> antrianPasien = new ArrayList<antrianKlinik>();

    public void mendaftar(pasien Pasien) {
        daftarPasien.add(Pasien);
    }
    
    public antrianKlinik() {

    }
    
     public int getTanggalAntrian() {
        return tanggalAntrian;
    }
     
    public void setTanggalAntrian(int tanggalAntrian) {
       this.tanggalAntrian=tanggalAntrian;
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

    public static antrianKlinik cariPasien(String noRM) {
        for (int i = 0; i < antrianPasien.size(); i++) {
            if (antrianPasien.get(i).daftarPasien.equals(noRM)) {
                return antrianPasien.get(i);
            }
        }
        return null;
    }

    public static int cariAntrian(int tanggal, int bulan, int tahun, klinik klinik) {
        for (int i = 0; i < antrianPasien.size(); i++) {
            if (antrianPasien.get(i).getTanggalAntrian() == tanggal) {
                if (antrianPasien.get(i).getBulanAntrian() == bulan) {
                    if (antrianPasien.get(i).getTahunAntrian() == tahun) {
                        if (antrianPasien.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())) {
                            return i;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static void buatAntrian(int tanggal, int bulan, int tahun, klinik klinik) throws Exception {
        antrianKlinik antrian = new antrianKlinik();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        if (cariAntrian(tanggal, bulan, tahun, klinik) == -1) {
            antrianPasien.add(antrian);
        } else {
            throw new Exception("Data sudah terdaftar");
        }
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

    public void Mendaftar(pasien pas1) {
       daftarPasien.add(pas1);  
    }
}
