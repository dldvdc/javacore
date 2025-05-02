package apprendreJava.universe;

public class TerrestrialPlanet extends Planet implements Habitable{

    public TerrestrialPlanet(String name) {
        super(name);
    }

    public Starship dockStarShip(Starship incomingStarShip) {

        if (incomingStarShip instanceof WarStarShip) {
            ((WarStarShip) incomingStarShip).disableWeapons();
        }

        Starship outcomingStarShip = dockedStarship;

        totalVisitors += incomingStarShip.crewMemberCount;
        dockedStarship = incomingStarShip;

        return outcomingStarShip;

    }

}
