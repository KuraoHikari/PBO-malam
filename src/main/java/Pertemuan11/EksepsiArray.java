/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan11;

/**
 *
 * @author kurao
 */
public class EksepsiArray {

    public static void main(String[] args) {
        String c[] = {"a", "b", "c"};
        int b;
        try {
            b = 5 / 0;

            System.out.println(c[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index melebihi kapasitas");
        } catch (ArithmeticException e) {
            System.out.println("pembagian dengan nol itu haramS");
        }
    }
}
