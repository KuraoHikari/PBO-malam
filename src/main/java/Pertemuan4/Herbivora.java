/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author kuraohikari
 */
public class Herbivora extends Hewan{
    public static void main(String[] args) {
        Herbivora jangkrik = new Herbivora();
        jangkrik.nama = "steven";
        
        jangkrik.bernafas("trakea");
        jangkrik.makan();
        jangkrik.minum();
        jangkrik.detailHewan();
    }
    
}
