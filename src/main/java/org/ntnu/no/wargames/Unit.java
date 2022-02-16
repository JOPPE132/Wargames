package org.ntnu.no.wargames;

/**
 * Superclass represents a Unit in a heritage hierarchy.
 */

public abstract class Unit {

    private String name;
    private int health;
    private int armor;
    private int attack;

    protected Unit(String name, int health, int armor, int attack){
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.attack = attack;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getArmor(){
        return armor;
    }

    public int getAttack(){
        return attack;
    }

    public void setHealth(int newHealth){
        this.health = newHealth;
    }

    public int getAttackBonus(){
    }

    public int getResistBonus(){
    }
}
