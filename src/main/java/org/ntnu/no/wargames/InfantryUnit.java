package org.ntnu.no.wargames;

public class InfantryUnit extends Unit {

    public InfantryUnit(String name, int health, int attack, int armor){

        super(name, health);
        attack = 15;
        armor = 10;
    }


}
