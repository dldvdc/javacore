package com.spacex.discover.starships;

import com.spacex.discover.TonnageExceededException;

public class CivilStarShip extends Starship{

    public CivilStarShip (StarshipType type) {

        super(type);
        maxTonnage = switch (type) {
            case FREIGHTER -> 500;
            case WORLDSHIP -> 2000;
            default -> 0;
        };
    }

    public int loadCargo(int incomingCargo) throws TonnageExceededException {

        int availableCapacity = maxTonnage - currentTonnage;

        if (incomingCargo > availableCapacity) {
            currentTonnage = maxTonnage;
            int tonnageExceeded =  incomingCargo - availableCapacity;
            throw new TonnageExceededException(tonnageExceeded);

        } else {

            currentTonnage += incomingCargo;
            return 0;

        }
    }
}
