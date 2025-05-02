package apprendreJava.universe;

public class WarStarShip extends Starship {

    boolean isWeaponsDisabled;

    void attack(Starship target, String weapon, int durationMinutes) {

        if (isWeaponsDisabled) {
            System.out.println("Attack Failed : weapons are disabled");
        }

        else {

            System.out.println("A " + this.type + " starship attacks a " + target.type +
                    " using " + weapon + " for " + durationMinutes + " minutes...");

            // Reduce the target's shield resistance time
            target.shieldResistanceTime -= durationMinutes;

            if (target.shieldResistanceTime < 0) {
                target.shieldResistanceTime = 0;
            }

            // Reduce the target's armor by half
            target.armor /= 2;

        }

    }

    void disableWeapons() {
        isWeaponsDisabled = true;
        System.out.println("Wepons of " + type + " : disabled");
    }


    void enableShield() {
        System.out.println("Shield Enabled - Starship type : " + type);
        disableWeapons();
    }

}