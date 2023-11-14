/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10;

/**
 *
 * @author kurao
 */
public class bilanganPrima {

    static void bilPrima(int[] arr) {

        for (int i = 0; i <arr.length; i++) {
            int bil, cek = 0;

            bil = arr[i];
            for (int j = 2; j <= bil; j++) {
                if (bil % j == 0) {
                    cek++;
                }
            }

            if (cek == 1) {
                System.out.print(bil + ", ");
            }
        }

        System.out.println("");

    }

}
