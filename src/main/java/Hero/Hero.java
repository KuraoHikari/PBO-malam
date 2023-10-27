/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hero;

/**
 *
 * @author kuraohikari
 */
public class Hero {

    private String name;
    private String ability;
    private int strength;

    public Hero(String Name, String Ability, int Strength) {
        this.name = Name;
        this.ability = Ability;
        this.strength = Strength;
    }

    public Hero(String RealName, String Ability) {
        this(RealName, Ability, 0);
    }

    public Hero(String RealName) {
        this(RealName, "Uknown", 0);
    }

    public String getName() {
        return "Hero name : " + this.name;
    }

    public String getAbility() {
        return "Hero Ability : " + this.ability;
    }

    public String getStrength() {
        return "Hero Strengh : " + this.strength;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void setAbility(String Ability) {
        this.ability = Ability;
    }

    public void setStrength(int Strength) {
        this.strength = Strength;
    }
}
