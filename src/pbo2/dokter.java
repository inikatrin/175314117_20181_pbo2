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
public class dokter {

    private String nomorPegawai, nama, alamat, tempatLahir;//variabel nomorPegawai, nama, alamat, tempatLahir bertipe data String dan bersifat private
    private int tanggalLahir;//variabel tanggalLahir bertipe data integer dan bersifat private

    public dokter() {//kontraktor dari variabel dokter

    }

    public String getNomorPegawai() {//method getNomorPegawai bertipe data String yang akan mengembalikan variabel nomorPegawai
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) throws Exception {//method void setNomorPegawai dengan parameter nomorPegawai bertipe data String dengan menambahkan throws Exception
        if (nomorPegawai.length() >= 6) {//dalam langkah ini jika NomorPegawai lebih besar sama dengan 6 dan benar, maka dia akan berhenti dan mencetaknya
            this.nomorPegawai = nomorPegawai;
        } else {
            throw new Exception("nomor pegawai anda salah.");//dan jika data nomor pegawai salah maka fungsi dari throw new Exception tsb akan bekerja dan mencetak bahwa noomor pegawai tsb salah
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
}
