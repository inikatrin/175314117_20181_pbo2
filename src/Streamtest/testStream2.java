/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streamtest;

import java.io.File;
import model.pasien;

/**
 *
 * @author Personal
 */
public class testStream2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        pasien.bacaDaftarPasien(new File("daftar.txt"));
        for (int i = 0; i < pasien.getDaftarPasienKlinik().size(); i++) {
            System.out.println(pasien.getDaftarPasienKlinik().get(i).toString());
        }
    }

}
