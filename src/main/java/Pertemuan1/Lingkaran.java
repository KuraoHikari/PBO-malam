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
public class Lingkaran {
    public static void main(String[] args) {
        int jariJari = 10;
        
        double hasilKeliling = keliling(jariJari);
        System.out.println("Hasil keliling lingkaran dengan jari-jari 10 = " + hasilKeliling);
        
        double hasilLuas = luas(jariJari);
        System.out.println("Hasil luas lingkaran dengan jari-jari 10 = " + hasilLuas);
    }
    
    public static double keliling(int jariJari) {
        return 2 * Math.PI * jariJari;
    }
    
    public static double luas(int jariJari) {
        return Math.PI * jariJari * jariJari;
    }
}
