/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author kuraohikari
 */
public class Bentuk {

    public String warna;

    public Bentuk() {
        this.warna = "abu abu";
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String Warna) {
        this.warna = Warna;
    }

    public void getInfo() {
        System.out.println("Bentuk ini warnanya " + this.warna);
    }

    protected void gambar() {
        System.out.println("Super class -> menggambar");
    }

    protected void hapus() {
        System.out.println("Super class -> menghapus menggambar");
    }
}
