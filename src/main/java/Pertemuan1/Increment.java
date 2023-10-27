/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author dodiaditya
 */
public class Increment {

    public static void main(String[] args) {
        int a = 4;

        System.out.println("Nilai a = " + a);

        System.out.println("Nilai a menjadi = " + (a++));
        System.out.println("Nilai a menjadi = " + (++a));

        System.out.println("Nilai a menjadi = " + (a--));
        System.out.println("Nilai a menjadi = " + (--a));
    }
}
