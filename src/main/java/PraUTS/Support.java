/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraUTS;

/**
 *
 * @author kuraohikari
 */
public class Support extends AnimeCharacter{
     private String role;
    private String hobi;
    private String characters;

    public Support(String name, int age, String genre, String description, String role, String hobi, String characters) {
        super(name, age, genre, description);
        this.role = role;
        this.hobi = hobi;
        this.characters = characters;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    @Override
    public void Interaction() {
        System.out.println("Karakter pendukung " + getName() + " berinteraksi dengan karakter lain dalam cerita Anime.");
    }
}
