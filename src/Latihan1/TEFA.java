/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class TEFA {

    public static String Nama, tempatLahir, jenisKelamin, alamat, Motto, tanggalLahir,nis;
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        isi();
        tampil();
        // TODO code application logic here
    }

    static void isi() {

       
        Nama = (JOptionPane.showInputDialog("Nama    :"));
        nis = (JOptionPane.showInputDialog("NIS  :"));
        tempatLahir = (JOptionPane.showInputDialog("Tempat Lahir    :"));
        tanggalLahir = (JOptionPane.showInputDialog("Tanggal Lahir (Tgl/Bln/Thn):"));
        jenisKelamin = (JOptionPane.showInputDialog("Jenis Kelamin :"));
        alamat = (JOptionPane.showInputDialog("Alamat Di Malang  :"));
        Motto = (JOptionPane.showInputDialog("Motto Hidup   :"));
    }

    static void tampil() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("====================");
        System.out.println("   Biodata Diri      ");
        System.out.println("====================");
        System.out.println(" ");
        System.out.println("Nama              :" + Nama);
        System.out.println("NIS               :" + nis);
        System.out.println("Tempat Lahir      :" + tempatLahir);
        System.out.println("Tanggal Lahir     :" + tanggalLahir);
        System.out.println("Jenis Kelamin     :" + jenisKelamin);
        System.out.println("Alamat Di Malang  :" + alamat);
        System.out.println("Motto Hidup       :" + Motto);
    }

}
