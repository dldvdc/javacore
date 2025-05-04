package com.spacex.discover.astro;

import com.spacex.discover.starships.Starship;
import com.spacex.discover.starships.WarStarShip;

public class TerrestrialPlanet extends Planet implements Habitable {

    Starship[][] dockingBays;

    public TerrestrialPlanet(String name, int bayDockCount) {
        super(name);
        dockingBays = new Starship[bayDockCount][bayDockCount];
    }

    public boolean isDockAvailable(Starship inComingStarship) {

        int indexZone;

        switch (inComingStarship.type) {
            case FREIGHTER,WORLDSHIP -> indexZone = 1;
            default -> indexZone = 0;
        }

        for (int i = 0 ; i < dockingBays[indexZone].length ; i++) {

            if (dockingBays[indexZone][i] == null) {
                return true;
            }

        }
        return false;
    }



    public void dockStarShips(Starship... inComingStarShips) {

        for (int i = 0 ; i < inComingStarShips.length ; i++) {

            int indexZone;

            switch (inComingStarShips[i].type) {
                case FREIGHTER,WORLDSHIP -> indexZone = 1;
                default -> indexZone = 0;
            }

            if (inComingStarShips[i] instanceof WarStarShip) {
                ((WarStarShip) inComingStarShips[i]).disableWeapons();
            }

            for (int index = 0; index < dockingBays[indexZone].length; index++) {
                if (dockingBays[indexZone][index] == null) {
                    dockingBays[indexZone][index] = inComingStarShips[i];
                    break;
                }
            }

            totalVisitors += inComingStarShips[i].crewMemberCount;

        }

    }

}
