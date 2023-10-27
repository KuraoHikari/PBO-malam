/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraUTS;

/**
 *
 * @author kuraohikari
 */
public class UniqueCreature extends AnimeCharacter {

    private String Looks;
    private String ability;
    private String lifeIn;

    public UniqueCreature(String name, int age, String genre, String description, String Looks, String ability, String lifeIn) {
        super(name, age, genre, description);
        this.Looks = Looks;
        this.ability = ability;
        this.lifeIn = lifeIn;
    }

    public String getLooks() {
        return Looks;
    }

    public void setLooks(String Looks) {
        this.Looks = Looks;
    }

    public String getAbility() {
        return ability;
    }
    
     public void setAbility(String Ability) {
         this.ability = Ability;
    }

    public String getLifeIn() {
        return lifeIn;
    }

    public void setLifeIn(String lifeIn) {
        this.lifeIn = lifeIn;
    }

    @Override
    public void Interaction() {
        System.out.println("Makhluk Fantastis " + getName() + " berinteraksi dengan karakter lain dalam cerita Anime.");
    }
}
