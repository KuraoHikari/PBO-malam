/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author kuraohikari
 */
public class Segitiga {
    private int alas;

    private int tinggi;

    private double luas;


    public void setAlas(int a){

        if (a > 0){

            this.alas = a;

        } else {

            this.alas = 0;
        }

    }

    public void setTinggi(int t){

        if (t > 0){

            this.tinggi = t;

        } else {

            this.tinggi = 0;

        }

    }

    public double getLuas(){

        // hitung luasnya

        this.luas = this.alas * this.tinggi *0.5;

        return this.luas;

    }
    
    public static void main(String[] args) {
        Segitiga segitigaA = new Segitiga();
        segitigaA.setAlas(5);
        segitigaA.setTinggi(8);
        System.out.println(segitigaA.getLuas());
        
    }

}



