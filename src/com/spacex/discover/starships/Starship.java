package com.spacex.discover.starships;

import com.spacex.discover.TonnageExceededException;

public abstract class Starship {

    public final StarshipType type;
    public int crewMemberCount;

    public int armor;
    public int shieldResistanceTime;

    protected int currentTonnage = 0;

    public int maxTonnage;

    Starship(StarshipType type) {
        this.type = type;
    }

    public abstract int loadCargo(int incomingCargo) throws TonnageExceededException;

    public void enableShield() {
        System.out.println("Shield Enabled - Starship type : " + type);
    }

    public void disableShield() {
        System.out.println("Shield Disabled - Starship type : " + type);
    }



}