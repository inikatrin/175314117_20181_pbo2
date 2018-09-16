/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.antrianKlinik;
import model.dokter;
import model.klinik;
import model.pasien;

/**
 *
 * @author Personal
 */
public class testModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        klinik Klinik = new klinik();
        dokter Dokter = new dokter();
        pasien Pasien = new pasien();
        pasien Pasien2 = new pasien();
        antrianKlinik antrian = new antrianKlinik();

        //klinik
        Klinik.setIdKlinik("9875FG65E");
        Klinik.setNama("Lentera Kasih");

        try {
            Pasien.setNik("134567890865");
            Pasien.setNama("Katrina Ni Luh Ariyantini");
            Pasien.setAlamat("Yogyakarta");
            Pasien.setTempatLahir("Denpasar");
            Pasien.setTanggalLahir(18);
            Pasien.setBulanLahir(3);
            Pasien.setTahunLahir(1999);

            Pasien2.setNik("1456273889");
            Pasien2.setNama("Rosa Tiranda");
            Pasien2.setAlamat("Sleman");
            Pasien2.setTempatLahir("Tanjung Pinang");
            Pasien2.setTanggalLahir(31);
            Pasien2.setBulanLahir(7);
            Pasien2.setTahunLahir(1999);

            Dokter.setNama("Maria");
            Dokter.setNomorPegawai("4453TH90");
            Dokter.setTanggalLahir(12);
            Dokter.setBulanLahir(5);
            Dokter.setTahunLahir(1994);
            Dokter.setAlamat("Jln. Ngurah Rai no.537");
            Dokter.setTempatLahir("Palembang");

            antrian.mendaftar(Pasien);
            antrian.mendaftar(Pasien2);
            antrian.setKlinik(Klinik);

        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("Nama Klinik     : " + antrian.getKlinik().getNama());
        System.out.println("ID Klinik       : " + antrian.getKlinik().getIdKlinik());
        System.out.println("");

        for (int i = 0; i < antrian.getDaftarPasien().size(); i++) {
            antrian.getTanggalAntrian();
            System.out.println("Pasien "+ "ke-"+(i+1)+" "+antrian.getDaftarPasien().get(i).getNama());
            System.out.println("");
            System.out.println("        ");
            System.out.println("DATA PASIEN");
            System.out.println("-------------------------------");
            System.out.println("Nama Pasien     : "+ antrian.getDaftarPasien().get(i).getNama());
            System.out.println("Tempat Lahir    : "+ antrian.getDaftarPasien().get(i).getTempatLahir());
            System.out.println("Tanggal Lahir   : ");
            antrian.getDaftarPasien().get(i).getTanggalKelahiran();
            System.out.println("");
            System.out.println("Alamat Pasien       : "+antrian.getDaftarPasien().get(i).getAlamat());
            System.out.println("Nomor Rekam Medis   : "+antrian.getDaftarPasien().get(i).getNoRekamMedis());
            System.out.println("");
            System.out.println("        ");
            System.out.println("DATA DOKTER");
            System.out.println("-------------------------------");
            System.out.println("Nama Dokter       : "+Dokter.getNama());
            System.out.println("Nomor Pegawai     : "+Dokter.getNomorPegawai());
            System.out.println("Tampat Lahir      : "+Dokter.getTempatLahir());
            System.out.println("Tanggal Lahir     : ");
            Dokter.getTanggalKelahiran();
            System.out.println("");
            System.out.println("Alamat Dokter      : "+Dokter.getAlamat());
            System.out.println("");
        }
    }
}
