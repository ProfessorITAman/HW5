package HW5.general.version_1templates.general_1.general_1;

import HW5.general.version_1templates.general_1.templates_1.Boss;
import HW5.general.version_1templates.general_1.templates_1.Hero;

public class Main_1 {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(600);
        boss.setDamage(50);
        boss.setDefenceType("Magical");
        System.out.println("Boss stats:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defence Type: " + boss.getDefenceType());

        Hero[] heroes = createHeroes();
        System.out.println("Heroes stats:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() +
                    ", Damage: " + hero.getDamage() +
                    ", Super Power: " + hero.getSuperPower());
        }
    }
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(270, 20, "Physical");
        Hero hero2 = new Hero(260, 15);
        Hero hero3 = new Hero(250, 10, "Kinetic");

        return new Hero[]{hero1, hero2, hero3};
    }
}
