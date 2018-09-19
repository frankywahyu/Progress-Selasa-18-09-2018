/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author ASUS
 */
public class UjiBus3 {
    public static void main(String [] abc){
        Bus3 Bus = new Bus3(5);
        Bus.getPenumpang(17);
        Bus.getPenumpang(24);
        Bus.cetakPenumpang();
        //Penambahan Penumpang
        Bus.addPenumpang(2);//Tambah 2 penumpang
        Bus.cetakPenumpang();
        //Penambahan Penumpang
        Bus.addPenumpang(1);//Tambah 1 Penumpang
        Bus.cetakPenumpang();
        //Penambahan Penumpang
        Bus.addPenumpang(2);//Tambah 2 Penumpang
        Bus.cetakPenumpang();
        //Penambahan Penumpang
        Bus.addPenumpang(2);//Tambah 2 Penumpang
        Bus.cetakPenumpang();
    }
}
