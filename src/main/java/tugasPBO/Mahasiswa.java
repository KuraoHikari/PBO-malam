/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPBO;

/**
 *
 * @author kuraohikari
 */

abstract class Mahasiswa {
    String nama;
    int nilai;

    public abstract void isiBiodata(String nama, int nilai);

    public void registrasi() {
        System.out.println(nama + " telah melakukan registrasi");
    }

    public void testMasuk() {
        System.out.println("nilai test anda " + nilai);
    }
}

