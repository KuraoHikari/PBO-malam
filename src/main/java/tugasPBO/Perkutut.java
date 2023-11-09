/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPBO;

/**
 *
 * @author kuraohikari
 */
public class Perkutut extends Hewan {

    public Perkutut() {
        super("perkutut", 2, true);
    }

    @Override
    public void bersuara() {
        System.out.println("\ncuit, cuit, cuit");
    }

    public static void main(String[] args) {
        Perkutut p = new Perkutut();
        p.isHewan();
        p.bersuara();
    }
}
