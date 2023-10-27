/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;


/**
 *
 * @author kuraohikari
 */
public class Lingkaran extends Bentuk{

    public double radius;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double Radius) {
        this.radius = Radius;
    }

    public double hitungLuas() {
        return 3.14 * radius * radius;
    }

    public void printInfo() {
        System.out.println("luas lingkaran = " + this.hitungLuas());
    }
    
    @Override
    protected void gambar() {
        System.out.println("Super class -> Lingkaran");
    }

    @Override
    protected void hapus() {
        System.out.println("Super class -> menghapus Lingkaran");
    }
}
