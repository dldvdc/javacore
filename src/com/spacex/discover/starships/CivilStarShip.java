package com.spacex.discover.starships;

public class CivilStarShip extends Starship{

    public CivilStarShip (StarshipType type) {

        this.type = type;
        maxTonnage = switch (type) {
            case FREIGHTER -> 500;
            case WORLDSHIP -> 2000;
            default -> 0;
        };
    }

    public int loadCargo(int incomingCargo) {

        int availableCapacity = maxTonnage - currentTonnage;

        if (incomingCargo > availableCapacity) {
            currentTonnage = maxTonnage;
            return incomingCargo - availableCapacity;

        } else {

            currentTonnage += incomingCargo;
            return 0;

        }
    }
}
