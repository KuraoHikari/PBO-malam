/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author kuraohikari
 */
public class Manager extends Pegawai {

    public String department;

    public static void main(String[] args) {
        Manager kurao = new Manager();

        kurao.nama = "KuraoHikari";
        kurao.alamat = "negari";
        kurao.jenisKelamin = "M";
        kurao.umur = 30;
        kurao.setGaji(50000000);
        kurao.department= "BOS";

        System.out.println("Nama " + kurao.getNama());
        System.out.println("Gaji " + kurao.getGaji());
        System.out.println("department " + kurao.department);

    }
}
