package com.spacex.discover.starships;

public abstract class Starship {

    public StarshipType type;
    public int crewMemberCount;

    public int armor;
    public int shieldResistanceTime;

    public int currentTonnage = 0;

    public int maxTonnage;

    public abstract int loadCargo(int incomingCargo);

    public void enableShield() {
        System.out.println("Shield Enabled - Starship type : " + type);
    }

    public void disableShield() {
        System.out.println("Shield Disabled - Starship type : " + type);
    }



}