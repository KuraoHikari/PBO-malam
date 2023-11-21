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
public class ContohString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] namaku= new char[20];
        System.out.println("Masukan nama anda ");
        String nama = in.nextLine();

        System.out.println("Nama anda adalah " + nama.toUpperCase());
         System.out.println("Nama anda adalah " + nama.toLowerCase());
        
        for (int i = 0; i < nama.length(); i++) {
            namaku[i] = nama.charAt(i);
            
            if(i % 2 == 0){
                System.out.print(Character.toUpperCase(namaku[i]));
//                 System.out.println(nama.charAt(i));
            }else {
                System.out.print(Character.toLowerCase(namaku[i]));
            }
           
        }
         System.out.println(" ,Masukan nama2 anda ");
         String nama2 = in.nextLine();
         if(nama.compareTo(nama2)== 0){
             System.out.println("Sama");
         }else{
             System.out.println("Beda");
         }
        
    }
}
