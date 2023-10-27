/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author kuraohikari
 */
public class Pegawai {

    public String alamat;
    public String nama;
    public String jenisKelamin;
    public int umur;

    private double gaji;
    private int noTlpon;
  

    public Pegawai() {
        this.gaji = 1500000;
    }

    public void setNama(String Nama) {
        this.nama = Nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setGaji(double Gaji) {
        this.gaji = Gaji;
    }

    public double getGaji() {
        return this.gaji;
    }

    public void noTlpon(String NoTlpon) {
        this.nama = NoTlpon;
    }

    public int getNoTlpon() {
        return this.noTlpon;
    }

    public static void main(String[] args) {

    }

}
