/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.istack.internal.logging.Logger;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
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
    private JComboBox tahunCombo;
    private JButton tambahButton;
    private String ArrayTanggal[] = {"Tanggal", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
        "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private String ArrayBulan[] = {"Bulan", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    private String ArrayTahun[] = {"Tahun", "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1970", "1971", "1972", "1973", "1974", "1975",
        "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932",
        "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949",
        "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969",
        "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985",
        "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994",
        "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2005", "2006", "2007", "2008", "2009", "2010"};

    JLabel judulLabel;
    JLabel namaLabel;
    JLabel alamatLabel;
    JLabel tanggalLabel;
    JLabel NikLabel;
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
        judulLabel = new JLabel("Formulir Pendaftaran Pasien Baru");
        judulLabel.setFont(new Font(null, Font.CENTER_BASELINE, 20));
        judulLabel.setBounds(50, 20, 250, 80);
        this.add(judulLabel);

        namaLabel = new JLabel("Nama: ");
        namaLabel.setBounds(20, 90, 100, 20);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(120, 90, 100, 30);
        this.add(namaText);

        priaRadio = new JRadioButton("Pria");
        priaRadio.setBounds(120, 120, 100, 30);
        this.add(priaRadio);

        perempuanRadio = new JRadioButton("Wanita");
        perempuanRadio.setBounds(220, 120, 100, 30);
        this.add(perempuanRadio);

        ButtonGroup ButtonKelamin = new ButtonGroup();
        ButtonKelamin.add(priaRadio);
        ButtonKelamin.add(perempuanRadio);

        JComboBox tanggalCombo = new JComboBox(ArrayTanggal);
        tanggalCombo.setBounds(120, 150, 100, 30);
        this.add(tanggalCombo);

        JComboBox bulanCombo = new JComboBox(ArrayBulan);
        bulanCombo.setBounds(230, 150, 100, 30);
        this.add(bulanCombo);

        JComboBox tahunCombo = new JComboBox(ArrayTahun);
        tahunCombo.setBounds(340, 150, 100, 30);
        this.add(tahunCombo);

        tanggalLabel = new JLabel("Tanggal Lahir");
        tanggalLabel.setBounds(20, 150, 100, 30);
        this.add(tanggalLabel);

        alamatLabel = new JLabel("Alamat: ");
        alamatLabel.setBounds(20, 190, 100, 30);
        this.add(alamatLabel);

        alamatText = new JTextField();
        alamatText.setBounds(120, 190, 100, 30);
        this.add(alamatText);

        NikLabel = new JLabel("NIK");
        alamatLabel.setBounds(120, 230, 100, 30);
        this.add(alamatLabel);

        NikText = new JTextField();
        NikText.setBounds(120, 190, 100, 30);
        this.add(NikText);

        saveButton = new JButton("SIMPAN");
        saveButton.setBounds(120, 350, 100, 30);
        this.add(saveButton);
        saveButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == saveButton) {
            pasien baru = new pasien();
            baru.setNama(namaText.getText());
            baru.setAlamat(alamatText.getText());
            baru.setNik(NikText.getText());
            pasien.tambahPasien(baru);
            JOptionPane.showMessageDialog(null, "Data Telah Ditambahkan");

            this.dispose();

        }

    }
}
