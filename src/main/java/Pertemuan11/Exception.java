/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan11;

import java.util.Scanner;

/**
 *
 * @author kurao
 */
public class Exception {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Masukan 2 nilai integer");
            int bil1 = in.nextInt();
            int bil2 = in.nextInt();
            int hasil = bil1 / bil2;
            System.out.println("Hasil Pembagian " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Tidak Boleh Membagi nol");
        }

    }
}
