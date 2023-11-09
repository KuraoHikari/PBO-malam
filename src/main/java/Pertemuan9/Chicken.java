/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author kuraohikari
 */
public class Chicken extends Animal{

     public Chicken() {
        super(4, "oren");
    }

    @Override
    public void walk() {
        System.out.println("Chicken walks using 2 legs");
    }

    @Override
    public void sound() {
        System.out.println("Wilson lo siento");
    }

    @Override
    public void bernafas() {
         System.out.println("Berkokok");
    }
}
