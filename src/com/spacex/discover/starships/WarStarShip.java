package com.spacex.discover.starships;

import com.spacex.discover.TonnageExceededException;

public class WarStarShip extends Starship {

    private boolean isWeaponsDisabled;

    public WarStarShip(StarshipType type) {

        super(type);

        maxTonnage = switch (type) {
            case FRIGATE -> 50;
            case CRUISER -> 100;
            default -> 0;

        };

    }

    public int loadCargo(int incomingCargo) throws TonnageExceededException {

        if (type.equals("Hunter") || crewMemberCount < 12) {

            return incomingCargo;

        } else {

            int cargoPerMember = 2 * crewMemberCount;
            int availableCapacity = maxTonnage - currentTonnage;
            int cargoToLoad = Math.min(cargoPerMember, availableCapacity);

            if (incomingCargo > cargoToLoad) {

                currentTonnage = maxTonnage;
                int tonnageExceeded =  incomingCargo - cargoToLoad;
                throw new TonnageExceededException(tonnageExceeded);

            } else {

                currentTonnage += incomingCargo;
                return 0;

            }
        }
    }

    public void attack(Starship target, String weapon, int durationMinutes) {

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

    public void disableWeapons() {
        isWeaponsDisabled = true;
        System.out.println("Weapons of " + type + " : disabled");
    }

    public void enableWeapons() {
        isWeaponsDisabled = false;
        System.out.println("Weapons of " + type + " : enabled");
    }


    public void enableShield() {
        System.out.println("Shield Enabled - Starship type : " + type);
        disableWeapons();
    }

}