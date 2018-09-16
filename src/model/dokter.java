/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Personal
 */
public class dokter {

    private String nomorPegawai, nama, alamat, tempatLahir;//variabel nomorPegawai, nama, alamat, tempatLahir bertipe data String dan bersifat private
    private int tanggalLahir, tahunLahir, bulanLahir;//variabel tanggalLahir bertipe data integer dan bersifat private

    public dokter() {//kontraktor dari variabel dokter

    }

    public int getTahunLahir() {//method getTahunLahir bertipe data String yang akan mengembalikan variabel tahunLahir
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {//method void setTahunLahir dengan parameter tahunLahir bertipe data String
        this.tahunLahir = tahunLahir;
    }

    public int getBulanLahir() {//method getBulanLahir bertipe data String yang akan mengembalikan variabel bulanLahir
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) {//method void setBulanLahir dengan parameter bulanLahir bertipe data String
        this.bulanLahir = bulanLahir;
    }

    public String getNomorPegawai() {//method getNomorPegawai bertipe data String yang akan mengembalikan variabel nomorPegawai
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) throws NumberFormatException {//method void setNomorPegawai dengan parameter nomorPegawai bertipe data String dengan menambahkan throws NumberFormatException
        if (nomorPegawai.length() >= 6) {//dalam langkah ini jika NomorPegawai lebih besar sama dengan 6 dan benar, maka dia akan berhenti dan mencetaknya
            this.nomorPegawai = nomorPegawai;
        } else {
            throw new NumberFormatException("nomor pegawai anda salah.");//dan jika data nomor pegawai salah maka fungsi dari throw new NumberFormatException tsb akan bekerja dan mencetak bahwa noomor pegawai tsb salah
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

    public String getTempatLahir() {//method getTempatLahir bertipe data String yang akan mengembalikan variabel tempatLahir
        return tempatLahir;
    }
    
    public void getTanggalKelahiran(){
        Date tanggalKelahiran=new Date(getTahunLahir()-1990, getBulanLahir()-1, getTanggalLahir());
        SimpleDateFormat ft= new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(ft.format(tanggalKelahiran));
    }

    public void setTempatLahir(String tempatLahir) {//method void setTempatLahir dengan parameter tempatLahir bertipe data String
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {//method getTanggalLahir bertipe data integer yang akan mengembalikan variabel tanggalLahir
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws NumberFormatException {//method void setTanggalLahir dengan parameter tanggalLahir bertipe data integer dengan menambahkan throws NumberFormatException
        if (tanggalLahir > 0 && tanggalLahir < 32) {//dalam langkah ini jika tanggalLahir lebih lebih besar dari 0 dan lebih kecil dari 32 dan benar, maka dia akan berhenti dan mencetaknya
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new NumberFormatException("salah ditanggalnya");//dan jika data tanggalLahir salah maka fungsi dari throw new NumberFormatException tsb akan bekerja dan mencetak bahwa tanggalLahir tsb salah
        }
    }

    public void getKelahiran() {
        Date date = new Date(getTahunLahir() - 1990, getBulanLahir() - 6, getTanggalLahir() - 15);
        SimpleDateFormat la = new SimpleDateFormat("dd-mm-yyyy");
        System.out.println(la.format(date));
    }
}
