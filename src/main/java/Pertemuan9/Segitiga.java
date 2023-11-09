/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author kuraohikari
 */
public class Segitiga implements BangunDatar{
   int alas, tinggi;

    @Override
    public double hitungLuas() {
        return 0.5 * this.alas * this.tinggi;
    }

    @Override
    public double hitungKeliling() {
        return alas * tinggi;
    }

    
}
