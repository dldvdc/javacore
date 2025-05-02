package apprendreJava.universe;

public class Starship {

    String type;
    int crewMemberCount;

    int armor;
    int shieldResistanceTime;

    void enableShield() {
        System.out.println("Shield Enabled - Starship type : " + type);
    }

    void disableShield() {
        System.out.println("Shield Disabled - Starship type : " + type);
    }


}