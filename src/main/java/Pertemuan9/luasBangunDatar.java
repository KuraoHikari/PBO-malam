/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author kuraohikari
 */
public class luasBangunDatar {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        segitiga.alas  = 20;
        segitiga.tinggi = 30;
        
        System.out.println("Luas Segitiga =" + segitiga.hitungLuas() + " Keliling segitiga " + segitiga.hitungLuas());
        
         PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang  = 20;
        persegiPanjang.lebar = 30;
        
        System.out.println("Luas persegiPanjang =" + persegiPanjang.hitungLuas() + " Keliling persegiPanjang " + persegiPanjang.hitungLuas());
                
    }
}
