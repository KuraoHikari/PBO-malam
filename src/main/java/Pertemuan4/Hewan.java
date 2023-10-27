/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author kuraohikari
 */
public class Hewan {

    int JumlahKaki;
    int umur;

    String habitat;
    String warna;
    String nama;

    private String jenisKelamin;
    private String jenisMakanan;
    public Hewan(){
        this.nama = "roki";
        this.JumlahKaki= 0;
        this.umur = 99999;
        this.habitat = "bulan";
        this.warna = "blaku";
        this.jenisKelamin= "amerikano";
        this.jenisMakanan = "babi";
    }
    public void setNama(String Nama){
        this.nama = Nama;
    }
    public void getName(){
        System.out.println("manggil nama " + nama);
    }

    public static void main(String[] args) {
        Hewan anjing = new Hewan();
        anjing.bernafas("hidung");
        anjing.makan();
        anjing.minum();
        anjing.tidur();
        anjing.detailHewan();
        
        anjing.setNama("Michael");
        anjing.getName();
    }

    void bernafas(String nafas) {
        System.out.println("Hewan ini bernafas dengan " + nafas);
    }

    void makan() {
        System.out.println("Hewan ini jenis makanannya " + jenisMakanan);
    }

    void minum() {
        System.out.println("Hewan ini minum");
    }

    private void tidur() {
        System.out.println("Hewan juga bisa tidur");
    }
    
    public void detailHewan() {
        System.out.println("Nama Hewan " + nama + ", jenis Kelaminnya " + jenisKelamin + ", sudah berumur " + umur);
    }

}
