/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10;

/**
 *
 * @author kurao
 */
public class ArraySample {

    public static void main(String[] args) {
        int[] ages = new int[100];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = i;
            if (i % 10 == 0) {
                System.out.println();
            }
            if (i % 2 != 0) {
                System.out.print(ages[i] + ", ");
            }
        }
         System.out.println();
        for (int i = 0; i < ages.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            if (i % 2 == 0) {
                System.out.print(ages[i] + ", ");
            }
        }
    }
}
