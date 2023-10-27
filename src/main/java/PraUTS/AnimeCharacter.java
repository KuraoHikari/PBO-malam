/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraUTS;

/**
 *
 * @author kuraohikari
 */
public class AnimeCharacter {
    private String name;
    private int age;
    private String gendre;
    private String description;

    public AnimeCharacter(String name, int age, String gendre, String description) {
        this.name = name;
        this.age = age;
        this.gendre = gendre;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGenre() {
        return gendre;
    }

    public void setGenre(String gendre) {
        this.gendre = gendre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void Interaction() {
        System.out.println(name + " berinteraksi dengan karakter lain dalam cerita Anime.");
    }

}
