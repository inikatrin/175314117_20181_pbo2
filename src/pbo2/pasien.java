/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2;

/**
 *
 * @author Personal
 */
public class pasien {

    private String noRekamMedis, nama, alamat, tempatLahir;//variabel noRekamMedis, nama, alamat, tempatLahir bertipe data String dan bersifat private
    private int tanggalLahir, bulanLahir, tahunLahir;//variabeltanggalLahir, bulanLahir, tahunLahir bertipe data integer dan bersifat private

    public String getNoRekamMedis() {//method getNoRekamedis bertipe data String yang akan mengembalikan variabel noRekamMedis
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) throws Exception {//method void dengan menambahkan throws Exception
        if (noRekamMedis.length() <= 4) {//dalam langkah ini jika noRekamMedis lebih kecil sama dengan 4 dan benar, maka dia akan berhenti dan mencetaknya
            this.noRekamMedis = noRekamMedis;
        } else {
            throw new Exception("nomor data anda salah.");//dan jika data noRekamMedis salah maka fungsi dari throw new Exception tsb akan bekerja dan mencetak bahwa noRekamMedis tsb salah
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

    public int getTanggalLahir() {//method getTanggalLahir bertipe data integer yang akan mengembalikan variabel tanggalLahir
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {//method void setTanggalLahir dengan parameter tanggalLahir bertipe data integer dengan menambahkan throws Exception
        if (tanggalLahir > 0 && tanggalLahir < 32) {//dalam langkah ini jika tanggalLahir lebih lebih besar dari 0 dan lebih kecil dari 32 dan benar, maka dia akan berhenti dan mencetaknya
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception("salah ditanggalnya");//dan jika data tanggalLahir salah maka fungsi dari throw new Exception tsb akan bekerja dan mencetak bahwa tanggalLahir tsb salah
        }
    }

    public int getBulanLahir() {//method getBulanLahir bertipe data integer  yang akan mengembalikan variabel bulanLahir
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception {//method void setBulanLahir dengan parameter bulanLahir bertipe data integer dengan menambahkan throws Exception
        if (bulanLahir > 0 && bulanLahir < 13) {//dalam langkah ini jika bulanLahir lebih lebih besar dari 0 dan lebih kecil dari 13 dan benar, maka dia akan berhenti dan mencetaknya
            this.bulanLahir = bulanLahir;
        } else {
            throw new Exception("salah bulannya nih"); //dan jika data BulanLahir salah maka fungsi dari throw new Exception tsb akan bekerja dan mencetak bahwa bulanLahir tsb salah
        }

    }

    public int getTahunLahir() {//method getTahunLahir bertipe data integer yang akan mengembalikan variabel tahunLahir
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) throws Exception {//method void setTahunLahir dengan parameter tahunLahir bertipe data integer dengan menambahkan throws Exception
        if (tahunLahir > 0) {//dalam langkah ini jika tahunLahir lebih lebih besar dari 0 dan benar, maka dia akan berhenti dan mencetaknya
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("salah tahunnya nih..");//dan jika data TahunLahir salah maka fungsi dari throw new Exception tsb akan bekerja dan mencetak bahwa tahunLahir tsb salah
        }

    }

}
