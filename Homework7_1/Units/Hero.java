package Homework7_1.Units;

public class Hero {
    /*   Создать иерархию классов для персонажей
     *  Крестьянин	Разбойник	Снайпер	Колдун
        копейщик	арбалетчик	монах
       
     */

   protected String name;
   protected String family; // раса
   protected int attack;
   protected int health;
   protected int maxHealth;
   protected int[] damage;
   protected int armor; // броня

 
   public Hero(String name, String family, int attack,  int health, int maxHealth, int[] damage, int armor) {
      this.name = name;
      this.family = family;
      this.attack = attack;
      this.health = health;
      this.maxHealth = maxHealth;
      this.damage = damage;
      this.armor = armor;

   }


   public int move(int coordinate) {
      return coordinate++;
   }

   public int hit() {   //атака
      return 4;
   }

   public int protection() { //защита
      return 4;
   }

   public int maxDamage() { // нанесение урона
      return 4;
   }





}
