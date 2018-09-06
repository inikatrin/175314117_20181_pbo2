/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Personal
 */
public class DaftarAntrianDialog extends JDialog {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel noRekamMedis;
    private JLabel alamat;
    private JTextField namaText;
    private JButton saveButton;

    public DaftarAntrianDialog() {
        init();
    }

    public void init() {
        this.setLayout(null);
        judulLabel = new JLabel("DAFTAR PASIEN");
        judulLabel.setBounds(100, 25, 150, 25);
        this.add(judulLabel);

        noRekamMedis = new JLabel("No RM");
        noRekamMedis.setBounds(20, 70, 50, 20);
        this.add(noRekamMedis);

        namaText = new JTextField();
        namaText.setBounds(115, 72, 150, 20);
        this.add(namaText);

        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 120, 50, 20);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(115, 120, 150, 20);
        this.add(namaText);

        alamat = new JLabel("Alamat");
        alamat.setBounds(20, 170, 50, 20);
        this.add(alamat);

        namaText = new JTextField();
        namaText.setBounds(115, 168, 150, 20);
        this.add(namaText);

        saveButton = new JButton("SIMPAN");
        saveButton.setBounds(120, 250, 80, 25);
        this.add(saveButton);
    }
}
