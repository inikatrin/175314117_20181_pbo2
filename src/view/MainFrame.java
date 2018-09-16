/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import static org.omg.CORBA.ORB.init;

/**
 *
 * @author Personal
 */
public class MainFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    //Mendeklarasikan attribut menuBar dengan tipe data JMenuBar
    JMenu fileMenu;
    //Mendeklarasikan attribut fileMenu dengan tipe data fileMenu
    JMenuItem exitMenuItem;
    //Mendeklarasikan attribut exitMenuItem dengan tipe data JMenuItem
    JMenuItem tambahPasien;
    JMenuItem tambahAntrian;

    public MainFrame() {
        init();
    }

    public void init() {
        menuBar = new JMenuBar();
        //Membuat objek baru menuBar dengan tipe data JMenuBar
        this.setTitle("Main Frame");
        //Mengisi/Mengeset setTitle dengan "Main Frame"
        fileMenu = new JMenu("File");
        //Membuat objek baru fileMenu dengan tipe data JMenu dengan isi parameternya "File"
        exitMenuItem = new JMenuItem("Exit");
        //Membuat objek baru exitMenuItem dengan tipe data JMenuItem dengan isi parameter "Exit"
        tambahPasien = new JMenuItem("Tambah Pasien");
        tambahAntrian = new JMenuItem("Tambah Antrian");
        fileMenu.add(exitMenuItem);
        fileMenu.add(tambahPasien);
        fileMenu.add(tambahAntrian);
        //Menambahkan exitMenuItem pada fileMenu
        menuBar.add(fileMenu);

        //Menambahkan fileMenu pada menuBar
        this.setJMenuBar(menuBar);

        //Mengisi/Mengeset setJMenuBar dengan menuBar
        exitMenuItem.addActionListener(this);
        tambahPasien.addActionListener(this);
        tambahAntrian.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent aa) {
        if (aa.getSource() == exitMenuItem) {
//            DaftarAntrianDialog data = new DaftarAntrianDialog();
            System.exit(0);
        }
        if (aa.getSource() == tambahPasien) {
            DaftarPasienBaru test = new DaftarPasienBaru("Dialog Baru");
            test.setSize(600, 500);
            test.setVisible(true);
        }
        if (aa.getSource() == tambahAntrian) {
            DaftarAntrianDialog test = new DaftarAntrianDialog("Latihan Dialog");
            test.setSize(600, 500);
            test.setVisible(true);

        }
    }
}
