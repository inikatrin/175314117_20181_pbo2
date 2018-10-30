/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Streamtest.testStreaming1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Personal
 */
public class pasien implements Serializable{

    private String noRekamMedis, nama, alamat, tempatLahir, nik;//variabel noRekamMedis, nama, alamat, tempatLahir bertipe data String dan bersifat private
    private int bulanLahir, tahunLahir, tanggalLahir, tanggalAntrian;//variabeltanggalLahir, bulanLahir, tahunLahir bertipe data integer dan bersifat private
    
    public static ArrayList<pasien> daftarPasienKlinik = new ArrayList<pasien>();
//    private Date tanggalLahir;
//    private Date tanggalAntrian;

    public pasien() {

    }

    public pasien(String puspa, String klaten, String medan, int i, int i0, int i1, String string) {

    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) throws Exception {
        if (nik.length() <= 4) {//dalam langkah ini jika noRekamMedis lebih kecil sama dengan 4 dan benar, maka dia akan berhenti dan mencetaknya
            String NIK = nik;
            this.nik = nik;
            this.setNoRekamMedis(NIK);
        } else {
            throw new Exception("nomor data anda salah.");//dan jika data noRekamMedis salah maka fungsi dari throw new NumberFormatException tsb akan bekerja dan mencetak bahwa noRekamMedis tsb salah
        }
    }

    public static void tambahPasienBaru(pasien test) {
        daftarPasienKlinik.add(test);
    }

    public static pasien cariPasien(String noRM) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (daftarPasienKlinik.get(i).getNoRekamMedis() == noRM) {
                return daftarPasienKlinik.get(i);
            }
        }
        return null;
    }

    public String getNoRekamMedis() {//method getNoRekamedis bertipe data String yang akan mengembalikan variabel noRekamMedis
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {//method void dengan menambahkan throws NumberFormatException
//        if (noRekamMedis.length() <= 4) {//dalam langkah ini jika noRekamMedis lebih kecil sama dengan 4 dan benar, maka dia akan berhenti dan mencetaknya
        this.noRekamMedis = noRekamMedis;
//        } else {
//            throw new Exception("nomor data anda salah.");//dan jika data noRekamMedis salah maka fungsi dari throw new NumberFormatException tsb akan bekerja dan mencetak bahwa noRekamMedis tsb salah
//        }
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

    public int getTanggalLahir() {//method getTanggalLahir bertipe data integer yang akan mengembalikan variabel tanggalLahir
        return tanggalLahir;
    }

    /**
     *
     */
    public void getTanggalKelahiran() {
        Date tanggalKelahiran = new Date(getTahunLahir() - 1990, getBulanLahir() - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(ft.format(tanggalKelahiran));
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0 && tanggalLahir < 32) {
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception("Tanggal yang dimasukan salah");
        }
    }

//    public void setTanggalLahir(int tahun, int bulan, int tanggal) {
//        tanggalLahir = new Date(tahun - 1900, bulan - 1, tanggal);
//    }
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

    public static void simpanDaftarPasien(File file) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file, false);
            for (int i = 0; i < daftarPasienKlinik.size(); i++) {
                String data = daftarPasienKlinik.get(i).toString();
                fos.write(data.getBytes());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void bacaDaftarPasien(File file) throws FileNotFoundException, IOException, Exception {
        FileInputStream fis = null;
        String baca = "";
        fis = new FileInputStream(file);
        int dataInt;
        boolean noRekamMedis = false;
        boolean nama = false;
        boolean alamat = false;
        pasien temp = new pasien();
        try {
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    if ((char) dataInt != '\t' && noRekamMedis == false) {
                        baca = baca + (char) dataInt;
                    } else if ((char) dataInt == '\t' && noRekamMedis == false) {
                        temp.setNoRekamMedis(baca);
                        baca = "";
                        noRekamMedis = true;
                    } else if ((char) dataInt != '\t' && noRekamMedis == true && nama == false) {
                        baca = baca + (char) dataInt;
                    } else if ((char) dataInt == '\t' && noRekamMedis == true && nama == false) {
                        temp.setNama(baca);
                        baca = "";
                        nama = true;
                    } else if ((char) dataInt != '\t' && noRekamMedis == true && nama == true) {
                        baca = baca + (char) dataInt;
                    }
                } else {
                    temp.setAlamat(baca);
                    baca = "";
                    alamat = true;
                    pasien.tambahPasienBaru(temp);
                    noRekamMedis = false;
                    nama = false;
                    alamat = false;
                    temp = new pasien();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(testStreaming1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(testStreaming1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<pasien> getDaftarPasienKlinik() {
        return daftarPasienKlinik;
    }

    public void printInfo() {
        System.out.println("Nomor Rekam Medis Pasien : " + getNoRekamMedis());
        System.out.println("Nama : " + getNama());
        System.out.print("Tempat, Tanggal Lahir : " + getTempatLahir() + ",");
        getTanggalKelahiran();
        System.out.println("Alamat : " + getAlamat());
    }

    /**
     *
     */
    @Override
    public String toString() {
        return String.format(nama + "\n" + alamat + "\n");
    }
}
