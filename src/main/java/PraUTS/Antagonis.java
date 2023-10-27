/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraUTS;

/**
 *
 * @author kuraohikari
 */
public class Antagonis extends AnimeCharacter {
    private String vilainesMoment;
    private String darkAbility;
    private String darkStory;

    public Antagonis(String name, int age, String genre, String description, String vilainesMoment, String darkAbility, String darkStory) {
        super(name, age, genre, description);
        this.vilainesMoment = vilainesMoment;
        this.darkAbility = darkAbility;
        this.darkStory = darkStory;
    }

    public String getVilainesMoment() {
        return vilainesMoment;
    }

    public void setVilainesMoment(String vilainesMoment) {
        this.vilainesMoment = vilainesMoment;
    }

    public String getDarkAbility() {
        return darkAbility;
    }

    public void setDarkAbility(String darkAbility) {
        this.darkAbility = darkAbility;
    }

    public String getDarkStory() {
        return darkStory;
    }

    public void setDarkStory(String darkStory) {
        this.darkStory = darkStory;
    }

    @Override
    public void Interaction() {
        System.out.println("Antagonis " + getName() + " berinteraksi dengan karakter lain dalam cerita Anime.");
    }
}
