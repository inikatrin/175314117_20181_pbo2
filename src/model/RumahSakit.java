/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.pasien.daftarPasienKlinik;
import test.testRumahSakit;

/**
 *
 * @author Personal
 */
public class RumahSakit implements Serializable {

    private String nama;
    private String alamat;
    public ArrayList<pasien> daftarPasienKlinik = new ArrayList<pasien>();
    public ArrayList<klinik> daftarKlinik = new ArrayList<klinik>();
    public ArrayList<antrianKlinik> antrianKlinik = new ArrayList<antrianKlinik>();

    public RumahSakit() {

    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tambahPasien(pasien Pasien) {
         daftarPasienKlinik.add(Pasien);
    }

    public pasien cariPasien(String nama) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (daftarPasienKlinik.get(i).getNama().equals(nama)) {
                return daftarPasienKlinik.get(i);
            }
        }
        return null;
    }

    public void tambahPasienBaru(pasien Pasien) {
        pasien cari = this.cariPasien(Pasien.getNama());
        if (cari == null) {
            daftarPasienKlinik.add(Pasien);
        }
    }

    public void simpanDaftarPasien(File file) {
        FileOutputStream fus = null;
        try {
            fus = new FileOutputStream(file, false);
            for (int i = 0; i < daftarPasienKlinik.size(); i++) {
                String data = daftarPasienKlinik.get(i).toString();
                fus.write(data.getBytes());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fus.close();
            } catch (IOException ex) {
                Logger.getLogger(pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void bacaDaftarPasien(File file) throws Exception {
        FileInputStream fis = null;
        try {
            String baca = "";
            fis = new FileInputStream(file);
            int dataInt;
            boolean noRekamMedis = false;
            boolean nama = false;
            boolean alamat = false;
            pasien temp = new pasien();

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
            Logger.getLogger(testRumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(testRumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void simpanObjekRumahSakit(File file) {
        FileOutputStream fos = null;
        ObjectOutputStream os = null;
        try {
            fos = new FileOutputStream(file);
            os = new ObjectOutputStream(fos);
            os.writeObject(this);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public void bacaObjekRumahSakit(File file) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            RumahSakit rs = (RumahSakit) ois.readObject();
            this.setNama(rs.getNama());
            this.setAlamat(rs.getAlamat());
            this.setDaftarPasien(rs.getDaftarPasien());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public ArrayList<pasien> getDaftarPasien() {
        return daftarPasienKlinik;
    }

    public void setDaftarPasien(ArrayList<pasien> daftarPasien) {
        this.daftarPasienKlinik = daftarPasien;
    }

    public void tambahKlinik(klinik Klinik) {
         daftarKlinik.add(Klinik);
    }

    public klinik cariKlinik(String namaKlinik) {
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).getNamaKlinik().equals(namaKlinik)) {
                return daftarKlinik.get(i);
            }
        }
        return null;
    }

    public void buatAntrian(int tanggal, int bulan, int tahun, klinik Klinik) {

    }

    public int cariAntrian(int tanggal, int bulan, int tahun, klinik Klinik) {
        return 0;

    }

    public void daftarPasien(pasien Pasien, int bulan, int tahun, klinik Klinik) {

    }

    public ArrayList<klinik> getDaftarKlinik() {
        return null;
    }

    public void setDaftarKlinik(ArrayList<klinik> daftarKlinik) {
       
    }

    public ArrayList<antrianKlinik> getAntrianKlinik() {
        return null;
    }

    public void setAntrianKlinik(ArrayList<antrianKlinik> antrianPasien) {
       
    }

    @Override
    public String toString() {
        return String.format(nama);

    }
}
