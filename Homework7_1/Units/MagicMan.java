package Homework7_1.Units;

public class MagicMan extends Hero { // маги
    protected int mana;
    protected int spell;

    public MagicMan(String name, String family, int attack, int health, int maxHealth, int[] damage,
            int armor, int mana, int spell) {
        super(name, family, attack, health, maxHealth, damage, armor);

    }
}
