/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPBO;

/**
 *
 * @author kuraohikari
 */
class SpongeBob extends Hewan implements Manusia {

    public SpongeBob() {
        super("sponge bob", 2, false);
    }

    @Override
    public void bersuara() {
        System.out.println("\nhallo patrict..");
    }

    @Override
    public void menyanyi() {
        System.out.println("nye, nye, nye, wik, wik, wik");
    }

    @Override
    public void ketawa() {
        System.out.println("kek, kek, kek");
    }

    public static void makan() {
        System.out.println("uenak tenan..");
    }

    public void makan2() {
        Hewan.makan();
    }

    public static void main(String[] args) {
        SpongeBob s = new SpongeBob();
        s.isHewan();
        s.bersuara();
        s.menyanyi();
        s.ketawa();
        s.makan2();
        Hewan.makan();
        makan();

    }
}