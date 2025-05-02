package apprendreJava.universe;

public abstract class Planet {

    // Static class properties (shared across all planets)
    static String shape = "spherical";
    static int discoveredCount = 0;

    // Instance properties
    String name;
    long diameterKm;

    Atmosphere atmosphere;

    int totalVisitors = 0;
    Starship dockedStarship;

    // Constructor
    Planet(String name) {
        this.name = name;
        discoveredCount++;
    }

    // Static method
    static String expansion(double distanceInBillionsOfKm) {
        if (distanceInBillionsOfKm < 14) {
            return "Whoa, that's super fast!";
        } else {
            return "Am I dreaming or is that faster than light?";
        }
    }

    // Instance methods
    int revolution(int degrees) {
        return degrees / 360;
    }

    int rotation(int degrees) {
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
}