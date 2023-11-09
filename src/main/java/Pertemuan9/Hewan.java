/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author kuraohikari
 */
public class Hewan {
    public static void main(String[] args) {
        Cat pusy = new Cat();
        pusy.sound();
        pusy.walk();
        pusy.tampilInfo();
        
        Chicken wilson = new Chicken();
        wilson.walk();
        wilson.sound();
        wilson.tampilInfo();
        
    }
}
