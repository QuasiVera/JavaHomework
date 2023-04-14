package Homework7_1.Units;

public class Infantry extends Hero{
    protected int tool; // оружие
    protected int luck; // удача

    public Infantry(String name, String family, int attack, int health, int maxHealth, int[] damage,
            int armor, int tool, int luck) {
        super(name, family, attack, health, maxHealth, damage, armor);

    }
}

