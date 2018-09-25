/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JFrame;
import view.DaftarPasienBaru;

/**
 *
 * @author Personal
 */
public class testDaftarPasienBaru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DaftarPasienBaru test = new DaftarPasienBaru("Pasien Baru");
        test.setTitle("Daftar Pasien Baru");
        test.setSize(600, 500);
        test.setVisible(true);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
