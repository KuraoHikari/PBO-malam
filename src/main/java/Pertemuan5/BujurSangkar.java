/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author kuraohikari
 */
public class BujurSangkar {

    public int sisi;

    public int getSisi() {
        return this.sisi;
    }

    public void setSisi(int Sisi) {
        this.sisi = Sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public void printInfo() {
        System.out.println("luas bujur sangkar =" + this.hitungLuas());
    }
}
