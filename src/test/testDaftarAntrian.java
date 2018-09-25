/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JFrame;
import view.DaftarAntrianDialog;

/**
 *
 * @author Personal
 */
public class testDaftarAntrian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DaftarAntrianDialog test = new DaftarAntrianDialog();
        test.setTitle("Daftar Antrian Pasien");
        test.setSize(500,500);
        test.setVisible(true);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
