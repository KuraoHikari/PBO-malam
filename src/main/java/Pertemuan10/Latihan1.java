/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10;

/**
 *
 * @author kurao
 */
public class Latihan1 {

    public static void main(String[] args) {
        int arr[] = {23, 6, 47, 35, 2, 14};
        Sort.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");

        Average.avg(arr);
        
        MinMax.minMAx(arr);
        ShowGanjil.showGanjil(arr);
        bilanganPrima.bilPrima(arr);

    }

}
