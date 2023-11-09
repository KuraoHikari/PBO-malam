/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author kuraohikari
 */
public class Cat extends Animal{

    public Cat() {
        super(4, "oren");
    }
    
    @Override
    public void walk() {
        System.out.println("Cat walks using 4v legs");
    }

    @Override
    public void sound() {
        System.out.println("Miawwww");
    }

    @Override
    public void bernafas() {
         System.out.println("huuuu haaaa");
    }

}
