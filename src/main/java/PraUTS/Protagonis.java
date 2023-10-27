/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraUTS;

/**
 *
 * @author kuraohikari
 */
public class Protagonis extends AnimeCharacter {
    private String weapon;
    private String dream;
    private String ability;

    public Protagonis(String name, int age, String genre, String description, String weapon, String dream, String ability) {
        super(name, age, genre, description);
        this.weapon = weapon;
        this.dream = dream;
        this.ability = ability;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getDream() {
        return dream;
    }

    public void setDream(String dream) {
        this.dream = dream;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    @Override
    public void Interaction() {
        System.out.println("Protagonis " + getName() + " berinteraksi dengan karakter lain dalam cerita Anime.");
    }
}
