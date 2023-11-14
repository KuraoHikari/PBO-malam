/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10;

/**
 *
 * @author kurao
 */
public class matriks {

    public static void main(String[] args) {
        int[][] nilai = {{10, 12}, {11, 14}};
        int[][] nilai2 = {{12, 13}, {14, 15}};

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + nilai2[i][j]+ " ");
            }
            System.out.println("");

        }
           
    }
}
