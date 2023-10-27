/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author kuraohikari
 */
public class HitungBangun {

    public static void main(String[] args) {
        BujurSangkar bs = new BujurSangkar();

        bs.setSisi(20);
        bs.printInfo();

        Lingkaran lingkaran = new Lingkaran();

        lingkaran.setRadius(20);
        //lingkaran.hitungLuas();
        lingkaran.printInfo();
        
        Silinder silinder = new Silinder(2,20,"biru");
        
        silinder.printInfo();
    }

}
