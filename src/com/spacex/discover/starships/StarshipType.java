package com.spacex.discover.starships;

public enum StarshipType {

    FIGHTER("Fighter"), FRIGATE("Frigate"), CRUISER("Cruiser"),
    FREIGHTER("Freighter"), WORLDSHIP("WorldShip");

    final String name;

    StarshipType (String name) {
        this.name = name;
    }

}
