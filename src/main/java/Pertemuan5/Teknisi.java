/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author kuraohikari
 */
public class Teknisi extends Pegawai {

    public String keahlian;

    public static void main(String[] args) {
        Teknisi hikari = new Teknisi();

        hikari.setNama("Hikari");
        hikari.alamat = "negari";
        hikari.jenisKelamin = "M";
        hikari.umur = 30;
        hikari.setGaji(50000000);
        hikari.keahlian = "Bikin bom";

        System.out.println("Nama " + hikari.getNama());
        System.out.println("Gaji " + String.format("%.2f", hikari.getGaji()));
        System.out.println("keahlian " + hikari.keahlian);

    }
}
