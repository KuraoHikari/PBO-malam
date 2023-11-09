/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author kuraohikari
 */
public abstract class Animal {

    private int numOfFoots;
    private String color;

    public Animal(int num, String color) {
        this.numOfFoots = num;
        this.color = color;
    }

    public abstract void walk();

    public abstract void sound();

    public abstract void bernafas();

    public void tampilInfo() {
        System.out.println("Jumlah kaki adalah " + numOfFoots + "warnanya adalah" + color);
    }
}
