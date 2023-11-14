/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10;

/**
 *
 * @author kurao
 */
public class Average {

    public static void avg(int[] arr) {
        int totalNum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalNum += arr[i];
        }

        double average = totalNum / arr.length;

        System.out.println("Avrage is : " + average);

    }

}
