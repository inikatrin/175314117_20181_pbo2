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
public class pasien {

    private String noRekamMedis, nama, alamat, tempatLahir, nik;//variabel noRekamMedis, nama, alamat, tempatLahir bertipe data String dan bersifat private
    private int bulanLahir, tahunLahir;//variabeltanggalLahir, bulanLahir, tahunLahir bertipe data integer dan bersifat private
    public static ArrayList<pasien> daftarPasienKlinik = new ArrayList<pasien>();
    private Date tanggalLahir;
    private Date tanggalAntrian;
    
    public pasien(String pasien){
        
    }
   
    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void tambahPasienBaru(pasien test) {
        daftarPasienKlinik.add(bulanLahir, test);
    }

    public static pasien cariPasien(String string) {
        return null;
    }

    public String getNoRekamMedis() {//method getNoRekamedis bertipe data String yang akan mengembalikan variabel noRekamMedis
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) throws NumberFormatException {//method void dengan menambahkan throws NumberFormatException
        if (noRekamMedis.length() <= 4) {//dalam langkah ini jika noRekamMedis lebih kecil sama dengan 4 dan benar, maka dia akan berhenti dan mencetaknya
            this.noRekamMedis = noRekamMedis;
        } else {
            throw new NumberFormatException("nomor data anda salah.");//dan jika data noRekamMedis salah maka fungsi dari throw new NumberFormatException tsb akan bekerja dan mencetak bahwa noRekamMedis tsb salah
        }
    }

    public String getNama() {//method getNama bertipe data String yang akan mengembalikan variabel nama
        return nama;
    }

    public void setNama(String nama) {//method void setNama dengan parameter nama bertipe data String
        this.nama = nama;
    }

    public String getAlamat() {//method getAlamat bertipe data String yang akan mengembalikan variabel alamat
        return alamat;
    }

    public void setAlamat(String alamat) {//method void setAlamat dengan parameter alamat bertipe data String
        this.alamat = alamat;
    }

    public String getTempatLahir() {//method getTempatLahir bertipe data String yang akan mengembalikan variabel alamat
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {//method void setTempatLahir dengan parameter tempatLahir bertipe data String
        this.tempatLahir = tempatLahir;
    }

    public Date getTanggalLahir() {//method getTanggalLahir bertipe data integer yang akan mengembalikan variabel tanggalLahir
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setTanggalLahir(int tahun, int bulan, int tanggal) {
        tanggalLahir = new Date(tahun - 1900, bulan - 1, tanggal);
    }

    public int getUsia() {
        Date today = new Date();
        return today.getYear() - tanggalLahir.getYear();
    }

    public int getBulanLahir() {//method getBulanLahir bertipe data integer  yang akan mengembalikan variabel bulanLahir
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) throws NumberFormatException {//method void setBulanLahir dengan parameter bulanLahir bertipe data integer dengan menambahkan throws NumberFormatException
        if (bulanLahir > 0 && bulanLahir < 13) {//dalam langkah ini jika bulanLahir lebih lebih besar dari 0 dan lebih kecil dari 13 dan benar, maka dia akan berhenti dan mencetaknya
            this.bulanLahir = bulanLahir;
        } else {
            throw new NumberFormatException("salah bulannya nih"); //dan jika data BulanLahir salah maka fungsi dari throw new NumberFormatException tsb akan bekerja dan mencetak bahwa bulanLahir tsb salah
        }

    }

    public int getTahunLahir() {//method getTahunLahir bertipe data integer yang akan mengembalikan variabel tahunLahir
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) throws NumberFormatException {//method void setTahunLahir dengan parameter tahunLahir bertipe data integer dengan menambahkan throws NumberFormatException
        if (tahunLahir > 0) {//dalam langkah ini jika tahunLahir lebih lebih besar dari 0 dan benar, maka dia akan berhenti dan mencetaknya
            this.tahunLahir = tahunLahir;
        } else {
            throw new NumberFormatException("salah tahunnya nih..");//dan jika data TahunLahir salah maka fungsi dari throw new NumberFormatException tsb akan bekerja dan mencetak bahwa tahunLahir tsb salah
        }

    }

    public void setTanggalLahir(int i) {
        
    }
}
