package com.spacex.discover.astro;

public abstract class Planet implements Comparable<Planet> {

    // Static class properties (shared across all planets)
    public  static String shape = "spherical";
    public static int discoveredCount = 0;

    // Instance properties
    public String name;
    public long diameterKm;
    public float distanceFromStar;

    public Atmosphere atmosphere;

    public int totalVisitors = 0;
    // Starship dockedStarship;

    // Constructor
    public Planet(String name) {
        this.name = name;
        discoveredCount++;
    }

    // Static method
    public static String expansion(double distanceInBillionsOfKm) {
        if (distanceInBillionsOfKm < 14) {
            return "Whoa, that's super fast!";
        } else {
            return "Am I dreaming or is that faster than light?";
        }
    }

    // Instance methods
    public int revolution(int degrees) {
        return degrees / 360;
    }

    public int rotation(int degrees) {
        return degrees / 360;
    }


    /*
    // Alternative methods if you want to support docking by type or crew count directly:

    void dockStarShip(int crewMemberCount) {
        totalVisitors += crewMemberCount;
    }

    void dockStarShip(String starshipType) {
        totalVisitors += switch (starshipType) {
            case "Fighter" -> 3;
            case "Frigate" -> 12;
            case "Cruiser" -> 50;
            default -> 0;
        };
    }
    */

    public int compareTo(Planet otherPlanet) {
        return Float.compare(this.distanceFromStar, otherPlanet.distanceFromStar);
    }


}