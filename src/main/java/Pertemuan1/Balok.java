/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author dodiaditya
 */
public class Balok {
    public static void main(String[] args) {
        int panjang = 20;
        int lebar = 12;
        int tinggi = 10;
        
        int hasilLuas = luas(panjang, lebar, tinggi);
        System.out.println("Luas = " + hasilLuas);
        
        int hasilVolume = volume(panjang, lebar, tinggi);
        System.out.println("Volume = " + hasilVolume);
    }
    
    public static int volume(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }
    
    public static int luas(int panjang, int lebar, int tinggi) {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (tinggi * lebar));
    }
}
