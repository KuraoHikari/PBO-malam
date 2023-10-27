/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author kuraohikari
 */
public class Silinder extends Lingkaran {

    public double tinggi;

    public Silinder(double Tinggi, int Radius, String Warna) {
        this.tinggi = Tinggi;
        this.radius = Radius;
        this.warna = Warna;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(double Tinggi) {
        this.tinggi = Tinggi;
    }

    public double hitungVolume() {
        return this.hitungLuas() * tinggi;
    }

    public void printInfo() {
        System.out.println("volume silinder = " + this.hitungVolume());
    }
}
