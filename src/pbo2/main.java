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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dokter dkt = new dokter();
        pasien psn = new pasien();
        klinik klnk = new klinik();

        klnk.setNama("Sumber Kasih");
        klnk.setIdKlinik("jh6g");

        psn.setNama("Frischa");
        psn.setTempatLahir("Jakarta");
        psn.setAlamat("Jln. Fatmawati");

        dkt.setNama("Dr. Anisa");
        dkt.setNomorPegawai("1435679");
        dkt.setTanggalLahir(31);
        dkt.setBulanLahir(5);
        dkt.setTempatLahir("Palembang");
        dkt.setAlamat("Jl. Senopati");

        System.out.println("Nama Klinik     :" + klnk.getNama());
        System.out.println("ID Klinik       :" + klnk.getIdKlinik());
        System.out.println("========================================");

        try {
            psn.setTanggalLahir(18);
            psn.setBulanLahir(03);
            psn.setTahunLahir(1998);
            psn.setNoRekamMedis("jklh");
            System.out.println("Nama Pasien     :" + psn.getNama());
            System.out.println("No. Rekam Medis :" + psn.getNoRekamMedis());
            System.out.println("TTL             :" + psn.getTempatLahir() + (",") + psn.getTanggalLahir() + ("-") + psn.getBulanLahir() + ("-") + psn.getTahunLahir());
            System.out.println("Alamat Pasien   :" + psn.getAlamat());
            System.out.println("========================================");
        } catch (Exception la) {
            System.out.println(la);
        }
        System.out.println("Data Dokter");
        System.out.println("Nama Dokter     :" + dkt.getNama());
        System.out.println("Nomor Pegawai   :" + dkt.getNomorPegawai());
        System.out.println("Tempat Lahir    :" + dkt.getTempatLahir());
        System.out.println("Alamat Dokter   :" + dkt.getAlamat());

        try {
            System.out.print("Tanggal Lahir   :");
            dkt.getKelahiran();
        } catch (Exception la) {
            System.out.println(la);
        }
    }

}
