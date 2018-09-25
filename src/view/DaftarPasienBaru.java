/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.klinik;
import model.pasien;

/**
 *
 * @author Personal
 */
public class DaftarPasienBaru extends JFrame implements ActionListener {

    private JTextField NikText;
    private JTextField alamatText;
    private JRadioButton priaRadio;
    private JRadioButton perempuanRadio;
    private JComboBox tanggalCombo;
    private JComboBox bulanCombo;
//    private JComboBox klinikButton;
    private JComboBox tahunCombo;
    private JButton tambahButton;
    JLabel judulLabel;
    JLabel namaLabel;
//    JLabel klinikLabel;
    JLabel alamatLabel;
    JLabel tanggalLabel;
    JLabel NikLabel;
    JLabel jenisKelaminLabel;
    JTextField namaText;
    JButton saveButton;

    public JTextField getNikText() {
        return NikText;
    }

    public void setNikText(JTextField NikText) {
        this.NikText = NikText;
    }

    public DaftarPasienBaru(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);
        //judul 
        judulLabel = new JLabel("FORM PASIEN BARU");
        judulLabel.setBounds(250, 15, 150, 10);
        this.add(judulLabel);

        //NIK
        NikLabel = new JLabel("NIK");
        NikLabel.setBounds(20, 50, 50, 15);
        this.add(NikLabel);

        NikText = new JTextField(100);
        NikText.setBounds(150, 50, 350, 20);
        this.add(NikText);

        //nama
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 80, 50, 15);
        this.add(namaLabel);

        namaText = new JTextField(100);
        namaText.setBounds(150, 80, 350, 20);
        this.add(namaText);

        //Alamat
        alamatLabel = new JLabel("Alamat");
        alamatLabel.setBounds(20, 110, 50, 15);
        this.add(alamatLabel);

        alamatText = new JTextField(100);
        alamatText.setBounds(150, 110, 350, 20);
        this.add(alamatText);

        //Jenis Kelamin
        jenisKelaminLabel = new JLabel("Jenis Kelamin");
        jenisKelaminLabel.setBounds(20, 140, 100, 15);
        this.add(jenisKelaminLabel);

        priaRadio = new JRadioButton("Laki-Laki");
        priaRadio.setBounds(150, 140, 100, 20);
        this.add(priaRadio);

        perempuanRadio = new JRadioButton("Perempuan");
        perempuanRadio.setBounds(150, 170, 100, 20);
        this.add(perempuanRadio);

        ButtonGroup kelamin = new ButtonGroup();
        kelamin.add(priaRadio);
        kelamin.add(perempuanRadio);

        //Tanggal Lahir
        tanggalLabel = new JLabel("Tanggal Lahir");
        tanggalLabel.setBounds(20, 200, 150, 15);
        this.add(tanggalLabel);

        String []Tanggal = {"Tanggal", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
            "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        tanggalCombo = new JComboBox(Tanggal);
        tanggalCombo.setBounds(150, 200, 100, 20);
        this.add(tanggalCombo);

        //Tombol Bulan Lahir
        String[] bulan = {"Bulan", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        bulanCombo = new JComboBox(bulan);
        bulanCombo.setBounds(275, 200, 100, 20);
        this.add(bulanCombo);

        //Tombol Tahun Lahir
        String[] tahun = {"Tahun", "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908",
            "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918",
            "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928",
            "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938",
            "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948",
            "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958",
            "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968",
            "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978",
            "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988",
            "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
            "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018"};
        tahunCombo = new JComboBox(tahun);
        tahunCombo.setBounds(400, 200, 100, 20);
        this.add(tahunCombo);

         //Tombol Simpan
        saveButton = new JButton("SIMPAN");
        saveButton.setBounds(240, 300, 80, 30);
        this.add(saveButton);
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        try {
            pasien psn = new pasien();
            psn.setNama(namaText.getText());
            psn.setAlamat(alamatText.getText());
            psn.setNik(NikText.getText());
//                int tanggal = Integer.valueOf(tanggalButton.getSelectedItem().toString());
//                    int bulan = Integer.valueOf(bulanButton.getSelectedItem().toString());
//                    int tahun = Integer.valueOf(tahunButton.getSelectedItem().toString());
//                    pasien.setTanggalLahir(tanggal);
//                    pasien.setBulanLahir(bulan);
//                    pasien.setTahunLahir(tahun);
//                    String namaKlinik = String.valueOf(klinikButton.getSelectedItem().toString());
//                    klinik.setNama(namaKlinik);
            pasien.tambahPasien(psn);
            JOptionPane.showMessageDialog(null, "Data Telah Ditambahkan");

            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(DaftarPasienBaru.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
