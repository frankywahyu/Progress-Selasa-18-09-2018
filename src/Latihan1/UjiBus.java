/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author ASUS
 */
public class UjiBus {
   
    public static void main(String [] args){
        //membuat objek busmini dari kelas bus
        Bus busMini = new Bus();
        //memasukan jumlah penumpang dan penumpang maksimal ke dalam 
        //objek bus mini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        //memanggil method cetak pada class bus
        busMini.cetak();
        //menambahkan penumpang pada bus mini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelas bus
        busMini.cetak();
        //mengurangi jumlah penumpang pada bus mini
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        //menambahkan jumlah penumpang pada bus mini
        busMini.penumpang = busMini.penumpang + 5;
        busMini.cetak();
    }
}


